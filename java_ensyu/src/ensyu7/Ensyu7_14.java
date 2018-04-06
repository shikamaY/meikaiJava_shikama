package ensyu7;

import java.util.Scanner;

/* 演習7-14
 * 整数xのposビット目を最下位として連続するn個のビットを1にした値を返すメソッドsetN,0にした値を返すメソッドresetN、
 * 反転した値を返すメソッドinverseNを作成せよ
 */
public class Ensyu7_14 {

	public static void main(String[] args) {
		// ユーザ入力のため、Scannerクラスのオブジェクトを生成する
		Scanner standardInput = new Scanner(System.in);

		// ユーザへ入力を促すためのメッセージ
		System.out.print("整数:");
		// ユーザからの入力値を代入する
		int intNumber = standardInput.nextInt();

		// ユーザへ入力を促すためのメッセージ
		System.out.print("何ビット目:");
		// ユーザからの入力値を代入する
		int numberCount = standardInput.nextInt();

		// ユーザへ入力を促すためのメッセージ
		System.out.print("何個変換:");
		// ユーザからの入力値を代入する
		int conversionCount = standardInput.nextInt();

		// 正しい変換が行われているか確認するため、変換前の整数値をビット表示する
		printBits(intNumber);
		// 整数を指定位置から指定個数分を1にした値を出力する
		System.out.println(setN(intNumber,numberCount,conversionCount));
		// 整数を指定位置から指定個数分を0にした値を出力する
		System.out.println(resetN(intNumber,numberCount,conversionCount));
		// 整数を指定位置から指定個数分を反転させた値を出力する
		System.out.println(inverseN(intNumber,numberCount,conversionCount));
	}

	/* 指定したビット位置から指定した数分を１にするメソッド
	 * intNumber:変換する整数値
	 * numberCount:何番目を最下位ビットするか決める値
	 * conversionCount:何個変換するか決める値
	 */
	static int setN(int intNumber, int numberCount, int conversionCount){
		// 整数を変換したビット値を入れる変数
		String bitString ="";
		// 32桁分ループする
		for (int count = 31; count >= 0; count--) {
			// 指定された位置からconversionCountの間か判定する
			if (count >= numberCount && count < numberCount + conversionCount){
				// 1を変数に追加する
				bitString += 1;
			// それ以外の場合は通常のビット変換を行う
			} else {
				// countのビット数が1か判定して1か0をbitStringに追加する
				bitString += ((intNumber >>> count & 1) == 1) ? '1' : '0';
			}
		}
		// 変換した結果を表示する
		System.out.println(bitString);
		// ビット値を返却する
		return bitConversion(bitString);
	}

	/* 指定したビット位置から指定した数分を0にするメソッド
	 * intNumber:変換する整数値
	 * numberCount:何番目を最下位ビットするか決める値
	 * conversionCount:何個変換するか決める値
	 */
	static int resetN(int intNumber, int numberCount, int conversionCount){
		// 整数を変換したビット値を入れる変数
		String bitString ="";
		// 32桁分ループする
		for (int count = 31; count >= 0; count--) {
			// 指定された位置からconversionCountの間か判定する
			if (count >= numberCount && count < numberCount + conversionCount){
				// 指定された値を変数に入れる
				bitString += 0;
			// それ以外の場合は通常のビット変換を行う
			} else {
				// countのビット数が1か判定して1か0をbitStringに追加する
				bitString += ((intNumber >>> count & 1) == 1) ? '1' : '0';
			}
		}
		System.out.println(bitString);
		// ビット値を返却する
		return bitConversion(bitString);
	}

	/* 指定したビット位置から指定した数分を反転させるメソッド
	 * intNumber:変換する整数値
	 * numberCount:何番目を最下位ビットするか決める値
	 * conversionCount:何個変換するか決める値
	 */
	static int inverseN(int intNumber, int numberCount, int conversionCount){
		// 整数を変換したビット値を入れる変数
		String bitString ="";
		// 32桁分ループする
		for (int count = 31; count >= 0; count--) {
			// 指定された位置からconversionCountの間か判定する
			if (count >= numberCount && count < numberCount + conversionCount){
				// 変換位置の数値が1か判定する
				if(getBit(intNumber,count).equals("1")){
					// 0を変数に追加する
					bitString += 0;
				// 0の場合
				} else {
					// 1を変数に追加する
					bitString += 1;
				}
				// それ以外の場合は通常のビット変換を行う
			} else {
				// countのビット数が1か判定して1か0をbitStringに追加する
				bitString += ((intNumber >>> count & 1) == 1) ? '1' : '0';
			}
		}
		System.out.println(bitString);
		// ビット値を返却する
		return bitConversion(bitString);
	}

	/* 指定した値をビットで表示するメソッド
	 * intNumber:ビット表示する整数値
	 */
	static void printBits(int intNumber) {
		// 32桁分ループする
		for (int count = 31; count >= 0; count--) {
			// countのビット数が1か判定して1か0を表示する
			System.out.print(((intNumber >>> count & 1) == 1) ? '1' : '0');
		}
		// 改行する
		System.out.println();
	}

	/* 指定した位置のビット値を取得するメソッド
	 * intNumber:ビット表示する整数値
	 * numberCount:指定した位置のビット値を取得するための変数
	 */
	static String getBit(int intNumber, int numberCount) {
		String bitString ="";
		// 32桁分ループする
		for (int count = 31; count >= 0; count--) {
			// countのビット数が1か判定して1か0を表示する
			bitString += ((intNumber >>> count & 1) == 1) ? '1' : '0';
		}
		// 指定した位置のビット値を取得する
		String stringNum = bitString.substring(-1 * (numberCount -32) - 1, -1 * (numberCount -32));

		// 指定した位置のビット値を返却する
		return stringNum;
	}

	/* ビット表示された値を整数に変換するメソッド
	 * bitString:ビット表示された値
	 */
	static int bitConversion(String bitString){
		// 変換した値を入れる変数
		int intResult = 0;

		// 一文字ずつ計算するため、文字数分ループする
		for (int count = 0; count < bitString.length(); count++) {
			// 各桁の数値を抜き出す
			String stringNum = bitString.substring(count, count + 1);

			// 抜き出した数値が１の場合は計算する
			if (stringNum.equals("1")) {
				// 桁数にあわせた乗数を加算する
				intResult += intMultiplication(1, bitString.length() - count -1);
			}
		}

		// 変換した結果を返却する
		return intResult;
	}

	/* 2の乗数を計算するメソッド
	 * intNum:2の乗数にかける値
	 * multiplicationNumber:何乗するか決めるための値
	 */
	static int intMultiplication(int intNum, int multiplicationNumber) {
		// 結果を入れる変数※0乗の場合は1となるため、初期値を1にする
		int multiplicationResult = 1;
		// 指定した２の乗数を求める
		for (int count = 0; count < multiplicationNumber; count++) {
			multiplicationResult *= 2;
		}
		// 乗数をかけた値を返却する
		return intNum * multiplicationResult;
	}
}
