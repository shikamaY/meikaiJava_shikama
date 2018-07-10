package Ensyu9;

public class Ensyu9_3_Day {

	// 年を入れる変数
	private int year = 1;
	// 月を入れる変数
	private int month = 1;
	// 日を入れる変数
	private int date = 1;

	// 引数がない場合のコンストラクタ
	public Ensyu9_3_Day() {
	}

	// 引数が年の場合のコンストラクタ
	public Ensyu9_3_Day(int year) {
		// 引数の値を代入
		this.year = year;
	}

	// 引数が2つの場合のコンストラクタ
	public Ensyu9_3_Day(int year, int month) {
		// 引数が1つのコンストラクタを実行
		this(year);
		// monthを代入
		this.month = month;
	}

	// 引数が3つの場合のコンストラクタ
	Ensyu9_3_Day(int year, int month, int date) {
		// 引数が2つのコンストラクタを実行
		this(year,month);
		// dateを代入
		this.date = date;
	}

	// 同じクラス型の引数を渡された場合
	Ensyu9_3_Day(Ensyu9_3_Day d) {
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
	public boolean equalTo(Ensyu9_3_Day d) {
		// それぞれの値を比較して、同じ場合はtrueを返す
		return year == d.year && month == d.month && date == d.date;
	}

	// 年月日と曜日を文字で表示するメソッド
	public String toString() {
		// 曜日の文字列を生成
		String[] wd = {"日","月","火","水","木","金","土"};
		// 年月日と算出した曜日のインデックス番号を返却する
		return String.format("%04d年%02d月%02d日(%s)",year,month,date,wd[dayOfWeek()]);
	}
}
