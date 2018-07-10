package Ensyu9;

/* 演習9-3
 * 第８章で作成した《銀行口座クラス（第２版）》に口座開設日のフィールドとtoStringメソッドを追加せよ
 * コンストラクタを変更したり、口座開設日ゲッタなどのメソッドを追加したりすること
 */
public class Ensyu9_3 {

	public static void main(String[] args) {

		// インスタンス生成
		Ensyu9_3_Account account = new Ensyu9_3_Account("口座JAVA","1111",1000000,new Ensyu9_3_Day(2018,07,31));

		// 口座の情報を表示
		System.out.println("情報\n" + account);

		// お金を下ろす
		account.withdraw(10000);

		// 結果の表示
		System.out.println(account.getBalance());

		// お金を預ける
		account.deposit(100000);

		// 結果の表示
		System.out.println(account.getBalance());

		// 口座の開設日を表示
		System.out.println(account.getOpeningDate());
	}

}
