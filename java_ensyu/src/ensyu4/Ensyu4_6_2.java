package ensyu4;

import java.util.Scanner;

public class Ensyu4_6_2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("何個*をひょうじしますか:");
		int n = stdIn.nextInt();

		int i = 1;
		while (i <= n) {
			System.out.print('*');
			i++;
		}
		// 入力値がマイナスの場合は改行しない
		if ( n < 1) {
			System.out.println();
		}
	}

}
