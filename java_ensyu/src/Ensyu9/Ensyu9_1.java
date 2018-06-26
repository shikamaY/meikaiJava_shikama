package Ensyu9;

import java.util.Scanner;

public class Ensyu9_1 {
	public static void main(String[] args) {
		// ユーザ入力のため、Scannerクラスのオブジェクトを生成する
		Scanner standardInput = new Scanner(System.in);

		// 人間クラスの配列を生成
		Ensyu9_1_humen[] humen = new Ensyu9_1_humen[] {
				new Ensyu9_1_humen("humanA",180,60),
				new Ensyu9_1_humen("humanB",160,50),
				new Ensyu9_1_humen("humanC",190,65)
				};

		// 生成したオブジェクトの情報を表示する
		for (int count = 0; count < humen.length; count++){
			// 生成したオブジェクトの名前、身長、体重を表示する
			humen[count].printDataAll();
		}

		// 名前を変更するメソッドの実行
		humen[1].setName("humanBB");
		// 変更後の値を表示する
		// 身長を変更するメソッドの実行
		humen[1].setHeight(100);
		// 体重を変更するメソッドの実行
		humen[2].setWeight(80);

		// 何を表示するか出力する
		System.out.println("値の修正後");
		// 結果確認のため生成したオブジェクトの情報を表示する
		for (int count = 0; count < humen.length; count++){
			// 生成したオブジェクトの名前、身長、体重を表示する
			humen[count].printDataAll();
		}
	}
}
