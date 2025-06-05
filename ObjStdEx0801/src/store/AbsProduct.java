package store;

public abstract class AbsProduct {
	
	//フィールド
	//変数宣言
	String name;
	int price;
	
	
	
	//コンストラクタ
	protected AbsProduct(String name,int price) {
		
		this.name = name;
		this.price = price;
		
	}
	
	
	
	//メソッド
	
	//抽象メソッド
	public abstract void display();
	
	protected String getNameAndPrice() {
		
		return name +"："+ price + "円";
		
	}
	

}
