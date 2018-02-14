package ensyu6;

import java.util.Random;
import java.util.Scanner;

/* 演習6-15
 * 曜日を表示して、その英語表現を入力させる英単語学習プログラムを作成せよ
 * ・出題する月の曜日は乱数で生成する。
 * ・学習者が望む限り、何度も繰り返せる
 * ・同一曜日を連続して出題しない
 */
public class Ensyu6_15 {

	// 入力を促すメッセージ用の定数
	public static String EXAMINATION_SENTENCE = "英語の月名を入力してください。\nなお、先頭は大文字で、2文字目以降は小文字とします。";

	public static void main(String[] args) {
		// ランダムな配列の要素を作るため、Randomクラスのオブジェトを生成する
		Random rand = new Random();
		// ユーザ入力のため、Scannerクラスのオブジェクトを生成する
		Scanner standardInput = new Scanner(System.in);

		// 月の英語名の正解を配列で用意する
		String[] theDayOfTheWeekEnglishString = {
				"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"
				};
		String[] theDayOfTheWeekJapaneseString = {
				"日曜日","月曜日","火曜日","水曜日","木曜日","金曜日","土曜日"
		};

		// ループの判定用変数、0:終了,1:出題,2:再解答
		int answerFlag = 1;
		// 前回と同じ問題を出さないため、前回の曜日のインデックスだったかを入れる判定用の変数
		int lastMonth = 0;
		// 出題する問題の曜日のインデックスを入れる変数
		int randIndex = 0;
		// 要素を入力してもらうため、何を入力するか表示する
		System.out.println(EXAMINATION_SENTENCE);
		do {
			// 新たに問題を出すか、再回答か判定するためにanswerFlagの値を確認する
			if (answerFlag == 1) {
				// 前回の問題と同じものが出ないようにループする
				do {
					// 何曜日を入力させるか表示するため、ランダムな値を生成する
					randIndex = rand.nextInt(theDayOfTheWeekEnglishString.length);
				// 生成された問題が前回と同じ場合は再度乱数を生成する
				} while (lastMonth == randIndex);
			}

			// 問題に解答してもらうため、何曜日の英語を入力するか表示する
			System.out.print(theDayOfTheWeekJapaneseString[randIndex] + ":");
			// 入力値をが正解か判定するために、変数に代入する
			String monthAnswer = standardInput.next();
			// 正解か判定するために入力値と配列で用意した曜日の英語名を比較する
			if (monthAnswer.equals(theDayOfTheWeekEnglishString[randIndex])) {
				// 比較の結果を表示する
				System.out.print("正解です。");
				// 新たに問題に解答するかユーザに入力してもらう（誤った値を入力された場合は再度入力を促す）
				do {
					// 新たに問題を回答するかどうか入力を促すメッセージを表示する
					System.out.print("もう一度？1・・・Yes/0・・・No");
					// 入力値をループ判定用変数に代入する
					answerFlag = standardInput.nextInt();
					// 同じ問題を出さないために変数に今回の問題を代入する
					lastMonth = randIndex;
				// 正しい入力か判定する
				} while (!(answerFlag == 1 || answerFlag == 0));
			// 入力値が間違っていた場合の処理
			} else {
				// 間違っていることを表示する
				System.out.println("違います");
				// 再度解答を入力してもらうために判定用フラグに2（再解答）を代入する
				answerFlag = 2;
			}
		// ループ判定用フラグが0（終了）場合はループを終わる
		} while (answerFlag != 0);
	}

}

