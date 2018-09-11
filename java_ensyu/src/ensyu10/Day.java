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

	// クラス内で共通で使用するため、インスタンス名を設定
	GregorianCalendar today;
	// 閏年しか判定するクラスメソッド
	public static boolean isLeap(int checkYear) {
		// 判定結果を返す
		return checkYear % 4 == 0 && checkYear % 100 != 0 || checkYear % 400 == 0;
	}

	// 引数がない場合のコンストラクタ
	public Day() {
		// GregorianCalendarのインスタンス生成
		today = new GregorianCalendar();
		// 現在の年を取得
		this.year = today.get(YEAR);
		// 現在の月を取得
		this.month = today.get(MONTH) + 1;
		// 現在の日を取得
		this.date = today.get(DATE);
	}

	// 引数が年の場合のコンストラクタ
	public Day(int year) {
		// GregorianCalendarのインスタンス生成
		today = new GregorianCalendar();
		// 年をセットする
		today.set(YEAR,year);
		// 引数の値を代入
		this.year = today.get(YEAR);
	}

	// 引数が2つの場合のコンストラクタ
	public Day(int year, int month) {
		// 引数が1つのコンストラクタを実行
		this(year);
		// 12月より大きい数字の場合
		if (month > 12) {
			// 12月をセット
			month = 12;
		// 1月より小さい数字の場合
		} else if (month < 1) {
			// 1月をセット
			month = 1;
		}
		// 月をセットする
		today.set(MONTH,month - 1);
		// 月を代入
		this.month = today.get(MONTH) + 1;
	}

	// 引数が3つの場合のコンストラクタ
	public Day(int year, int month, int date) {
		// 引数が2つのコンストラクタを実行
		this(year,month);
		// 年をセットする
		today.set(DATE,date);
		// dateを代入
		this.date = today.get(DATE);
	}

	// 同じクラス型の引数を渡された場合
	public Day(Day d) {
		// 引数のそれぞれのクラス変数を代入する
		this(d.year,d.month,d.date);
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

	// 年月日を比較して同じか判定するメソッド
	public boolean equalTo(Day diffDate) {
		// それぞれの値を比較して、同じ場合はtrueを返す
		return year == diffDate.year && month == diffDate.month && date == diffDate.date;
	}

	// 年月日と曜日を文字で表示するメソッド
	public String toString() {
		// 曜日の文字列を生成
		final String[] wd = {"日","月","火","水","木","金","土"};
		// 年月日と算出した曜日のインデックス番号を返却する
		return String.format("%04d年%02d月%02d日(%s)",year,month,date,wd[dayOfWeek()]);
	}

	// 年内の経過日数を取得する
	public int getPassDays() {
		// 作業用のインスタンスを生成
		GregorianCalendar tmpDay = new GregorianCalendar();
		// 経過日数
		int passDays = 0;
		// 経過した月の分ループする
		for (int count = 1; count < this.month; count++ ) {
			// 対象月の最大日数を取得するため、月をセット
			tmpDay.set(MONTH, count);
			// 最大日数を加算する
			passDays += tmpDay.getActualMaximum(DATE);
		}
		// 当月の経過日数を加算する
		passDays += this.date;
		// 経過日数を返却する
		return passDays;
	}

	// 年内の残り日数を取得する
	public int getDaysLeft() {
		final int MAX_DAYS = 365;
		// 経過日数から残り日数を求めて返却する
		return MAX_DAYS - this.getPassDays();
	}
	// 日付の前後関係を求めるメソッド
	public void diffDate(Day diffDate){
		// 比較した日付が同じ場合
		if (this.equals(diffDate)) {
			// メッセージを表示する
			System.out.println("同じ日付");
		// 年、月、日をそれぞれ比較して日付が後か判定する
		} else if (this.year > diffDate.year || (this.year > diffDate.year && this.month > diffDate.month) || (this.year > diffDate.year && this.month > diffDate.month && this.date > diffDate.date)) {
			// メッセージを表示する
			System.out.println("対象より後の日付");
		// 比較対象より前の場合
		} else {
			// メッセージを表示する
			System.out.println("対象より前の日付");
		}
	}

	// 一日進めるメソッド
	public void addOneAfter() {
		// 日にちを進める
		today.add(DATE, 1);

		// 年を修正
		year=today.get(YEAR);
		// 月を修正
		month=today.get(MONTH) + 1;
		// 日を修正
		date=today.get(DATE);
	}

	// 一日後にするメソッド
	public void addOneBefor() {
		// 日にちを進める
		today.add(DATE, -1);
		// 年を修正
		year=today.get(YEAR);
		// 月を修正
		month=today.get(MONTH) + 1;
		// 日を修正
		date=today.get(DATE);
	}

	// n日後にするメソッド
	public void addAfter(int addDay) {

		// 日にちを進める
		today.add(DATE, addDay);
		// 年を修正
		year=today.get(YEAR);
		// 月を修正
		month=today.get(MONTH) + 1;
		// 日を修正
		date=today.get(DATE);
	}

	// n日前にするメソッド
	public void addBefor(int addDay) {
		// 日にちを進める
		today.add(DATE, -addDay);
		// 年を修正
		year=today.get(YEAR);
		// 月を修正
		month=today.get(MONTH) + 1;
		// 日を修正
		date=today.get(DATE);
	}

	// 一日後の日付を取得するメソッド
	public String getOneAfterDay() {
		// 一日加算する
		this.addOneAfter();
		// 日付を取得する
		String returnDate = toString();
		// 日付を戻す
		this.addOneBefor();
		// 結果を返却する
		return returnDate;
	}

	// 一日前の日付を取得するメソッド
	public String getOneBeforDay() {
		// 1日減算する
		this.addOneBefor();
		// 日付を取得する
		String returnDate = toString();
		// 日付を戻す
		this.addOneAfter();
		// 結果を返却する
		return returnDate;
	}

	// 日付をn日進めた値を取得する
	public String getAfterDay(int addDay) {
		// 日付を加算する
		this.addAfter(addDay);
		// 日付を取得する
		String returnDate = toString();
		// 日付を戻す
		this.addBefor(addDay);
		// 結果を返却する
		return returnDate;
	}

	// 日付をn日減らした値を取得する
	public String getBeforDay(int addDay) {
		// 日付を減算する
		this.addBefor(addDay);
		String returnDate = toString();
		// 日付を戻す
		this.addAfter(addDay);
		// 結果を返却する
		return returnDate;
	}
}
