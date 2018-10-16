package Ensyu13;

public class HorzLine extends AbstLine {

	// コンストラクタ
	public HorzLine(int length) {
		// 親クラスのコンストラクタを実行
		super(length);
	}

	// 水平直線に関する図形情報を表示するメソッド
	public String toString() {
		// 図形情報を返却する
		return "HorzLine(Length:" + getLength() + ")";
	}

	// 水平直線を描写するメソッド
	public void draw() {
		// 指定文字数分ループする
		for (int count = 1; count <= getLength(); count++) {
			// 文字の表示
			System.out.print('-');
		}
		// 改行する
		System.out.println();
	}
}
