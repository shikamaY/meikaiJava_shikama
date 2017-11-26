package ensyu2;

import java.util.Scanner;

public class Ensyu2_3 {

	public static void main(String[] args) {
		//入力値を代入するnumをint型で宣言
		int num;
		// 入力された値を入れる変数を宣言する
		Scanner stdIn = new Scanner(System.in);
		// 入力を促すコメント表示する
		System.out.print("整数値:");
		//入力値をnumに代入する
		num = stdIn.nextInt();
		// 入力値を表示する
		System.out.println( num + "と入力しましたね。");
	}

}
