package Ensyu14;

public class Pet {
	// ペットの名前を入れる変数
	String mName;
	// 飼い主の名前を入れる変数
	String mMasterName;

	// コンストラクタ
	public Pet(String name, String masterName) {
		// ペットの名前を設定
		this.mName = name;
		// 飼い主の名前を設定
		this.mMasterName = masterName;
	}

	// ペットの名前を取得するメソッド
	public String getName() {
		// ペットの名前を返却
		return mName;
	}

	// 飼い主の名前を取得するメソッド
	public String getMasterName() {
		// 飼い主の名前を返却
		return mMasterName;
	}

	// 自己紹介するメソッド
	public void introduce() {
		// ペット名を表示する
		System.out.println("■僕の名前は" + mName + "です！");
		// 飼い主名を表示する
		System.out.println("■ご主人様は" + mMasterName + "です！");
	}

}