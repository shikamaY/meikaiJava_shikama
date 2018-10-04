package Ensyu12;

public class AccountTimeDeposit extends Account {
	// 定期預金を入れる変数
	private long timeDeposit;

	// コンストラクタ
	AccountTimeDeposit(String accountName, String accountNo, long balance, long timeDeposit, Day openingDate) {
		// 親クラスのコンストラクタを実行
		super(accountName, accountNo, balance, openingDate);
		this.timeDeposit = 0;
	}

	// 預金残高を返すメソッド
	long getTimeDeposit() {
		return timeDeposit;
	}

	// お金を預けるメソッド
	void setTimeDeposit(long money) {
		// 残高に加算する
		timeDeposit += money;
	}

	// 普通預金と定期預金の残高を比較するメソッド
	static int compBalance(AccountTimeDeposit accountA, AccountTimeDeposit accountB) {
		// 預金の合計を入れる変数を用意する
		long accountSumA = accountA.getBalance();
		// 預金の合計を入れる変数を用意する
		long accountSumB = accountB.getBalance();

		// 定期預金分を加算する
		accountSumA += accountA.getTimeDeposit();
		// 定期預金分を加算する
		accountSumB += accountB.getTimeDeposit();

		// AとBを比較する
		if (accountSumA == accountSumB) {
			// 同じ場合は0を返す
			return 0;
		// Aが大きい場合
		} else if (accountSumA > accountSumB) {
			// 1を返す
			return 1;
		// Bが大きい場合
		} else {
			// -1を返す
			return -1;
		}
	}

	// 普通預金と定期預金の残高を比較するメソッド
	static int compBalance(AccountTimeDeposit accountA, Account accountB) {
		// 預金の合計を入れる変数を用意する
		long accountSumA = accountA.getBalance();
		// 預金の合計を入れる変数を用意する
		long accountSumB = accountB.getBalance();

		// AとBを比較する
		if (accountSumA == accountSumB) {
			// 同じ場合は0を返す
			return 0;
		// Aが大きい場合
		} else if (accountSumA > accountSumB) {
			// 1を返す
			return 1;
		// Bが大きい場合
		} else {
			// -1を返す
			return -1;
		}
	}
}
