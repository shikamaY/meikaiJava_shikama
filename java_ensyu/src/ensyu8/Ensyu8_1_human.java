package ensyu8;

// 名前、身長、体重を保持するオブジェクトを生成するクラス
public class Ensyu8_1_human {
	// 名前を入れる変数
	private String name;
	// 身長を入れる変数
	private int height;
	// 体重を入れる変数
	private int weight;

	// インスタンス化時に初期値を入れるためのコンストラクタ
	Ensyu8_1_human(String name,int height, int weight) {
		// 名前を入れる
		this.name = name;
		// 身長を入れる
		this.height = height;
		// 体重を入れる
		this.weight = weight;
	}

	// すべての情報を表示するメソッド
	void printDataAll() {
		// 名前、身長、体重を表示
		System.out.println("名前:" + name + ",身長:" + height + ",体重:" + weight);
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
}
