package store;

public class LimitedProduct extends AbsProduct {
	
	//フィールド
	int dayCnt;
		
	//コンストラクタ
	public LimitedProduct(String name,int price,int dayCnt) {
	
		super(name,price);
		this.dayCnt = dayCnt;
	}
			
	//メソッド
	
	public int minusDayCnt(int minus) {
		
		return dayCnt += minus;
		
	}

	@Override
	public void display() {
				
		System.out.println(
			
			name + "：" + price + "円(配送不可)（残り：" + dayCnt + "日");
		
	}
	
}
