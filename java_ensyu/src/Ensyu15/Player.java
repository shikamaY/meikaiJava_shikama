package Ensyu15;

public abstract class Player {

	// じゃんけんのグー
	final int GOO_HAND = 0;
	// じゃんけんのチョキ
	final int CHOKEY_HAND = 1;
	// じゃんけんのパー
	final int PAR_HAND = 2;
	// プレイヤーの手を入れる変数
	int mPlayerHund;

	// プレイヤーの手を決定するメソッド
	public abstract void setHand();

	// プレイヤーの手を返却するメソッド
	public abstract int getHand();

	// 手を表示するメソッド
	public void printHand() {
		// 0の場合
		if (mPlayerHund == GOO_HAND) {
			// 手を表示する
			System.out.println("グー");
		// 1の場合
		} else if (mPlayerHund == CHOKEY_HAND) {
			// 手を表示する
			System.out.println("チョキ");
		// 2の場合
		} else {
			// 手を表示する
			System.out.println("パー");
		}
	}
}