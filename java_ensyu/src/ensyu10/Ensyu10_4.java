package ensyu10;

/* 演習10-4
 * 日付クラス第4版を以下のように改良せよ
 * ・引数を受け取らないコンストラクタによるインスタンス生成時は、西暦1年1月1日で初期化するのではなくプログラム実行時の日付で初期化する
 * ・引数を受け取るコンストラクタには不正な値が指定された場合は、適当な値に調整する
 * さらに以下のメソッドを追加すること
 * 年内での経過日数を求めるメソッド
 * 年内の残り日数を求めるメソッド
 * 他の日付との前後関係を判定するメソッド
 * 日付をひとつ後ろに進めるメソッド
 * 次の日付を返却するメソッド
 * 日付をひとつ前に戻すメソッド
 * 前の日の日付を返却するメソッド
 * 日付をn日後ろに進めるメソッド
 * n日後の日付を返却するメソッド
 * 日付をn日前ろに進めるメソッド
 * n日前の日付を返却するメソッド
 */
public class Ensyu10_4 {

	public static void main(String[] args) {

		// 前後させる日数
		final int MOVE_DAY = 5;
		// 日付クラスのインスタンスを生成する
		Day today = new Day();
		// 生成したインスタンスの日付を取得する
		System.out.println("実行日:" + today.toString());

		// 誤った日付のインスタンスを生成する
		Day anotherDay = new Day(1991,13,33);
		// 日付が調整されているか確認する
		System.out.println("比較する日付:" + anotherDay.toString());

		// 日付の前後比較
		today.diffDate(anotherDay);

		// 日付を1日進める
		today.addOneAfter();
		// 日付を表示する
		System.out.println("1日進めた日付:" +today.toString());

		// 日付を1日戻す
		today.addOneBefor();
		// 日付を表示する
		System.out.println("1日戻した日付:" + today.toString());

		// 日付をn日進める
		today.addAfter(MOVE_DAY);
		// 日付を表示する
		System.out.println(MOVE_DAY + "日進めた日付:" + today.toString());

		// 日付をn日戻す
		today.addBefor(MOVE_DAY);
		// 日付を表示する
		System.out.println(MOVE_DAY + "日戻した日付:" + today.toString());

		// 1日後の日付を表示する
		System.out.println("1日後の日付:" + today.getOneAfterDay());
		// 1日前の日付を表示する
		System.out.println("1日前の日付" + today.getOneBeforDay());
		// n日後の日付
		System.out.println(MOVE_DAY + "日後の日付" + today.getAfterDay(MOVE_DAY));
		// n日前の日付
		System.out.println(MOVE_DAY + "日前の日付" +today.getBeforDay(MOVE_DAY));

	}

}
