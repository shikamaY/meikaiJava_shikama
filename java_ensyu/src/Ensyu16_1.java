import java.util.Scanner;

/* List16-4(p.518)のtry文ではException例外とRuntimeException例外を、単一の例外ハンドらで
 * 捕捉している。二つの例外を別々に補足するように変更したプログラムを作成せよ
 */

public class Ensyu16_1 {

	public static void main(String[] args) {
		// Scannerクラスをインスタンス化
		Scanner stdIn = new Scanner(System.in);
		// 入力を促すメッセージの表示
		System.out.print("sw:");
		// 入力値を代入
		int inputNumber = stdIn.nextInt();

		// 例外処理
		try {
			// 入力値のチェック
			test(inputNumber);
		// RuntimeExceptionの場合
		} catch (RuntimeException exception) {
			// エラーメッセ時の表示
			System.out.println(exception.getMessage());
		// Exceptionの場合
		} catch (Exception exception) {
			// エラーメッセ時の表示
			System.out.println(exception.getMessage());
		}
	}

	// Exceptionを発生させるメソッド
	static void check(int inputNumber) throws Exception {
		// 引数の判別
		switch(inputNumber) {
		// Exceptionを生成
		case 1: throw new Exception("検査例外発生！！");
		// RuntimeExceptionを生成
		case 2: throw new RuntimeException("非検査例外発生！！");
		}
	}

	// checkを呼び出すメソッド
	static void test(int inputNumber) throws Exception {
		// checkメソッドの実行
		check(inputNumber);
	}

}
