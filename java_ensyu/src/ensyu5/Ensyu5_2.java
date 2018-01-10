package ensyu5;

import java.util.Scanner;

/*演習5-2
 * float型の変数とdouble型の変数に値を読み込んで表示するプログラムを作成せよ
 */
public class Ensyu5_2 {

	public static void main(String[] args) {
		// ユーザ入力のため、Scannerクラスのオブジェクトを生成する
		Scanner standardInput = new Scanner(System.in);

		// xとyが何型か表示する
		System.out.println("変数xはfloat型で、変数yはdouble型です。");
		// xの値を入力するように表示する
		System.out.print("x:");
		// 入力値を変数に代入する
		float inputFloatNumber = standardInput.nextFloat();
		// yの値をflout型で入力するように表示する
		System.out.print("y:");
		// 入力値をdouble型の変数に代入する
		double inputDoubleNumber = standardInput.nextDouble();
		// 入力されたxの値を表示する
		System.out.println("x = " + inputFloatNumber);
		// 入力されたyの値を表示する
		System.out.println("y = " + inputDoubleNumber);
	}

}
