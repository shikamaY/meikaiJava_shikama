package Ensyu13;

public abstract class AbstLine extends Shape {

	// 長さを入れる変数
	private int mLength;

	// コンストラクタ
	public AbstLine(int length) {
		// 長さを変数に入れる
		setLength(length);
	}

	// 長さを取得するメソッド
	public int getLength() {
		// 長さを返却する
		return mLength;
	}

	// 長さを変更するメソッド
	public void setLength(int length) {
		// 長さを代入する
		this.mLength = length;
	}

	// 図形情報を表示するメソッド
	public String toString() {
		// 図形情報を表示する
		return "AbstLine(length" + mLength + ")";
	}
}
