package Ensyu12;

public class Account {
	// 口座名を入れる変数
	private String mAccountName;
	// 口座番号を入れる変数
	private String mAccountNo;
	// 預金残高を入れる変数
	private long mBalance;
	// 口座開設日を設定する変数
	private Day mOpeningDate;

	// コンストラクタ
	Account(String accountName, String accountNo, long balance, Day openingDate) {
		// 口座名に代入
		this.mAccountName = accountName;
		// 口座番号に代入
		this.mAccountNo = accountNo;
		// 預金残高
		this.mBalance = balance;
		// 口座開設日を設定
		this.mOpeningDate = new Day(openingDate);
	}

	// 口座名を返すメソッド
	String getAccountName() {
		// 口座名を返却
		return mAccountName;
	}

	// 口座番号を返すメソッド
	String getAccountNo() {
		// 口座番号を返却
		return mAccountNo;
	}

	// 預金残高を返すメソッド
	long getBalance() {
		return mBalance;
	}

	// お金を預けるメソッド
	void setDeposit(long money) {
		// 残高に加算する
		mBalance += money;
	}

	// お金を下ろすメソッド
	void withdraw(long money) {
		// 残高を減算する
		mBalance -= money;
	}

	// 口座開設日を返却するメソッド
	Day getOpeningDate() {
		// 口座開設日を返す
		return new Day(mOpeningDate);
	}

	// 口座情報を返すtoStringメソッド
	public String toString() {
		// 口座名、番号、開設日を返す
		return String.format("口座名:%s\n口座番号:%s\n口座開設日:%s\n残高:%d", mAccountName,mAccountNo,mOpeningDate,mBalance);
	}
}
