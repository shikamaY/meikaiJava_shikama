package ensyu4;

import java.util.Scanner;

/*
 * 季節を求めるList4-1（p.95）の月の読み込みにおいて、1～12以外の値が入力された
 * 場合は、再入力させるようにしゅうせいしたプログラムを作成せよ（do文の中にdo分が入る二重ループとなる）
 */
public class Ensyu4_19 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int retry;
		int month;

		do {
			do {
				System.out.print("季節を求めます。\n何月ですか：");
				month=stdIn.nextInt();
			// 入力値が1～12であるかチェックする
			} while (month <= 0 || month >= 13);

			if (month >= 3 && month <= 5 )
				System.out.println("それは春です。");
			else if (month >= 6 && month <= 8)
				System.out.println("それは夏です。");
			else if (month >= 9 && month <= 11)
				System.out.println("それは秋です。");
			else if (month == 12 || month == 1 || month == 2)
				System.out.println("それは冬です。");

			System.out.print("もう一度？1・・・Yes/0・・・No：");
			retry = stdIn.nextInt();
		} while (retry == 1);

	}

}
