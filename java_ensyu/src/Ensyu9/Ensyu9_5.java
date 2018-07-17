package Ensyu9;

/* 演習9-5
 * 開始と終了日から構成される《期間》を表すクラスPeriodを作成せよ
 */
public class Ensyu9_5 {

	public static void main(String[] args) {
		// periodのインスタンスを生成
		Ensyu9_5_period fromTo = new Ensyu9_5_period(new Ensyu9_5_Day(2017,7,31), new Ensyu9_5_Day(2018,5,1));

		// それぞれの期間を表示
		System.out.println("開始日:" + fromTo.getFrom());
		// それぞれの期間を表示
		System.out.println("終了日;" + fromTo.getTo());

		// 開始日を再設定
		fromTo.newFrom(new Ensyu9_5_Day(2018,7,31));

		// 終了日を再設定
		fromTo.newTo(new Ensyu9_5_Day(2019,1,2));

		// 開始日と終了日をtoStringで表示
		System.out.println(fromTo);
	}

}
