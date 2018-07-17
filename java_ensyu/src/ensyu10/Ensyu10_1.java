package ensyu10;

/* 演習10_1
 * List10-3(p.340)に示した連番クラスIdに、最後に与えた識別番号を返すクラスメソッドgetMaxIdを追加せよ
 *
 */
public class Ensyu10_1 {

	public static void main(String[] args) {
		// インスタンスを作る数を定義する変数
		final int maxId = 5;
		// インスタンスを作るための配列を用意
		Id[] someId = new Id[maxId];

		// インスタンスを作成するループ
		for (int count = 0; count < maxId; count++) {
			// インスタンス生成
			someId[count] = new Id();
			// 識別番号の表示
			System.out.println("識別番号:" + someId[count].getId());
			// 連番を表示
			System.out.println("Id.counter:" + Id.counter);
		}
		// 最後に作成した識別番号を表示
		System.out.println("最後の識別番号:" + Id.getMaxId());
	}
}
