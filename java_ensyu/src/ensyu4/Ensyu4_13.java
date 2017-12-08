package ensyu4;

import java.util.Scanner;

public class Ensyu4_13 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("１からnまでの和を求めます。");
		int n = 0;

		// nの値が1以上が入力されるまでループ
		for ( ; n > 0 ; ) {
			System.out.println("nの値：");
			n = stdIn.nextInt();
		}

		int sum = 0;

		// n回ループする
		for (int i = 0; i <=0; i++ ) {
			// sumにiを加算
			sum += i;
		}
		System.out.println("1から" + n + "までの和は" + sum + "です。");
	}

}
