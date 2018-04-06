package ensyu7;

import java.util.Scanner;

/* 演習7-13
 * 整数ｘのビット目を１にした値を返すメソッドset、0にした値を返すメソッドreset、反転した値を返すメソッドinverseを作成せよ
 */
public class Ensyu7_13 {

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
		// 変換結果を分かるようにするため、指定したビットの数値を出力する
		System.out.println(numberCount +"ビット目の値は" + getBit(intNumber,numberCount) + "です。");

		// 入力値を引数にset変換を行う
		System.out.println("set変換後：" + set(intNumber,numberCount));
		// 入力値を引数にreset変換を行う
		System.out.println("reset変換後：" +reset(intNumber,numberCount));
		// 入力値を引数にinverse変換を行う
		System.out.println("inverse変換後：" +inverse(intNumber,numberCount));
	}

	/* 指定したビットが0の場合１にするメソッド
	 * intNumber:変換する整数値
	 * numberCount:何番目のビットか決める値
	 */
	static int set(int intNumber, int numberCount){
		// 指定した値の位置のビット値を取得する
		String getBitResult = getBit(intNumber,numberCount);
		// 変換後のビット値を入れる変数
		String bitString = "";
		// 指定した位置のビット値が0か判定する
		if (getBitResult.equals("0")) {
			// 指定した位置のビットを1にしたビット値をだす
			bitString = setBit(intNumber,numberCount,1);
		} else {
			// 指定した位置のビットを1にしたビット値をだす
			bitString = setBit(intNumber,numberCount,1);
		}
		// ビット値を整数に変換して、返却する
		return bitConversion(bitString);
	}

	/* 指定したビットが1の場合0にするメソッド
	 * intNumber:変換する整数値
	 * numberCount:何番目のビットか決める値
	 */
	static int reset(int intNumber, int numberCount){
		// 指定した値の位置のビット値を取得する
		String getBitResult = getBit(intNumber,numberCount);
		// 変換後のビット値を入れる変数
		String bitString = "";
		// 指定した位置のビット値が0か判定する
		if (getBitResult.equals("1")) {
			// 指定した位置のビットを0にしたビット値をだす
			bitString = setBit(intNumber,numberCount,0);
		} else {
			// 指定した位置のビットを0にしたビット値をだす
			bitString = setBit(intNumber,numberCount,0);
		}
		// ビット値を整数に変換して、返却する
		return bitConversion(bitString);
	}

	/* 指定したビットを反転させるメソッド
	 * intNumber:変換する整数値
	 * numberCount:何番目のビットか決める値
	 */
	static int inverse(int intNumber, int numberCount){
		// 指定した値の位置のビット値を取得する
		String getBitResult = getBit(intNumber,numberCount);
		// 変換後のビット値を入れる変数
		String bitString = "";
		// 指定した位置のビット値が0か判定する
		if (getBitResult.equals("0")) {
			// 指定した位置のビットを1にしたビット値をだす
			bitString = setBit(intNumber,numberCount,1);
		// 指定した位置のビット値が1か判定する
		} else if(getBitResult.equals("1")) {
			// 指定した位置のビットを0にしたビット値をだす
			bitString = setBit(intNumber,numberCount,0);
		}
		// ビット値を整数に変換して、返却する
		return bitConversion(bitString);
	}

	/* 指定した値をビットで表示するメソッド
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

	/* 指定した位置のビット値を変更するメソッド
	 * intNumber:ビット変換する整数値
	 * numberCount:変更する位置を指定する変数
	 * setNumber:変更する値
	 */
	static String setBit(int intNumber, int numberCount, int setNumber){
		// 整数を変換したビット値を入れる変数
		String bitString ="";
		// 32桁分ループする
		for (int count = 31; count >= 0; count--) {
			// 指定された位置か判定する
			if (count == numberCount){
				// 指定された値を変数に入れる
				bitString += setNumber;
			} else {
				// countのビット数が1か判定して1か0をbitStringに追加する
				bitString += ((intNumber >>> count & 1) == 1) ? '1' : '0';
			}
		}
		// ビット値を返却する
		return bitString;
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
