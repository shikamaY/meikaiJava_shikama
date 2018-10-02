package Ensyu12;

// Carクラスを継承
public class mileageCar extends Car {
	// 走行距離をあらわすフィールド
	double mMileage;
	// 以前のXの位置
	double oldPointX;
	// 以前のYの位置
	double oldPointY;
	
	// コンストラクタ
	public mileageCar(String name, int width, int height, int length, double mFuel, Day PurchaseDay) {
		// スーパーコンストラクタの実行
		super(name, width, height, length, mFuel, PurchaseDay);
		// 値の初期値
		mMileage = oldPointX = oldPointY = 0.0;
	}

	// 移動距離を調べるメソッド
	public double getMileage() {
		// Xの移動距離の計算
		double mileageX = super.getX() - oldPointX;
		// Yの移動距離の計算
		double mileageY = super.getY() - oldPointY;
		// 合計の移動距離の計算
		mMileage += mileageX + mileageY;
		// 現在のXの位置を設定
		oldPointX = mileageX;
		// 現在のYの位置を設定
		oldPointY = mileageY;

		// 移動距離を返却する
		return mMileage;
	}

}
