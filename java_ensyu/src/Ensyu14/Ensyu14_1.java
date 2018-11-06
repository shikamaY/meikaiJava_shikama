package Ensyu14;

/* 演習14-1
 * 図形群クラスを利用するプログラム例を作成せよ
 *
 */

public class Ensyu14_1 {

	public static void main(String[] args) {

		// 長方形のオブジェクトを生成
		Rectangle rectangle = new Rectangle(5, 6);
		// 図形情報の表示
		System.out.println(rectangle.toString() + ",面積：" +rectangle.getArea());
		// 図形の描写
		rectangle.draw();
		// 平行四辺形のオブジェクトを生成
		Parallelogram parallelogram = new Parallelogram(5,4);
		// 図形情報の表示
		System.out.println(parallelogram.toString() + ",面積：" + parallelogram.getArea());
		// 図形の描写
		parallelogram.draw();
	}

}
