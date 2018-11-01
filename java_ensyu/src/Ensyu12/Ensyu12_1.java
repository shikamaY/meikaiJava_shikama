package Ensyu12;

public class Ensyu12_1 {

	public static void main(String[] args) {
		// 日付のインスタンスを生成
		Day buyDay = new Day(2018,7,5);
		// 日付を表示
		System.out.println("日付：" + buyDay.getYear() + "/" + buyDay.getMonth() + "/" + buyDay.getDate());
		// 年の変更
		buyDay.setYear(2010);
		// 月の変更
		buyDay.setMonth(8);
		// 日の変更
		buyDay.setDate(10);
		// 日付と曜日の表示
		System.out.println(buyDay.toString());
		// 比較用の日付のインスタンスを生成
		Day buyDay2 = new Day(2018,7,5);
		// 日付比較メソッドの確認
		System.out.println("日付：" + buyDay2.getYear() + "/" + buyDay2.getMonth() + "/" + buyDay2.getDate() + "と比較結果:" +buyDay.equals(buyDay2));

		// 車のインスタンスを生成
		mileageCar myCar = new mileageCar("myCar", 100, 150, 200, 500,buyDay);

		// 車の情報を表示する
		myCar.putSpec();
		// 購入日の表示
		myCar.getPurchaseDay();
		// 現在の位置を表示する
		System.out.println("Xの座標:" + myCar.getX() + "Yの座標:" + myCar.getY() + "燃料" + myCar.getFuel());
		// 現在の走行距離を表示する
		System.out.println("走行距離" + myCar.getMileage());
		// 移動する
		myCar.move(50, 20);
		// 現在の走行距離を表示する
		System.out.println("走行距離" + myCar.getMileage());
		// 現在の位置を表示する
		System.out.println("Xの座標:" + myCar.getX() + "Yの座標:" + myCar.getY() + "燃料" + myCar.getFuel());
	}
}
