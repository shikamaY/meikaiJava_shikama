package Ensyu12;

public class Ensyu12_1 {

	public static void main(String[] args) {

		// 車のインスタンスを生成
		mileageCar myCar = new mileageCar("myCar", 100, 150, 200, 500,new Day(2018,7,5));

		// 車の情報を表示する
		myCar.putSpec();

		// 現在の走行距離を表示する
		System.out.println(myCar.getMileage());
		// 移動する
		myCar.move(10, 20);
		// 現在の走行距離を表示する
		System.out.println(myCar.getMileage());

	}
}
