package Ensyu14;

public class Ensyu14_2 {

	public static void main(String[] args) {
		// ロボペットを生成
		RobotPet robotPet = new RobotPet("robo1","master1");

		System.out.println("ペット名:" + robotPet.getName() + "飼い主：" + robotPet.getMasterName() + ",色：" + robotPet.getSkin());
		// 自己紹介の実行
		robotPet.introduce();
		// 色を変える処理の実行
		robotPet.changeSkin("BLUE");
		// 自己紹介の実行
		robotPet.introduce();
		// 色を変える処理の実行
		robotPet.changeSkin("RED");
		// 自己紹介の実行
		robotPet.introduce();
		// 色を変える処理の実行
		robotPet.changeSkin("GREEN");
		// 自己紹介の実行
		robotPet.introduce();
		// 色を変える処理の実行
		robotPet.changeSkin("AAAAA");
		// 自己紹介の実行
		robotPet.introduce();
	}

}
