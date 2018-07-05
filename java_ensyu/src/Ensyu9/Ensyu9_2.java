package Ensyu9;

/* 演習9-2
 * 日付クラス第3版を利用するプログラムを作成せよ。すべてのコンストラクタの働きを確認するようにすること
 */

public class Ensyu9_2 {

	public static void main(String[] args) {

		// 引数なしでEnsyu9_2_Day型のインスタンスを生成する
		Ensyu9_2_Day dateA = new Ensyu9_2_Day();

		// 年をセットする
		dateA.setYear(2018);
		// 月をセットする
		dateA.setMonth(7);
		// 日をセットする
		dateA.setDate(5);

		// dataAの年月日を出力する
		System.out.println(dateA.getYear() + "年" + dateA.getMonth() + "月" + dateA.getDate() + "日");

		// 年のみ引数に渡してEnsyu9_2_Day型のインスタンスを生成する
		Ensyu9_2_Day dateB = new Ensyu9_2_Day(2018);

		// dataBの年月日を出力する（※年以外は初期値の1が表示される）
		System.out.println(dateB.getYear() + "年" + dateB.getMonth() + "月" + dateB.getDate() + "日");


		// 年と月を渡してEnsyu9_2_Day型のインスタンスを生成する
		Ensyu9_2_Day dateC = new Ensyu9_2_Day(2018,6);

		// dataCの年月日を出力する（※日は初期値の1が表示される）
		System.out.println(dateC.getYear() + "年" + dateC.getMonth() + "月" + dateC.getDate() + "日");

		// 年と月を渡してEnsyu9_2_Day型のインスタンスを生成する
		Ensyu9_2_Day dateD = new Ensyu9_2_Day(2018,5,10);

		// dataDの年月日を出力する
		System.out.println(dateD.getYear() + "年" + dateD.getMonth() + "月" + dateD.getDate() + "日");

		// dataAを渡してEnsyu9_2_Day型のインスタンスを生成する
		Ensyu9_2_Day dateE = new Ensyu9_2_Day(dateA);

		// dateEの年月日を出力する
		System.out.println(dateE.getYear() + "年" + dateE.getMonth() + "月" + dateE.getDate() + "日");

		// dateAと同じか確認する
		System.out.println(dateE.equalTo(dateA));

		// 年月日と曜日を表示する
		System.out.println(dateE.toString());
	}

}
