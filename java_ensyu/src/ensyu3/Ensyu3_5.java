package ensyu3;

import java.util.Scanner;

public class Ensyu3_5 {

	public static void main(String[] args) {
		// Scannerクラスのオブジェクトを生成
		Scanner stdIn = new Scanner(System.in);
		// 整数を入力を促すコメント表示する
		System.out.print("整数:");
		// 入力値をint型のnumに代入する
		int num = stdIn.nextInt();
		// 入力値が正の値か判定する
		if(num < 0){
			// 正でないことを表示する
			System.out.println("正ではない値が入力されました。");
		// 5で割り切れるか判定
		} else if (num % 5 == 0){
			// 割り切れると表示する
			System.out.println("その値は5で割り切れます。");
		// それ以外は割り切れないと判定する
		} else {
			// 割り切れないと表示する
			System.out.println("その値は5で割り切れません。");
		}
	}

}
