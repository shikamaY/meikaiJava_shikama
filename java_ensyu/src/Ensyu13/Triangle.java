package Ensyu13;

public abstract class Triangle extends Shape {

	// 三角形のサイズを入れる変数
	private int mSize;


	// コンストラクタ
	public Triangle(int size) {
		// 幅をセットする
		this.mSize = size;
	}

	// 幅を取得するメソッド
	public int getSize() {
		// 幅を返却する
		return mSize;
	}
}
