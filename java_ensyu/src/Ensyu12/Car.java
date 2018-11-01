package Ensyu12;

public class Car {
	// 車の名前
	private String mCarName;
	// 車の幅
	private int mCarWidth;
	// 車の高さ
	private int mCarHeight;
	// 車の幅
	private int mCarLength;
	// x軸の位置
	private double mPointX;
	// y軸の位置
	private double mPointY;
	// 車の燃料
	private double mFuel;
	// 購入日
	private Day mPurchaseDay;

	// コンストラクタ
	public Car(String name, int width, int height, int length, double fuel, Day purchaseDay){
		// 名前をセット
		this.mCarName = name;
		// 幅をセット
		this.mCarWidth = width;
		// 高さをセット
		this.mCarHeight = height;
		// 長さをセット
		this.mCarLength = length;
		// 燃料をセット
		this.mFuel = fuel;
		// 座標の初期値をセット
		mPointX = mPointY = 0.0;
		// 購入日をセット
		this.mPurchaseDay = new Day(purchaseDay);
	}

	// Xの座標を取得するメソッド
	public double getX() {
		// Xの値を返却する
		return mPointX;
	}

	// Yの座標を取得するメソッド
	public double getY() {
		// Yの値を返却する
		return mPointY;
	}

	// 燃料を取得するメソッド
	public double getFuel() {
		// mFuelの値を返却する
		return mFuel;
	}

	// 購入日を取得するメソッド
	public Day getPurchaseDay() {
		// 購入日を返す
		return new Day(mPurchaseDay);
	}

	// 車のスペックを表示するメソッド
	public void putSpec() {
		// 車の名前を表示する
		System.out.println("名前：" + mCarName);
		// 車の幅を表示する
		System.out.println("車幅：" + mCarWidth + "mm");
		// 車の高さを表示する
		System.out.println("車高：" + mCarHeight + "mm");
		// 車の長さを表示する
		System.out.println("車長：" + mCarLength + "mm");
	}

	// X方向、Y方向に移動させるメソッド
	public boolean move(double moveX, double moveY) {
		// 移動に使う燃料の計算
		double dist = Math.sqrt(moveX * moveX + moveY * moveY);
		// 現在の燃料と比較する
		if (dist > mFuel) {
			// 足りない場合は移動しない
			return false;
		// 足りる場合
		} else {
			// 燃料を減らす
			mFuel -= dist;
			// 移動距離をXに加算する
			mPointX += moveX;
			// 移動距離をYに加算する
			mPointY += moveY;
			// trueを返す
			return true;
		}
	}
}
