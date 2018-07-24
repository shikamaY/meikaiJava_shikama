package ensyu10;

public class MinMax {

	// 二値の最小値を求めるメソッド
	public static int min(int num1, int num2) {
		// 最小値を返す
		return Math.min(num1, num2);
	}

	// 三値の最小値を求めるメソッド
	public static int min(int num1, int num2, int num3) {
		// 仮の最小値を設定
		int min = num1;
		// 仮の最小値と比較
		if (min > num2) {
			// 小さい場合は最小値を変更
			min = num2;
		}
		// 仮の最小値と比較
		if (min > num3) {
			// 小さい場合は最小値を変更
			min = num3;
		}
		// 最小値を返す
		return min;
	}

	// 配列の最小値を求めるメソッド
	public static int min(int[] intArgs) {
		// 仮の最小値を設定
		int min = intArgs[0];

		// 配列の各要素分ループ
		for (int count = 1; count < intArgs.length; count++) {
			// 仮の最小値と要素を比較する
			if (min > intArgs[count]) {
				// 小さい場合は最小値を変更
				min = intArgs[count];
			}
		}
		// 最小値を返す
		return min;
	}

	// 二値の最大値を求めるメソッド
	public static int max(int num1, int num2) {
		// 最大値を返す
		return Math.max(num1, num2);
	}

	// 三値の最大値を求めるメソッド
	public static int max(int num1, int num2, int num3) {
		// 仮の最大値を設定
		int max = num1;
		// 仮の最大値と比較
		if (max < num2) {
			// 大きい場合は最大値を変更
			max = num2;
		}
		// 仮の最大値と比較
		if (max < num3) {
			// 大きい場合は最大値を変更
			max = num3;
		}
		// 最大値を返す
		return max;
	}

	// 配列の最大値を求めるメソッド
	public static int max(int[] intArgs) {
		// 仮の最大値を設定
		int max = intArgs[0];

		// 配列の各要素分ループ
		for (int count = 1; count < intArgs.length; count++) {
			// 仮の最大値と要素を比較する
			if (max < intArgs[count]) {
				// 大きい場合は最大値を変更
				max = intArgs[count];
			}
		}
		// 最大値を返す
		return max;
	}
}
