package Ensyu12;

public class Account {
	// 口座名を入れる変数
	private String accountName;
	// 口座番号を入れる変数
	private String accountNo;
	// 預金残高を入れる変数
	private long balance;
	// 口座開設日を設定する変数
	private Day openingDate;

	// コンストラクタ
	Account(String accountName, String accountNo, long balance, Day openingDate) {
		// 口座名に代入
		this.accountName = accountName;
		// 口座番号に代入
		this.accountNo = accountNo;
		// 預金残高
		this.balance = balance;
		// 口座開設日を設定
		this.openingDate = new Day(openingDate);
	}

	// 口座名を返すメソッド
	String getAccountName() {
		// 口座名を返却
		return accountName;
	}

	// 口座番号を返すメソッド
	String getAccountNo() {
		// 口座番号を返却
		return accountNo;
	}

	// 預金残高を返すメソッド
	long getBalance() {
		return balance;
	}

	// お金を預けるメソッド
	void setDeposit(long money) {
		// 残高に加算する
		balance += money;
	}

	// お金を下ろすメソッド
	void withdraw(long money) {
		// 残高を減算する
		balance -= money;
	}

	// 口座開設日を返却するメソッド
	Day getOpeningDate() {
		// 口座開設日を返す
		return new Day(openingDate);
	}

	// 口座情報を返すtoStringメソッド
	public String toString() {
		// 口座名、番号、開設日を返す
		return String.format("口座名:%s\n口座番号:%s\n口座開設日:%s\n残高:%d", accountName,accountNo,openingDate,balance);
	}
}
