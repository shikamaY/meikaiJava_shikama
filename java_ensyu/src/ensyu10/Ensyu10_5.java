package ensyu10;

/* 演習10-5
 * インスタンスが生成されるたびに「明解銀行での口座開設ありがとうございます。」と表示するように、
 * 銀行口座クラスAccountを変更せよ。表示はインスタンス初期化子で行うこと
 */
public class Ensyu10_5 {

	public static void main(String[] args) {
		// 生成時のメッセージ確認のため、インスタンスを生成する
		Account accountNo1 = new Account("口座JAVA","1111",1000000,new Day(2018,07,31));
		// 生成時のメッセージ確認のため、インスタンスを生成する
		Account accountNo2 = new Account("口座JAVA","1111",1000000,new Day(2018,07,31));
		// 生成時のメッセージ確認のため、インスタンスを生成する
		Account accountNo3 = new Account("口座JAVA","1111",1000000,new Day(2018,07,31));


	}

}
