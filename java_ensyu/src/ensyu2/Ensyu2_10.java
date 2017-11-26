package ensyu2;

import java.util.Scanner;

public class Ensyu2_10 {

	public static void main(String[] args) {
		// Scannerクラスのオブジェクトを生成
		Scanner stdIn = new Scanner(System.in);
		// 姓を入力を促すコメント表示する
		System.out.print("姓:");
		// 入力値をStaring型のlastNameに代入する
		String lastName  = stdIn.next();
		// 名を入力を促すコメント表示する
		System.out.print("名:");
		// 入力値をStaring型のfirstNameに代入する
		String firstName  = stdIn.next();
		//挨拶を表示する
		System.out.println("こんにちは" + lastName + firstName + "さん。");
	}

}
