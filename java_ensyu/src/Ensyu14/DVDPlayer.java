package Ensyu14;

public class DVDPlayer implements ExPlayer {
	// 再生メソッド
	public void play() {
		// メッセージを表示する
		System.out.println("■DVD再生開始");
	}
	// 停止メソッド
	public void stop() {
		// メッセージを表示する
		System.out.println("■DVD再生終了");
	}
	// スロー再生メソッド
	public void slow() {
		// メッセージを表示する
		System.out.println("■DVDスロー再生開始");
	}

}
