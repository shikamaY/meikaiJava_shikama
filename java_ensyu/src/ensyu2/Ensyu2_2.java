package ensyu2;

public class Ensyu2_2 {

	public static void main(String[] args) {
		int num1;			// num1は１つ目のint型の変数
		int num2;			// num2は２つ目のint型の変数
		int num3;			// num3は３つ目のint型の変数

		num1 = 10;			// num1に10を代入
		num2 = 30;			// num2に30を代入
		num3 = 80;			// num3に80を代入

		// num1の値を表示
		System.out.println("num1の値は" + num1 + "です。");
		// num2の値を表示
		System.out.println("num2の値は" + num2 + "です。");
		// num3の値を表示
		System.out.println("num3の値は" + num3 + "です。");
		// 合計を表示
		System.out.println("合計は" + (num1 + num2 + num3) + "です。");
		 // 平均を表示
		System.out.println("平均は" + (num1 + num2 + num3) / 3 + "です。");
	}

}
