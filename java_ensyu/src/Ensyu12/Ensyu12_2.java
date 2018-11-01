package Ensyu12;

public class Ensyu12_2 {

	public static void main(String[] args) {
		// 口座インスタンスを生成
		AccountTimeDeposit accountA = new AccountTimeDeposit("口座JAVA","1111",1000000,0,new Day(2018,07,31));
		// 比較用のインスタンスを生成
		AccountTimeDeposit accountB = new AccountTimeDeposit("口座JAVA","1111",2000000,10000,new Day(2018,04,01));
		// 比較用の親クラスのインスタンスを生成
		Account accountC = new Account("口座JAVA","1111",1000000,new Day(2018,05,01));

		// 口座の情報を表示
		System.out.println("情報\n" + accountA);

		// お金を下ろす
		accountA.withdraw(10000);
		// 結果の表示
		System.out.println("残高:" + accountA.getBalance());
		// お金を預ける
		accountA.setDeposit(10000);
		// 結果の表示
		System.out.println("残高A:" + accountA.getBalance());
		// 定期預金する
		accountA.setTimeDeposit(1000000);
		// 定期預金を確認する
		System.out.println("定期預金:" + accountA.getTimeDeposit());
		// 預金比較
		System.out.println("口座AとBの預金比較結果:" + accountA.compBalance(accountA, accountB));
		// 定期預金する
		accountA.setTimeDeposit(1000000);
		// 預金比較
		System.out.println("口座AとBの預金比較結果:" + accountA.compBalance(accountA, accountB));
		// 定期預金する
		accountB.setTimeDeposit(10000000);
		// 預金比較
		System.out.println("口座AとBの預金比較結果:" + accountA.compBalance(accountA, accountB));
		// 預金比較
		System.out.println("口座AとCの預金比較結果:" + accountA.compBalance(accountA, accountC));
		// 定期預金する
		accountC.withdraw(10000000);
		// 預金比較
		System.out.println("口座AとCの預金比較結果:" + accountA.compBalance(accountA, accountC));
		// 定期預金する
		accountA.withdraw(11000000);
		// 預金比較
		System.out.println("口座AとCの預金比較結果:" + accountA.compBalance(accountA, accountC));

	}

}
