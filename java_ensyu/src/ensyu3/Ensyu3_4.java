package ensyu3;

import java.util.Scanner;

public class Ensyu3_4 {

	public static void main(String[] args) {
		// Scannerクラスのオブジェクトを生成
		Scanner stdIn = new Scanner(System.in);
		// aを入力を促すコメント表示する
		System.out.print("a:");
		// 入力値をint型のaに代入する
		int a  = stdIn.nextInt();
		//  bを入力を促すコメント表示する
		System.out.print("b:");
		// 入力値をint型のbに代入する
		int b  = stdIn.nextInt();
		// aが大きいか判定する
		if(a > b){
			// aが大きいと表示する
			System.out.println("aのほうが大きいです");
		// bが大きいか判定する
		} else if (b > a){
			// bが大きいと表示する
			System.out.println("bのほうが大きいです");
		// a,bに差がなければa=bとする
		} else {
			// 同じ値と表示する
			System.out.println("aとｂは同じ値です。");
		}
	}

}
