import Ensyu11.DateId;

/* Lst10-12(p.356)のクラスDateIdをパッケージごとに所属させるように書き換えよ
 *
 */

public class DateIdTester {

	public static void main(String[] args) {
		// ID1のインスタンスを生成
		DateId ID1 = new DateId();
		// ID2のインスタンスを生成
		DateId ID2 = new DateId();
		// ID3のインスタンスを生成
		DateId ID3 = new DateId();

		// インスタンスのIDを取得
		System.out.println("ID1の識別番号:" + ID1.getId());
		// インスタンスのIDを取得
		System.out.println("ID2の識別番号:" + ID2.getId());
		// インスタンスのIDを取得
		System.out.println("ID3の識別番号:" + ID3.getId());
	}

}
