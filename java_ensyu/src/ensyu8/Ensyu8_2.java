package ensyu8;

import java.util.Scanner;

/* 自動車クラスCarに対して、フィールドやメソッドを自由に追加せよ
 */

public class Ensyu8_2 {

	public static void main(String[] args) {
		// ユーザ入力のため、Scannerクラスのオブジェクトを生成する
		Scanner standardInput = new Scanner(System.in);

		// ユーザに何をさせるか表示する
		System.out.println("車のデータを入力せよ");
		// 入力内容の表示
		System.out.print("車名:");
		// 入力値の代入
		String name = standardInput.next();
		// 入力内容の表示
		System.out.print("ナンバー:");
		// 入力値の代入
		String number = standardInput.next();
		// 入力内容の表示
		System.out.print("車幅:");
		// 入力値の代入
		int width = standardInput.nextInt();
		// 入力内容の表示
		System.out.print("高さ:");
		// 入力値の代入
		int height = standardInput.nextInt();
		// 入力内容の表示
		System.out.print("長さ:");
		// 入力値の代入
		int length = standardInput.nextInt();
		// 入力内容の表示
		System.out.print("タンクのサイズ:");
		// 入力値の代入
		double maxFuel = standardInput.nextDouble();

		// 入力内容の表示
		System.out.print("燃料:");
		// 入力値の代入
		double fuel = standardInput.nextDouble();

		// 車のオブジェクトを生成する
		Ensyu8_2_Car myCar = new Ensyu8_2_Car(name,number,width,height,length,maxFuel);

		// 作成した車の情報を表示する
		myCar.putSpec();

		// 終了判定用の変数
		int userInput;

		// 終了までループする
		do {
			// 車の現在地と燃料を表示する
			System.out.println("現在地(" + myCar.getPositionX() + "," + myCar.getPositionY() + ")残り燃料" + myCar.getFuel());
			// ユーザに給油するか選択させる
			System.out.print("給油しますか[0…no/1･･･yes]:");
			// 選択肢の判定
			if (standardInput.nextInt() == 1) {
				// 給油する場合は量を入力させる
				System.out.print("給油する量:");
				// 給油する
				myCar.setFuel(standardInput.nextDouble());
			}
			// 移動するかユーザに選択させる
			System.out.print("移動しますか[0…no/1･･･yes]:");
            // 選択肢の判定
			if (standardInput.nextInt() == 1) {
				// 移動距離を入力させる
            	System.out.println("X方向の移動距離:");
            	// 移動距離を変数に代入
            	double moveX = standardInput.nextInt();
            	// 移動距離を入力させる
            	System.out.println("Y方向の移動距離:");
            	// 移動距離を変数に代入
            	double moveY = standardInput.nextInt();
            	// 移動させる
            	if (!myCar.move(moveX,moveY)) {
            		// 燃料が足りない場合は移動しない
            		System.out.println("燃料が足りません");
            	}
            }
			// 現在地を表示する
            System.out.println("現在位置(" + myCar.getPositionX() + "," + myCar.getPositionY() + ")");
			// 終了するか選択させる
            System.out.print("終了しますか[0…no/1･･･yes]:");
            // 入力値を代入
			userInput = standardInput.nextInt();
		// 終了するか判定する
		} while (userInput == 0);
	}

}
