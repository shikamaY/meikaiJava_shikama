package Ensyu13;

public class Point extends Shape {

	// コンストラクタ
	public Point(){
	}

	// 図形情報の返却
	public String toString() {
		return "Point";
	}

	// ＋を一文字表示するメソッド
	public void draw() {
		// +を出力する
		System.out.println('+');
	}

}
