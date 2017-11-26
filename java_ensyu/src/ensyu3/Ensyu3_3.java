package ensyu3;

import java.util.Scanner;

public class Ensyu3_3 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数値:");
		int n = stdIn.nextInt();

		if (n > 0)
			System.out.println("その値は正です。");
		else if (n < 0)
			System.out.println("その値は負です。");
		// 変数がint型であるため、入力値が正の数、負の数、0しかないため問題なく動作する
		else if(n == 0)
		// else
			System.out.println("その値は０です。");
	}

}
