package ensyu10;

public class ExId {
	// 識別番号をカウントするクラス変数
	static int counter = 0;

	// 識別番号を増やす量
	static int countUp = 1;

	// 識別番号
	private int id;

	// コンストラクタ
	public ExId() {
		// カウントを増加させる
		counter += countUp;
		// カウントを識別番号とする
		id = counter;
	}

	// 識別番号の増加量を変更するメソッド
	static void setCountUp(int countNum) {
		// 増加量を変更
		countUp = countNum;
	}

	// 現在の増加量を取得するメソッド
	static int getCountUp() {
		return countUp;
	}

	// 識別番号を取得
	public int getId() {
		// 識別番号を返す
		return id;
	}

	// 作成した最後の識別番号を返すメソッド
	static int getMaxId() {
		// 最後に作成した番号を返す
		return counter;
	}
}
