package Ensyu13;

import java.util.Random;

public class Computer extends Player{
	// じゃんけんの手の種類
	final int INT_HAND_PATTERN = 3;

	// コンストラクタ
	Computer() {
		// コンピュータのだす手を決定する
		setHand();
	}

	// 出す手を決めるメソッド
	public void setHand() {
		// Randomクラスのオブジェクトを生成
		Random rand = new Random();
		// 1桁の正の数値を生成する
		mPlayerHund = rand.nextInt(INT_HAND_PATTERN);
	}

	// 手を返却するメソッド
	public int getHand() {
		// 手を返却する
		return mPlayerHund;
	}
}
