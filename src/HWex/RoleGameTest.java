package HWex;
public class RoleGameTest {

	public static void main(String[] args) {
		Hero saber = new SwordMan("亞拉岡", 1, 0);
		Hero archer = new ArrowMan("勒苟拉斯", 1, 0);
		System.out.println("===========");
		System.out.println("【作業EX之二】");
		System.out.println("===========");
		saber.HeroData();
		saber.attack();
		saber.move();
		saber.defend();
		System.out.println("----------------");
		archer.HeroData();
		archer.attack();
		archer.move();
		archer.defend();
		System.out.println("----------------");
	}

}
