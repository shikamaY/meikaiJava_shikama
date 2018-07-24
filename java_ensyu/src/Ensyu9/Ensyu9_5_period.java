package Ensyu9;

public class Ensyu9_5_period {
	// 開始日を定義する変数
	private Ensyu9_5_Day from;
	// 終了日を定義する変数
	private Ensyu9_5_Day to;

	// コンストラクタ
	Ensyu9_5_period(Ensyu9_5_Day from, Ensyu9_5_Day to) {
		// 開始日を入れる
		this.from = new Ensyu9_5_Day(from);
		// 終了日を入れる
		this.to= new Ensyu9_5_Day(to);
	}

	// 開始日を取得するメソッド
	Ensyu9_5_Day getFrom() {
		// 開始日を返却する
		return from;
	}

	// 終了日を取得するメソッド
	Ensyu9_5_Day getTo() {
		// 終了日を返却する
		return to;
	}

	// 開始日を再定義するメソッド
	void newFrom(Ensyu9_5_Day from) {
		this.from = from;
	}

	// 終了日を再定義するメソッド
	void newTo(Ensyu9_5_Day to) {
		this.to = to;
	}

	// 開始日と終了日を返すtoStringメソッド
	public String toString() {
		// 名前、身長、体重、誕生日を返す
		return String.format("開始日:%s\n終了日:%s", from,to);
	}
}
