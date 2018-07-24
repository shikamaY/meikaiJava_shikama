package ensyu7;

public class Ensyu7_13_Re {

	public static void main(String[] args) {
		printBits(101);
		b(101,0);
	}

	static int countBits(int intNumber){
		intNumber = (intNumber & 0x55555555) + (intNumber >> 1 & 0x55555555);
		intNumber = (intNumber & 0x33333333) + (intNumber >> 2 & 0x33333333);
		intNumber = (intNumber & 0x0f0f0f0f) + (intNumber >> 4 & 0x0f0f0f0f);
		intNumber = (intNumber & 0x00ff00ff) + (intNumber >> 8 & 0x00ff00ff);

		return (intNumber & 0x0000ffff) + (intNumber >> 16 & 0x0000ffff);
	}

	static int b(int intNumber, int count){
		int a = 0;
		int re = 0;
		while (intNumber != 0) {

			if ((intNumber & 1) == 1 && a == count ){
				re=1;
			}
			intNumber >>>= 1;
			a++;
		}

		System.out.println(re);
		return re;
	}

	/* 指定した値をビットで表示するメソッド
	 * intNumber:ビット表示する整数値
	 */
	static void printBits(int intNumber) {
		// 32桁分ループする
		for (int count = 31; count >= 0; count--) {
			// countのビット数が1か判定して1か0を表示する
			System.out.print(((intNumber >>> count & 1) == 1) ? '1' : '0');
		}
		// 改行する
		System.out.println();
	}

}
