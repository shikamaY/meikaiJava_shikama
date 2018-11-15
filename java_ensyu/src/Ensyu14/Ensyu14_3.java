package Ensyu14;

/* DVDPlayerを利用するプログラムを作成せよ
 */

public class Ensyu14_3 {

	public static void main(String[] args) {
		// インスタンスを生成
		DVDPlayer DVDPlayerA = new DVDPlayer();

		// プレイヤーの再生
		DVDPlayerA.play();
		// プレイヤーの停止
		DVDPlayerA.stop();
		// プレイヤーのスロー再生
		DVDPlayerA.slow();
	}

}
