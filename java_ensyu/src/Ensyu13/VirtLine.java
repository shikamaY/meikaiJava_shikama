package Ensyu13;

public class VirtLine extends AbstLine{

	// コンストラクタ
	public VirtLine(int length) {
		// 親クラスのコンストラクタを実行
		super(length);
	}

	// 図形情報を表示するメソッド
	public String toString() {
		// 図形情報を返却する
		return "VirtLine(length:" + getLength() + ")";
	}

	// 図形を表示するメソッド
	public void draw() {
		// 指定文字数分ループする
		for (int count = 1; count <= getLength(); count++) {
			// 文字を表示する
			System.out.println('|');
		}
	}
}
