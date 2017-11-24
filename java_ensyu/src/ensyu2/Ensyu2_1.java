package ensyu2;

public class Ensyu2_1 {
	public static void main(String[] args) {
		int x;			// xはint型の変数
		int y;			// yはint型の変数
		// double x;	// xはdouble型の変数
		// double y;	// yはdouble型の変数

		x = 63;			// xに63を代入
		y = 18;			// yに18を代入

		// x = 63.0;	// xに63.0を代入
		// y = 18.0;	// yに18.0を代入

		/* int型には実数を代入できないため、13,14行目はコンパイルエラーとなる
		   実数を使用する場合はdouble型で宣言する必要があります
		*/

		System.out.println("xの値は" + x + "です。");			// xの値を表示
		System.out.println("yの値は" + y + "です。");			// yの値を表示
		System.out.println("合計は" + (x + y) + "です。");		// 合計を表示
		System.out.println("平均は" + (x + y) / 2 + "です。"); // 平均を表示
	}
}
