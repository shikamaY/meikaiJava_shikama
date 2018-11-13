package Ensyu13;

/* 演習13-3
 * じゃんけんの＜プレーヤ＞を表す抽象クラスを定義せよ。そのクラスから、以下のクラスを派生すること
 * ・人間プレーヤクラス（手をキーボードから読み込む）
 * ・コンピュータプレーヤクラス　（手を乱数で生成する）
 */
public class Ensyu13_3 {

	public static void main(String[] args) {
		Human playerHuman = new Human();
		Computer plyaerComputer = new Computer();

		playerHuman.printHand();
		plyaerComputer.printHand();
	}

}
