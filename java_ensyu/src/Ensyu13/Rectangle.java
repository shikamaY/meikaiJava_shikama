package Ensyu13;

public class Rectangle extends Shape {

	// 長方形の幅
	private int mWidth;

	// 長方形の高さ
	private int mHeight;

	// コンストラクタ
	public Rectangle(int width, int height) {
		// 幅をセット
		this.mWidth = width;
		// 高さをセット
		this.mHeight = height;
	}

	// 図形情報を表示するメソッド
	public String toString() {
		// 図形情報を返却する
		return "Rectangle(width:" + mWidth + ",height:" + mHeight + ")";
	}

	// 図形を表示するメソッド
	public void draw() {
		// 指定された高さ分ループする
		for (int rowCount = 1; rowCount <= mHeight; rowCount++ ){
			// 指定された幅分ループする
			for (int columnCount = 1; columnCount <= mWidth; columnCount++) {
				// 文字を表示する
				System.out.print('*');
			}
			// 改行する
			System.out.println();
		}
	}
}
