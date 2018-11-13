package Ensyu13;

public class LeftUpTriangle extends Triangle {
	// コンストラクタ
	LeftUpTriangle(int size) {
		// 親クラスのコンストラクタを実行
		super(size);
	}

	// 図形情報を返却するメソッド
	public String toString() {
		// 図形情報を返却する
		return "LeftUpTriangle(size:" + getSize() + ")";
	}

	// 図形を表示するメソッド
	public void draw() {
		// 図形サイズ分ループする
		for(int rawCount = 0; rawCount < getSize(); rawCount++ ){
			// 行数分ループする
			for(int columnCount = 0; columnCount < getSize() - rawCount; columnCount++ ){
				// 文字を表示する
				System.out.print('*');
			}
			// 改行する
			System.out.println();
		}
	}
}
