package ensyu10;

/* 演習10-3
 * 二値/三値/配列の最小値を求めるメソッドや最大値を求めるメソッドを集めたユーティリティクラスMinMax
 * を作成せよ
 */
public class Ensyu10_3 {

	public static void main(String[] args) {

		// 比較用の値を生成
		final int numA = 3;
		// 比較用の値を生成
		final int numB = 8;
		// 比較用の値を生成
		final int numC = 6;
		// 比較用の配列を生成
		final int[] intArgs = {3,5,4,1,9};

		// 二値の最小値を表示
		System.out.println(numA + " " + numB + " の最小値=" + MinMax.min(numA,numB));
		// 三値の最小値を表示
		System.out.println(numA + " " + numB + " " + numC + " の最小値=" + MinMax.min(numA,numB,numC));

		// 配列の要素数分ループする
		for(int intNum : intArgs) {
			// 配列の要素を表示
			System.out.print(intNum + " ");
		}
		// 配列内の最小値を表示
		System.out.println("内の最小値=" + MinMax.min(intArgs));

		// 二値の最大値を表示
		System.out.println(numA + " " + numB + " の最大値=" + MinMax.max(numA,numB));
		// 三値の最大値を表示
		System.out.println(numA + " " + numB + " " + numC + " の最大値=" + MinMax.max(numA,numB,numC));

		// 配列の要素数分ループする
		for(int intNum : intArgs) {
			// 配列の要素を表示
			System.out.print(intNum + " ");
		}
		// 配列内の最大値を表示
		System.out.println("内の最大値=" + MinMax.max(intArgs));
	}

}
