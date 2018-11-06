package Ensyu11;

import static java.util.Calendar.*;

import java.util.GregorianCalendar;

public class DateId {
	// クラス変数の生成
	private static int counter;

	// 識別IDを入れる変数
	private int id;

	// クラスメソッドの実行
	static {
		// カレンダー用のインスタンスを生成
		GregorianCalendar today = new GregorianCalendar();
		// 年を取得
		int year = today.get(YEAR);
		// 月を取得
		int month = today.get(MONTH);
		// 日を取得
		int date = today.get(DATE);

		// 日付を表示する
		System.out.printf("今日は%04d年%02d月%02d日です。\n", year,month,date);
		// 識別ID用のカウンターを用意する
		counter = year * 1000000 + month * 10000 + date * 100;
	}

	// コンストラクタ
	public DateId() {
		// インスタンス生成時にカウンターを加算
		id = ++counter;
	}

	// IDを取得するメソッド
	public int getId() {
		// IDを返却する
		return id;
	}
}
