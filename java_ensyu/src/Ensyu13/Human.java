package Ensyu13;

import java.util.Scanner;

public class Human extends Player {

	// コンストラクタ
	Human() {
		// 手の設定
		this.setHand();
	}
	// 手を決めるメソッド
	public void setHand() {
		// ユーザ入力のため、Scannerクラスのオブジェクトを生成する
		Scanner standardInput = new Scanner(System.in);

		// 入力させるためのメッセージを表示する
		System.out.print("手を入力してください。グー...0:チョキ...1:パー...2:");
		// 入力値を変数に代入する
		mPlayerHund = standardInput.nextInt();

	}

	// 手を返却するメソッド
	public int getHand() {
		// 手を返却する
		return mPlayerHund;
	}
}
