package Ensyu15;

/* 演習15-5
 * 3人で行うじゃんけんプログラムを作成せよ。プレイヤー3人のうち2人はコンピュータとして、
 * 人間を一人とすること
 *
 */

public class Ensyu15_5 {

	public static void main(String[] args) {

		// 勝ち判定用の定数
		final int WIN = 2;
		// 負け判定用の定数
		final int LOSE = 1;
		// 引き分け判定用の定数
		final int DRAW = 0;
		// 勝敗判定計算用の定数
		final int JUDGE_NUMBER = 3;

		// 人間クラスのインスタンスを生成
		Human humanA = new Human();
		// コンピュータクラスのインスタンスを生成
		Computer computerA = new Computer();
		// コンピュータクラスのインスタンスを生成
		Computer computerB = new Computer();

		// 人間の手を表示
		humanA.printHand();
		// コンピュータの手を表示
		computerA.printHand();
		// コンピュータの手を表示
		computerB.printHand();

		// 人間の手を判定用変数にいれる
		int humanAHand = humanA.getHand();
		// コンピュータの手を判定用変数にいれる
		int computerAHand = computerA.getHand();
		// コンピュータ手を判定用変数にいれる
		int computerBHand = computerB.getHand();
		// 全員違う手の場合
		if (humanAHand + computerAHand + computerBHand == JUDGE_NUMBER) {
			// 結果を表示する
			System.out.println("引き分けです");
		// それ以外の場合
		} else {
			// 勝敗を判定する
			int judgeA = (humanAHand - computerAHand + JUDGE_NUMBER) % JUDGE_NUMBER;
			// 勝敗を判定する
			int judgeB = (humanAHand - computerBHand + JUDGE_NUMBER) % JUDGE_NUMBER;
			// どちらも引き分けの場合
			if (judgeA == DRAW && judgeB == DRAW) {
				// 結果を表示する
				System.out.println("引き分けです");
			// 両方に勝っている場合
			} else if (judgeA == WIN && judgeB == WIN) {
				// 結果を表示する
				System.out.println("勝ちです");
			// 片方に勝っている場合
			} else if (judgeA == WIN || judgeB == WIN) {
				// 結果を表示する
				System.out.println("片方には勝ちました");
			// 両方に負けている場合
			}else if ((judgeA == DRAW && judgeB == LOSE) || (judgeA == LOSE && judgeB == DRAW)) {
				// 結果を表示する
				System.out.println("片方に負けです");
			}else {
				// 結果を表示する
				System.out.println("負けです");
			}
		}
	}

}
