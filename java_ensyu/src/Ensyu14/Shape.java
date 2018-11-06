package Ensyu14;

public abstract class Shape {

	// 図形情報をあらわす文字列を返却する抽象メソッド
	public abstract String toString();

	// 図形を描写するための抽象メソッド
	public abstract void draw();

	// 図形情報の表示と図形描写を行うメソッド
	public void print() {
		// 図形情報を表示
		System.out.println(toString());
		// 図形を描写
		draw();
	}
}

