package ensyu10;

// 連番クラス
public class Id {
	// 識別番号をカウントするクラス変数
	static int counter = 0;

	// 識別番号
	private int id;

	// コンストラクタ
	public Id() {
		// カウントをインクリメントしてIdに代入する
		id = ++counter;
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
