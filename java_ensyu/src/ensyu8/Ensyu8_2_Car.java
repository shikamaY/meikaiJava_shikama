package ensyu8;

public class Ensyu8_2_Car {
	// 名前入れる変数
	private String name;
	// ナンバーを入れる変数
	private String number;
	// 幅を入れる変数
	private int width;
	// 高さを入れる変数
	private int height;
	// 長さを入れる変数
	private int length;
	// 現在地Xを入れる変数
	private double positionX;
	// 現在地Yを入れる変数
	private double positionY;
	// タンクのサイズをれる変数
	private double maxFuel;
	// 燃料を入れる変数
	private double fuel;

	// コンストラクタ
	Ensyu8_2_Car(String name, String number, int width, int height, int lenght, double maxFuel) {
		// 名前を代入
		this.name = name;
		// ナンバーを代入
		this.number = number;
		// 幅を代入
		this.width = width;
		// 高さを代入
		this.height = height;
		// 長さを代入
		this.length = length;
		// タンクの大きさを代入
		this.maxFuel = maxFuel;
		// 燃料を代入(初期値は満タン）
		this.fuel = maxFuel;
		// 現在地の設定
		positionX = positionY = 0.0;
	}

	// 現在地Xを取得するメソッド
	double getPositionX() {
		// 現在地Xを返す
		return positionX;
	}
	// 現在地Yを取得するメソッド
	double getPositionY() {
		// 現在地Yを返す
		return positionY;
	}
	// タンクの大きさを返すメソッド
	double getMaxFuel() {
		return maxFuel;
	}
	// 燃料を取得するメソッド
	double getFuel() {
		// 燃料を返す
		return fuel;
	}

	// 給油するメソッド
	void setFuel(double addFuel) {
		// タンク容量を超えていないか判定
		if ( addFuel + fuel > maxFuel) {
			// 超えている場合は給油しない
			System.out.println("燃料がいっぱいです");
		// 超えていない場合
		} else {
			// 給油
			fuel += addFuel;
		}
	}

	// 車のスペックを表示するメソッド
	void putSpec() {
		// 名前を表示する
		System.out.println("名前：" + name);
		// ナンバーを表示する
		System.out.println("ナンバー：" + number);
		// 車幅を表示する
		System.out.println("車幅：" + width + "mm");
		// 車高を表示する
		System.out.println("車高：" + height + "mm");
		// 車長を表示する
		System.out.println("車長：" + length + "mm");
	}

	// 車の位置を移動させるメソッド
	boolean move(double moveX, double moveY) {
		// 移動に必要な燃料の計算
		double dist = Math.sqrt(moveX * moveX + moveY * moveY);

		// 移動に必要な燃料が足りているか判定
		if (dist > fuel) {
			// 足りていない場合はfalseを返す
			return false;
		// 燃料が足りている場合
		} else {
			// 移動する分の燃料を減らす
			fuel -= dist;
			// 移動分加算する
			positionX += moveX;
			// 移動分加算する
			positionY += moveY;
			// trueを返す
			return true;
		}
	}
}
