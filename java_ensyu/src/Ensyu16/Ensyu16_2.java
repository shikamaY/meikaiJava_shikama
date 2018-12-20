/* 演習16-2
 * List16-6（P.523)のtry文では、ParametrRangeError例外とResulRangeError例外を別々の例外ハンドラで捕捉している。
 * 単一の例外ハンドラで補足するように変更したプログラムを作成せよ
 */

package Ensyu16;

import java.util.Scanner;

public class Ensyu16_2 {

	public static void main(String[] args) {
		// ユーザ入力のため、Scannerクラスのオブジェクトを生成する
		Scanner standardInput = new Scanner(System.in);

		// 入力を促すメッセージを表示
		System.out.print("整数a:");
		// 入力値を代入
		int intA = standardInput.nextInt();
		// 入力を促すメッセージを表示
		System.out.print("整数b:");
		// 入力値を代入
		int intB = standardInput.nextInt();

		// エラーハンドリング
		try {
			// 入力値の計算結果を表示する
			System.out.println("それらの和は" + add(intA,intB) + "です。");
		// 入力値が範囲外の場合
		} catch (RangeError exception) {
			// エラー内容の表示
			System.out.println("数値が範囲外です。" + exception.getMessage());
		}
	}

	// 対象の値が一桁か判定するメソッド
	static boolean isValid(int intNumber) {
		return intNumber >= 0 && intNumber <=9;
	}

	// 引数の値、計算結果を桁数をチェックするメソッド
	static int add(int intA, int intB) throws ParameterRangeError,ResultRangeError {
		// 引数の桁数をチェック
		if (!isValid(intA)) throw new ParameterRangeError(intA);
		// 引数の桁数をチェック
		if (!isValid(intB)) throw new ParameterRangeError(intB);
		// 計算処理
		int result = intA + intB;
		// 計算結果の桁数をチェック
		if (!isValid(result)) throw new ResultRangeError(result);
		// 計算結果の返却
		return result;
	}
}

// 値が範囲外の場合に出すException
class RangeError extends RuntimeException {
	// コンストラクタ
	RangeError(int intNumber) {
		// Exceptionの表示内容の設定
		super("範囲外の値:" + intNumber);
	}
}

// 計算結果が範囲外の場合に出すException
class ParameterRangeError extends RangeError {
	// コンストラクタ
	ParameterRangeError(int intNumber) {
		// Exceptionの表示内容の設定
		super(intNumber);
	}
}

// 引数が範囲外の場合に出すException
class ResultRangeError extends RangeError {
	// コンストラクタ
	ResultRangeError(int intNumber) {
		// Exceptionの表示内容の設定
		super(intNumber);
	}
}