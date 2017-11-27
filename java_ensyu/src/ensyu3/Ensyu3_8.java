package ensyu3;

import java.util.Scanner;

public class Ensyu3_8 {

	public static void main(String[] args) {
		// Scannerクラスのオブジェクトを生成
		Scanner stdIn = new Scanner(System.in);
		// 点数を入力を促すコメント表示する
		System.out.print("点数:");
		// 入力値をint型のnumに代入する
		int point  = stdIn.nextInt();
		// 入力値が60点未満か判定する
		if(point < 60) {
			// 不可と表示する
			System.out.println("不可");
		// 入力値が60～69点か判定する
		} else if (point >= 60 && point < 70) {
			// 可と表示する
			System.out.println("可");
		// 入力値が70～79点か判定する
		} else if (point >= 70 && point < 80) {
			// 良と表示する
			System.out.println("良");
		// 入力値が80～100点か判定する
		} else if (point >= 80 && point <= 100) {
			// 優と表示する
			System.out.println("優");
		}
	}

}
