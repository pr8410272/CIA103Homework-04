package HWex;

public abstract class Hero implements Interface{
	// 省略 getter/setter...
	
	private String name;
	private int level;
	private double exp;
	
	public Hero() {
		this("David", 1, 0);
	}
	
	public Hero(String name, int level, double exp) {
		this.name = name;
		this.level = level;
		this.exp = exp;
	}
	public void HeroData() {
		System.out.println(name);
		System.out.println("等級:"+level);
		System.out.println("經驗值:"+exp);
	}
}
