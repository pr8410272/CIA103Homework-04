package HW9;

class DepositAmount {
	private int deposit = 0; // 帳戶餘額

	synchronized public void MoneyTransfer(int AC) {
		while (deposit > 3000) {
			System.out.println("媽媽看到餘額在3000以上，暫停匯款");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		deposit += AC;
		System.out.println("媽媽存款" + AC + "，帳戶共有：" + deposit);
		notify();
	}

	synchronized public void Withdrawals(int AC) {
		while (deposit < AC) {
			System.out.println("熊大看到帳戶沒錢，暫停提款");
			System.out.println("媽媽被熊大要求匯款!");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		deposit -= AC;
		System.out.println("熊大領了" + AC + "，帳戶共有" + deposit);
		if (deposit <= 2000) {
			System.out.println("熊大看到餘額在2000以下，要求匯款");
			notify();
		}
	}
}

class Mom extends Thread {
	DepositAmount money;

	public Mom(DepositAmount money) {
		this.money = money;
	}

	public void run() {
		for (int i = 1; i <= 10; i++)
			money.MoneyTransfer(2000); // 每次匯款2000
	}
}

class Bear extends Thread {
	DepositAmount money;

	public Bear(DepositAmount money) {
		this.money = money;
	}

	public void run() {
		for (int i = 1; i <= 10; i++)
			money.Withdrawals(1000); // 每次提款1000
	}
}

public class LivingExpenses {
	public static void main(String[] args) {
		DepositAmount AC = new DepositAmount();
		Mom mom = new Mom(AC);
		Bear bear = new Bear(AC);
		mom.start();
		bear.start();
	}
}
