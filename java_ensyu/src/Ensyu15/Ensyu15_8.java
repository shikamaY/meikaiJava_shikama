package Ensyu15;

import static java.util.Calendar.*;

import java.util.GregorianCalendar;

/* 演習15-8
 * コマンドライン引数で指定された月のカレンダーを表示するプログラムを作成せよ
 * コマンドラインから年のみが与えられた場合、その年の1月から12月までのカレンダーを表示し、年と月が与えられた場合は
 * その月のカレンダーを表示して、年も月も与えられなかったら、現在の月のカレンダーを表示すること
 */

public class Ensyu15_8 {

	public static void main(String[] args) {
		// 対象年を入れる変数
		int targetYear = 0;
		// 対象月を入れる変数
		int targetMonth = 1;

		// 引数の数が1の場合
		if (args.length == 1) {
			// 引数が年の場合
			if (args[0].matches("[0-9][0-9][0-9][0-9]")) {
				// 年を変数に代入する
				targetYear = new Integer(args[0]);
				// 1年分のカレンダーの表示
				printCalendar(targetYear,1,12);
			// 引数が月の場合
			}
		// 引数が二つの場合
		} else if (args.length == 2) {
			// 年を変数に代入する
			targetYear = new Integer(args[0]);
			// 月を変数に代入する
			targetMonth = new Integer(args[1]);
			// 対象年月のカレンダーを表示
			printCalendar(targetYear,targetMonth,1);
		} else {
			// 実行した月のカレンダーを表示
			printCalendar(0,0,1);
		}
	}

	// カレンダーを生成するメソッド
	static void printCalendar(int year,int month ,int loopCount) {
		// カレンダーのサイズ
		final int calendarRow = 6;
		// カレンダーのサイズ
		final int calendarColumn = 7;

		// カレンダークラスをインスタンスか
		GregorianCalendar targetDate = new GregorianCalendar();
		// カレンダー用の配列を用意
		String[][] calendar = new String[calendarRow][calendarColumn];

		// 指定された回数ループする
		for (int count = 0; count < loopCount; count++){
			// 年と月が0以外の場合は引数の値をセットする
			if(year != 0 && month != 0) {
				targetDate.set(year, month + (count - 1), 1);
			}
			// 日にちの初期値
			int date = 1;
			// 空のカレンダーを生成
			setArraySpeace(calendar);

			// カレンダーのサイズ分ループする
			for (int countRow= 0; countRow < calendar.length;countRow++) {
				// カレンダーのサイズ分ループする
				for (int countColumn = 0; countColumn < calendar[countRow].length; countColumn++) {
					// 対象日にちの曜日を計算する
					int day= dayOfWeek(year,month + count,date);
					// 該当する位置に数値を代入する
					calendar[countRow][day] = String.valueOf(date);
					// 日にちを加算
					date++;
					// 対象月の最大日にちの場合
					if (date > targetDate.getActualMaximum(DATE)) {
						// ループを抜ける
						break;
					// 対象日にちが土曜日の場合
					} else if (day >= 6) {
						// ループを抜ける
						break;
					}
				}
				// 対象月の最大日にちの場合
				if (date > targetDate.getActualMaximum(DATE)) {
					// ループを抜ける
					break;
				}
			}
			// 何年何月か表示する
			System.out.println(targetDate.get(YEAR) + "年" + (targetDate.get(MONTH) + 1) +"月");
			// カレンダーのカラム
			System.out.println(" 日 月 火 水 木 金 土");
			// カレンダーの表示
			printArray(calendar);
		}

	}

	// 二次元配列を初期化するメソッド
	public static String[][] setArraySpeace(String[][] stringArray) {
		// 配列のサイズ分ループする
		for (int countRow= 0; countRow < stringArray.length;countRow++) {
			// 配列のサイズ分ループする
			for (int countColumn = 0; countColumn < stringArray[countRow].length; countColumn++) {
				// 要素にスペースを代入する
				stringArray[countRow][countColumn] = "  ";
			}
		}
		// 配列を返す
		return stringArray;
	}

	// 配列の中身を表示するメソッド
	public static void printArray(String[][] stringArray) {
		// 配列のサイズ分ループする
		for (int countRow= 0; countRow < stringArray.length;countRow++) {
			// 配列のサイズ分ループする
			for (int countColumn = 0; countColumn < stringArray[countRow].length; countColumn++) {
				// 各要素を表示する
				System.out.print(String.format("%3s",stringArray[countRow][countColumn]));
			}
			// 改行する
			System.out.println();
		}
	}

	// 年月日から曜日を算出するメソッド
	static int dayOfWeek(int year,int month ,int date) {
		// 年を計算用の変数に代入
		int clacYear = year;
		// 月を計算用の変数に代入
		int clacMonth = month;

		// 1月または2月の場合
		if (clacMonth == 1 || clacMonth == 2 ) {
			// 年を1減らす
			clacYear--;
			// 月に12を加える
			clacMonth += 12;
		}
		// 計算結果を0～6で返却する（日～土）
		return (clacYear + clacYear / 4 - clacYear / 100 + clacYear / 400 + (13 * clacMonth + 8) / 5 + date) % 7;
	}
}
