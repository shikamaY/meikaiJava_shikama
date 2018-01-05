package ensyu4;

import java.util.Scanner;

public class Ensyu4_23 {

	public static void main(String[] args) {
		// ユーザ入力のため、Scannerクラスのオブジェクトを生成
		Scanner standardInput = new Scanner(System.in);

		// 入力を促すメッセージを表示する
		System.out.println("段数は:");
		// 入力値を変数に入れる
		int inputNum = standardInput.nextInt();

		// 最終行の*の数
		int asteriskCountLast = (inputNum - 1) * 2 + 1;;
		// *のカウント用変数
		int asteriskCount;
		// スペースのカウント用変数
		int spaceCount;
		// 指定段数を表示するため、入力値分ループする
		for (int countRaw = 1; countRaw <= inputNum; countRaw++) {
			// *の数を決定する
			asteriskCount = (countRaw - 1) * 2 + 1;
			// スペースの数を決定する
			spaceCount = asteriskCountLast - asteriskCount;
			// 段数と逆の数分*を表示するため、inputNumからcountColを引いた回数ループする
			for (int countCol = 1; countCol <= asteriskCountLast; countCol++) {
				// 前半部分のスペース表示か判定する
				if (countCol <= spaceCount / 2 ) {
					// スペースを表示する
					System.out.print(' ');
				// *マークの表示か判定する
				} else if (countCol <= spaceCount / 2  + asteriskCount) {
					// *を表示する
					System.out.print(countRaw % 10);
				// 残りはスペースを表示する
				} else {
					// スペースを表示する
					System.out.print(' ');
				}
			}
			System.out.println();
		}
	}

}
