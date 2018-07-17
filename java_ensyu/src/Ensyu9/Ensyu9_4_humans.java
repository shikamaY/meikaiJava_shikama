package Ensyu9;

public class Ensyu9_4_humans {
	// 名前を入れる変数
	private String name;
	// 身長を入れる変数
	private int height;
	// 体重を入れる変数
	private int weight;
	// 誕生日を入れる変数
	private Ensyu9_4_Day birthday;

	// インスタンス化時に初期値を入れるためのコンストラクタ
	Ensyu9_4_humans(String name,int height, int weight, Ensyu9_4_Day birthday) {
		// 名前を入れる
		this.name = name;
		// 身長を入れる
		this.height = height;
		// 体重を入れる
		this.weight = weight;
		// 誕生日を入れる
		this.birthday = new Ensyu9_4_Day(birthday);
	}

	// すべての情報を表示するメソッド
	void printDataAll() {
		// 名前、身長、体重を表示
		System.out.println("名前:" + name + ",身長:" + height + ",体重:" + weight);
	}

	// 誕生日を返却するメソッド
	Ensyu9_4_Day getBirthday() {
		// 誕生日を返す
		return new Ensyu9_4_Day(birthday);
	}

	// 名前を返すメソッド
	String getName() {
		// 名前を返す
		return name;
	}

	// 身長を返すメソッド
	int getHeight() {
		// 身長を返す
		return height;
	}

	// 体重を返すメソッド
	int getWeight() {
		// 体重を返す
		return weight;
	}

	// 名前を変更するメソッド
	void setName(String setName) {
		// 名前を入れる
		this.name = setName;
	}

	// 身長を変更するメソッド
	void setHeight(int setHeight) {
		// 身長を入れる
		this.height = setHeight;
	}

	// 体重を変更するメソッド
	void setWeight(int setWheight) {
		// 体重を入れる
		this.weight = setWheight;
	}

	// 人間の情報を返すtoStringメソッド
	public String toString() {
		// 名前、身長、体重、誕生日を返す
		return String.format("名前:%s\n身長:%d\n体重:%d\n誕生日:%s", name,height,weight,birthday);
	}
}
