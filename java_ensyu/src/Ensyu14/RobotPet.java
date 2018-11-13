package Ensyu14;

public class RobotPet extends Pet implements Skinnable {

	// ロボットの色
	String mSkin = "BLACK";

	// コンストラクタ
	public RobotPet(String name, String masterName) {
		// 親クラスのコンストラクタを実行
		super(name,masterName);
	}

	// 色を取得するメソッド
	public String getSkin() {
		// 色を返却する
		return mSkin;
	}

	// 自己紹介するメソッド
	public void introduce() {
		// ペット名を表示する
		System.out.println("◇私はロボット。名前は" + mName + "です。色は" + mSkin + "です。");
		// 飼い主名を表示する
		System.out.println("◇ご主人様は" + mMasterName + "です！");
	}

	// 家事をするメソッド
	public void work(int sw) {
		// 引数に応じた処理の実行
		switch (sw) {
		// 0の場合の表示
		case 0:
			// 処理の表示
				System.out.println("掃除します。");
				// スイッチ分を抜ける
				break;
		// 1の場合の表示
		case 1:
			// 処理の表示
				System.out.println("洗濯します。");
				// スイッチ分を抜ける
				break;
		// 2の場合の表示
		case 2:
				// 処理の表示
				System.out.println("炊事します。");
				// スイッチ分を抜ける
				break;
		}
	}

	public void changeSkin(String skin) {
		// 引数に応じた処理の実行
		switch (skin) {
		// 黒の場合
		case "BLACK":
					// 色を変更
					mSkin = "BLACK";
					// スイッチ分を抜ける
					break;
		// 赤の場合
		case "RED":
					// 色を変更
					mSkin = "RED";
					// スイッチ分を抜ける
					break;
		// 青の場合
		case "BLUE":
					// 色を変更
					mSkin = "BLUE";
					// スイッチ分を抜ける
					break;
		// 緑の場合
		case "GREEN":
					// 色を変更
					mSkin = "GREEN";
					// スイッチ分を抜ける
					break;
		// 上記以外の場合
		default :
					// 色を変えないことを表示
					System.out.println("nochange");
					// スイッチ分を抜ける
					break;
		}
	}
}
