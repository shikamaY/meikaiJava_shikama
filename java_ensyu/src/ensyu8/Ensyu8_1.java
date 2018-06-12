package ensyu8;

import java.util.Scanner;

/* 演習8-1
 * 名前・身長・体重などをメンバとして持つ人間クラスを作成せよ
 */

public class Ensyu8_1 {

	public static void main(String[] args) {
		// ユーザ入力のため、Scannerクラスのオブジェクトを生成する
		Scanner standardInput = new Scanner(System.in);

		// ユーザに入力してもらう内容を表示
		System.out.print("名前:");
		// 入力値を代入する
		String name = standardInput.next();

		// ユーザに入力してもらう内容を表示
		System.out.print("身長:");
		// 入力値を代入する
		int height = standardInput.nextInt();

		// ユーザに入力してもらう内容を表示
		System.out.print("体重:");
		// 入力値を代入する
		int weight = standardInput.nextInt();

		// オブジェクトの生成
		Ensyu8_1_human humenA = new Ensyu8_1_human(name,height,weight);

		// 生成したオブジェクトの名前、身長、体重を表示する
		humenA.printDataAll();

		// ユーザに入力してもらう内容を表示
		System.out.print("名前の修正:");
		// 名前を変更するメソッドの実行
		humenA.setName(standardInput.next());
		// 変更後の値を表示する
		System.out.println("修正後の名前:" + humenA.getName());
		// ユーザに入力してもらう内容を表示
		System.out.println("身長の修正:");
		// 身長を変更するメソッドの実行
		humenA.setHeight(standardInput.nextInt());
		// 変更後の値を表示する
		System.out.println("修正後の身長:" + humenA.getHeight());
		// ユーザに入力してもらう内容を表示
		System.out.println("体重の修正:");
		// 体重を変更するメソッドの実行
		humenA.setWeight(standardInput.nextInt());
		// 変更後の値を表示する
		System.out.println("修正後の体重:" + humenA.getWeight());

	}

}

