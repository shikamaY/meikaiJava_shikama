package ensyu7;

/* 演習7-31
 * int型整数xの絶対値、long型整数xの絶対値、float型実数の絶対値、double型実数xの絶対値を求めるメソッド群を作成せよ
 *
 */
public class Ensyu7_31 {

	public static void main(String[] args) {
		// int型の絶対値
		System.out.println(absolute(100));
		// long型の絶対値
		System.out.println(absolute(-1000000000000L));
		// float型の絶対値
		System.out.println(absolute(10.0F));
		// double型の絶対値
		System.out.println(absolute(-1.01213113111318888131131D));

	}

	/* int型の絶対値を求めるメソッド
	 * number:数値
	 */
	static int absolute(int number) {
		// 絶対値を入れる変数を用意
		int absoluteNumber = number;
		// 何の型の処理か出力
        System.out.println("int");
        // 負の値か判定
		if (absoluteNumber < 0) {
			// 負の場合は整数に変換
			absoluteNumber *= -1;
		}
		// 絶対値を返却する
		return absoluteNumber;
	}

	/* long型の絶対値を求めるメソッド
	 * number:数値
	 */
	static long absolute(long number) {
		// 絶対値を入れる変数を用意
		long absoluteNumber = number;
		// 何の型の処理か出力
		System.out.println("long");
		// 負の値か判定
		if (absoluteNumber < 0) {
			// 負の場合は整数に変換
			absoluteNumber *= -1;
		}
		// 絶対値を返却する
		return absoluteNumber;
	}

	/* float型の絶対値を求めるメソッド
	 * number:数値
	 */
	static float absolute(float number) {
		// 絶対値を入れる変数を用意
		float absoluteNumber = number;
		// 何の型の処理か出力
		System.out.println("float");
		// 負の値か判定
		if (absoluteNumber < 0) {
			// 負の場合は整数に変換
			absoluteNumber *= -1;
		}
		// 絶対値を返却する
		return absoluteNumber;
	}

	/* double型の絶対値を求めるメソッド
	 * number:数値
	 */
	static double absolute(double number) {
		// 絶対値を入れる変数を用意
		double absoluteNumber = number;
		// 何の型の処理か出力
		System.out.println("double");
		// 負の値か判定
		if (absoluteNumber < 0) {
			// 負の場合は整数に変換
			absoluteNumber *= -1;
		}
		// 絶対値を返却する
		return absoluteNumber;
	}

}
