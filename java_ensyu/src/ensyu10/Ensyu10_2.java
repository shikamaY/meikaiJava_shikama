package ensyu10;

/* 演習10-2
 * 前門で作成したクラスIdを、以下のように変更したクラスExIdを作成せよ
 * インスタンスを生成するたびに識別番号をnずつ増やして与える（nは性の数）。nの値は指定されない限り1とするが、
 * メソッドを通じて取得変更できるようにする
 */

public class Ensyu10_2 {

	public static void main(String[] args) {
		// インスタンスを作る数を定義する変数
		final int maxId = 5;
		// 識別番号の増加量
		final int countUp=4;
		// インスタンスを作るための配列を用意
		ExId[] someId = new ExId[maxId];

		// 現在の増加量を表示
		System.out.println("識別番号の増加量" + ExId.getCountUp());
		// インスタンスを作成するループ
		for (int count = 0; count < maxId; count++) {
			// インスタンス生成
			someId[count] = new ExId();
			// 識別番号の表示
			System.out.println("識別番号:" + someId[count].getId());
			// 連番を表示
			System.out.println("Id.counter:" + ExId.counter);
		}

		// 増加量を変更
		ExId.setCountUp(countUp);

		// 現在の増加量を表示
		System.out.println("識別番号の増加量" + ExId.getCountUp());

		// インスタンス生成
		ExId newId = new ExId();

		// 最後に作成した識別番号を表示
		System.out.println("最後の識別番号:" + ExId.getMaxId());

	}

}
