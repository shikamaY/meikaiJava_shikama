package Ensyu14;

public class Parallelogram extends Shape implements Plane2D{

	// 長方形の幅
	private int mWidth;
	// 長方形の高さ
	private int mHeight;

	// コンストラクタ
	public Parallelogram(int width, int height) {
		// 幅の設定
		this.mWidth = width;
		// 高さの設定
		this.mHeight = height;
	}

	// 図形情報を表示するメソッド
	public String toString() {
		// 図形情報の表示
		return "Parallelogram(width:" + mWidth + ",height:" + mHeight + ")";
	}

	// 図形を描写するメソッド
	public void draw() {
		// 高さ分ループする
		for (int rowCount = 1; rowCount <= mHeight; rowCount++) {
			// 高さからループ分引いた数をループ
			for (int columnCount = 1; columnCount <= mHeight - rowCount; columnCount++) {
				// 空白を表示
				System.out.print(' ');
			}
			// 幅分ループする
			for (int columnCount = 1; columnCount <= mWidth; columnCount++) {
				// 図形を表示
				System.out.print('#');
			}
			// 改行する
			System.out.println();
		}
	}

	// 面積を求めるメソッド
	public int getArea() {
		// 計算結果を返却
		return mWidth * mHeight;
	}
}
