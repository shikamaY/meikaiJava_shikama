package Ensyu9;

public class Ensyu9_4 {

	public static void main(String[] args) {

		// 人間クラスのインスタンスを生成する
		Ensyu9_4_humans humanA = new Ensyu9_4_humans("humanA",170,60,new Ensyu9_4_Day(2018,07,31));

		// 誕生日を出力する
		System.out.println("誕生日:" + humanA.getBirthday());

		// 人間の情報を出力する
		System.out.println(humanA.toString());
	}

}
