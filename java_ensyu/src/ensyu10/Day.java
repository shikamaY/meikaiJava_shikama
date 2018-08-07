package ensyu10;

import static java.util.Calendar.*;

import java.util.GregorianCalendar;

public class Day {
	// 年を入れる変数
	private int year = 1;
	// 月を入れる変数
	private int month = 1;
	// 日を入れる変数
	private int date = 1;

	// 閏年しか判定するクラスメソッド
	public static boolean isLeap(int checkYear) {
		// 判定結果を返す
		return checkYear % 4 == 0 && checkYear % 100 != 0 || checkYear % 400 == 0;
	}

	// 引数がない場合のコンストラクタ
	public Day() {
		// GregorianCalendarのインスタンス生成
		GregorianCalendar today = new GregorianCalendar();
		// 現在の年を取得
		this.year = today.get(YEAR);
		// 現在の月を取得
		this.month = today.get(MONTH) + 1;
		// 現在の日を取得
		this.date = today.get(DATE);

		// 入力値チェック
		checkDate();
	}

	// 引数が年の場合のコンストラクタ
	public Day(int year) {
		// 引数の値を代入
		this.year = year;
		// 入力値チェック
		checkDate();
	}

	// 引数が2つの場合のコンストラクタ
	public Day(int year, int month) {
		// 引数が1つのコンストラクタを実行
		this(year);
		// monthを代入
		this.month = month;

		// 入力値チェック
		checkDate();

	}

	// 引数が3つの場合のコンストラクタ
	public Day(int year, int month, int date) {
		// 引数が2つのコンストラクタを実行
		this(year,month);
		// dateを代入
		this.date = date;

		// 入力値チェック
		checkDate();

	}

	// 同じクラス型の引数を渡された場合
	public Day(Day d) {
		// 引数のそれぞれのクラス変数を代入する
		this(d.year,d.month,d.date);

		// 入力値チェック
		checkDate();
	}

	// yearを参照するメソッド
	public int getYear() {
		// yearを返却する
		return year;
	}

	// monthを参照するメソッド
	public int getMonth() {
		// monthを返却する
		return month;
	}

	// dateを参照するメソッド
	public int getDate() {
		// dateを返却する
		return date;
	}

	// yearを変更するメソッド
	public void setYear(int year) {
		// 引数を代入する
		this.year = year;
	}

	// monthを変更するメソッド
	public void setMonth(int month) {
		// 引数を代入する
		this.month = month;
	}

	// dateを変更するメソッド
	public void setDate(int date) {
		// 引数を代入する
		this.date = date;
	}

	// year,month,dateを変更するメソッド
	public void set (int year, int month, int date) {
		// 年を変更する
		this.year = year;
		// 月を変更する
		this.month = month;
		// 日を変更する
		this.date = date;
	}

	// 閏年か判定するメソッド
	public boolean isLeap() {
		// クラスメソッドを実行し判定
		return isLeap(year);
	}

	// 年月日から曜日を算出するメソッド
	public int dayOfWeek() {
		// 年を計算用の変数に代入
		int clacYear = year;
		// 月を計算用の変数に代入
		int clacMonth = month;

		// 1月または2月の場合
		if (clacMonth == 1 || clacMonth == 2 ) {
			// 年を1減らす
			clacYear--;
			// 月に12を加える
			clacMonth += 12;
		}
		// 計算結果を0～6で返却する（日～土）
		return (clacYear + clacYear / 4 - clacYear / 100 + clacYear / 400 + (13 * clacMonth + 8) / 5 + date) % 7;
	}

	// 月の入力値チェック
	public void checkDate() {
		// GregorianCalendarのインスタンス生成
		GregorianCalendar today = new GregorianCalendar();

		// 1月より小さい場合
		if (this.month < 1) {
			// 1月に修正
			this.month = 1;
		// 12月より大きい場合
		} else if (this.month > 12) {
			// 12月に修正
			this.month = 12;
		}
	    // 対象月の最大に日数を取得するため、月をセット
		today.set(MONTH, this.month + 1);
		// 最大日数を取得
		int maxDays = today.getActualMaximum(DATE);
    	// 1日より小さい場合
		if (this.date < 1) {
			// 1日に修正
			this.date = 1;
		// 月の最大日数より大きい場合
		} else if (this.date > maxDays) {
			// 最大日数に修正
			this.date = maxDays;
		}
	}
	// 年月日を比較して同じか判定するメソッド
	public boolean equalTo(Day d) {
		// それぞれの値を比較して、同じ場合はtrueを返す
		return year == d.year && month == d.month && date == d.date;
	}

	// 年月日と曜日を文字で表示するメソッド
	public String toString() {
		// 曜日の文字列を生成
		final String[] wd = {"日","月","火","水","木","金","土"};
		// 年月日と算出した曜日のインデックス番号を返却する
		return String.format("%04d年%02d月%02d日(%s)",year,month,date,wd[dayOfWeek()]);
	}
}
