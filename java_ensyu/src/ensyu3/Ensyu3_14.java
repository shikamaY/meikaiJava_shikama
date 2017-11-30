package ensyu3;

import java.util.Scanner;

public class Ensyu3_14 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		// 整数Aを入力を促すコメント表示する
		System.out.print("整数A:");
		// 入力値をint型のnumAに代入する
		int numA  = stdIn.nextInt();
		//  整数Bを入力を促すコメント表示する
		System.out.print("整数B:");
		// 入力値をint型のnumBに代入する
		int numB  = stdIn.nextInt();
		// numAとnumBが同じか比較する
		if(numA == numB){
			System.out.println("二つの値は同じです。");
		// numAがnumBより大きいか比較する
		} else if( numA > numB ) {
			System.out.println("最大値は" + numA);
			System.out.println("最小値は" + numB);
		// numBがnumAより大きい場合
		} else {
			System.out.println("最大値は" + numB);
			System.out.println("最小値は" + numA);
		}
	}

}
