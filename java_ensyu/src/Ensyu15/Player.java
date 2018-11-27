package Ensyu15;

public abstract class Player {

	// プレイヤーの手を入れる変数
	int mPlayerHund;

	// プレイヤーの手を決定するメソッド
	public abstract void setHand();

	// プレイヤーの手を返却するメソッド
	public abstract int getHand();

	// 手を表示するメソッド
	public void printHand() {
		// 0の場合
		if (mPlayerHund == 0) {
			// 手を表示する
			System.out.println("グー");
		// 1の場合
		} else if (mPlayerHund == 1) {
			// 手を表示する
			System.out.println("チョキ");
		// 2の場合
		} else {
			// 手を表示する
			System.out.println("パー");
		}
	}
}