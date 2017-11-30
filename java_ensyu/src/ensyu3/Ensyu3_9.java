package ensyu3;

import java.util.Scanner;

public class Ensyu3_9 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		// 実数Aを入力を促すコメント表示する
		System.out.print("実数A:");
		// 入力値をdouble型のnumAに代入する
		double numA  = stdIn.nextDouble();
		//  実数Bを入力を促すコメント表示する
		System.out.print("実数B:");
		// 入力値をdouble型のnumBに代入する
		double numB  = stdIn.nextDouble();
		// numAとnumBでどちらが大きいか比較して結果を表示する
		System.out.println(numA > numB ? numA : numB);
	}

}
