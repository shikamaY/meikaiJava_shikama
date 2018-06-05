package ensyu7;

import java.util.Scanner;

/* int型の1次元配列とint型の2次元配列の全要素の値を表示するメソッド群を作成せよ
 */
public class Ensyu7_33 {

	public static void main(String[] args) {
		// 一次元配列を表示する
		printArray(creatIntArray());
		// 2次元配列を表示する
		printArray(creatIntDoualArray());
	}

	/* 1次元配列の中身を表示するメソッド
	 * intArray:表示する配列
	 */
	static void printArray(int[] intArray) {
		// 配列の要素数分ループする
		for (int count = 0; count < intArray.length; count++) {
			// 各要素の値を表示する
			System.out.print(intArray[count] + " ");
		}
		// 改行する
		System.out.println();
	}

	/* 2次元配列の中身を表示するメソッド
	 * intArray:表示する配列
	 */
	static void printArray(int[][] intArray) {

		// 各要素の空白数をそろえるための変数
		int speaceMax = 0;

		// 配列の行数分ループする
		for (int rowCount = 0; rowCount < intArray.length; rowCount++) {
			// 配列の列数分ループする
			for (int columnCount = 0; columnCount < intArray[rowCount].length; columnCount++) {
				// 対象列の最大の桁数を取得する
				speaceMax = digitsCount(intArray,columnCount);
				// 桁数にあわせた空欄を追加し、配列の要素を表示する
				System.out.print(addSpeace(intArray[rowCount][columnCount] , speaceMax));
			}
			System.out.println();
		}
	}

	/* 対象列の桁数の最大を求めるメソッド
	 * intArray:対象の配列
	 * columnCount:対象の列
	 */
	static int digitsCount(int[][] intArray,int columnCount) {
		// 桁数の最大値を入れる変数
		int digitsMax = 0;
		// 行数分ループする
		for (int rowCount = 0; rowCount < intArray.length; rowCount++) {
			    // 対象の要素の桁数が最大化判定する
				if(digitsMax < String.valueOf(intArray[rowCount][columnCount]).length()) {
					// 桁数が最大の場合は代入する
					digitsMax = String.valueOf(intArray[rowCount][columnCount]).length();
			}
		}
		// 最大桁数を返却する
		return digitsMax;
	}

	/* 桁数にあわせてスペース埋めするメソッド
	 * number:スペースを追加する数値
	 * speceMax:桁数の最大値
	 */
	static String addSpeace(int number, int speaceMax) {
		// スペースを追加するため、数値をString型に変更
		String addSpeaceNumber = String.valueOf(number);

		// 最大桁数になるまでループする
		for (int count = addSpeaceNumber.length(); count <= speaceMax; count++ ) {
			// スペースを追加
			addSpeaceNumber = addSpeaceNumber + " ";
		}

		// スペースを追加した数値を返却する
		return addSpeaceNumber;
	}

	// 配列をユーザに作成させるメソッド
	static int[][] creatIntDoualArray() {
		// ユーザ入力のため、Scannerクラスのオブジェクトを生成する
		Scanner standardInput = new Scanner(System.in);

		// ユーザへ入力を促すためのメッセージ
		System.out.print("配列の要素数(１次):");
		// ユーザからの入力値を代入する
		final int arrayCountFirst = standardInput.nextInt();
		// ユーザへ入力を促すためのメッセージ
		System.out.print("配列の要素数（２次）:");
		// ユーザからの入力値を代入する
		final int arrayCountSecond = standardInput.nextInt();
		// 指定された要素数の配列を用意する
		int[][] intDoualArray = new int[arrayCountFirst][arrayCountSecond];

		// 指定されたサイズの配列に値を入れてもらうため、要素数分ループする
		for(int countRow = 0; countRow < arrayCountFirst; countRow++ ) {
			for(int countColumn = 0; countColumn < arrayCountSecond; countColumn++ ) {
				// ユーザへ入力を促すためのメッセージ
				System.out.print("配列[" + countRow + "][" + countColumn + "]:");
				// 入力値を配列に入れる
				intDoualArray[countRow][countColumn] = standardInput.nextInt();
			}

		}
		// 作成した配列を返却する
		return intDoualArray;
	}

	// 配列をユーザに作成させるメソッド
	static int[] creatIntArray() {
		// ユーザ入力のため、Scannerクラスのオブジェクトを生成する
		Scanner standardInput = new Scanner(System.in);

		// ユーザへ入力を促すためのメッセージ
		System.out.print("配列の要素数:");
		// ユーザからの入力値を代入する
		int arrayCount = standardInput.nextInt();
		// 指定された要素数の配列を用意する
		int[] intArray = new int[arrayCount];

		// 指定されたサイズの配列に値を入れてもらうため、要素数分ループする
		for(int count = 0; count < arrayCount; count++ ) {
			// ユーザへ入力を促すためのメッセージ
			System.out.print("配列[" + count + "]:");
			// 入力値を配列に入れる
			intArray[count] = standardInput.nextInt();
		}
		// 作成した配列を返却する
		return intArray;
	}
}
