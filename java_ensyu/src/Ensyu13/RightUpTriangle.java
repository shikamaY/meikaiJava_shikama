package Ensyu13;

public class RightUpTriangle extends Triangle {
	// コンストラクタ
	RightUpTriangle(int size) {
		// 親クラスのコンストラクタを実行
		super(size);
	}

	// 図形情報を返却するメソッド
	public String toString() {
		// 図形情報を返却する
		return "RightUpTriangle(size:" + getSize() + ")";
	}

	// 図形を表示するメソッド
	public void draw() {
		// 図形サイズ分ループする
		for(int rawCount = 0; rawCount < getSize(); rawCount++ ){
			// 行数分ループする
			for(int columnCount = 0; columnCount < getSize(); columnCount++ ){
				// 空白を表示するための判定
				if (getSize() - columnCount > getSize() - rawCount) {
					// 文字を表示する
					System.out.print(' ');
				// 文字を表示する場合
				} else {
					// 空白を表示する
					System.out.print('*');
				}
			}
			// 改行する
			System.out.println();
		}
	}
}
