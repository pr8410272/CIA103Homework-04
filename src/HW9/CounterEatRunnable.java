package HW9;

public class CounterEatRunnable implements Runnable {
		int counter = 1;
		String name;
		Thread t;

		public CounterEatRunnable(String nameX) { 
			this.name=nameX;
			t = new Thread(this, name); // 建構元內即同時建構執行緒
			t.start(); // 啟動執行緒
		} // 建構者函數
		

		
		public void run() { // 執行緒執行的地方
			while (counter < 11) {
				System.out.println(name+"吃第"+counter+"碗飯");
				counter++;
				if(counter ==11) {
					System.out.println(name+"吃完了!");
				}

				try {
					int r = (int)(Math.random()*2500+501);
					Thread.sleep(r); // 暫停0.5~3秒
				} catch (Exception e) {
				}
			}
		}

		public static void main(String arg[]) throws Exception{
			System.out.println("---------大胃王快食比賽開始 !---------");
			CounterEatRunnable r1 = new CounterEatRunnable("詹姆士");// 產生Runnable物件
			CounterEatRunnable r2 = new CounterEatRunnable("饅頭人");
			
			try {
			r1.t.join(); // 呼叫執行緒物件的start()方法(即啟動執行緒) , 隨即執行物件中的run方法
			r2.t.join();
			} catch (InterruptedException e) {
			}
			
			
			System.out.println("---------大胃王快食比賽結束 !---------");
 
}
}
