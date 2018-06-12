package ensyu7;

/* 数値の内部ビットを表示するメソッド群を作成せよ
 */

public class Ensyu7_32 {

	public static void main(String[] args) {

		// byte型の変数を用意する
		final byte byteNumber = 10;

		printBits(byteNumber);
		// short型の変数を用意する
		final short shortNumber = 3000;
		// 数値をビット表示する
		printBits(shortNumber);
		// int型の変数を用意する
		final int intNumber = 10000;
		// 数値をビット表示する
		printBits(intNumber);
		// long型の変数を用意する
		final long longNumber = 1000000000000000L;
		// 数値をビット表示する
		printBits(longNumber);
	}

	/* byte型の数値をビット表示するメソッド
	 * number:ビット表示する数値
	 */
	static void printBits(byte number) {
		// 何の型の処理か出
		System.out.println("byte");
		// 32桁分ループする
		for (int count = 7; count >=0; count--) {
			// 0か1を判定する
			System.out.print(((number >>> count & 1) == 1) ? '1' : '0');
		}
		// 改行する
		System.out.println();
	}

	/* short型の数値をビット表示するメソッド
	 * number:ビット表示する数値
	 */
	static void printBits(short number) {
		// 何の型の処理か出
		System.out.println("short");
		// 32桁分ループする
		for (int count = 15; count >=0; count--) {
			// 0か1を判定する
			System.out.print(((number >>> count & 1) == 1) ? '1' : '0');
		}
		// 改行する
		System.out.println();
	}

	/* int型の数値をビット表示するメソッド
	 * number:ビット表示する数値
	 */
	static void printBits(int number) {
		// 何の型の処理か出
		System.out.println("int");
		// 32桁分ループする
		for (int count = 31; count >=0; count--) {
			// 0か1を判定する
			System.out.print(((number >>> count & 1) == 1) ? '1' : '0');
		}
		// 改行する
		System.out.println();
	}

	/* long型の数値をビット表示するメソッド
	 * number:ビット表示する数値
	 */
	static void printBits(long number) {
		// 何の型の処理か出
		System.out.println("long");
		// 32桁分ループする
		for (int count = 63; count >=0; count--) {
			// 0か1を判定する
			System.out.print(((number >>> count & 1) == 1) ? '1' : '0');
		}
		// 改行する
		System.out.println();
	}
}
