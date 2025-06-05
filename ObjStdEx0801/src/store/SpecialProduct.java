package store;

public class SpecialProduct extends AbsProduct implements Deliverable {
	
	//フィールド
	int orgPrice;
	
	//コンストラクタ
		public SpecialProduct(String name,int price,int orgPrice) {
			
			super(name,price);
			this.orgPrice = orgPrice;
			
		}
		
	//メソッド

	@Override
	public void display() {
			
		System.out.println(name + "：" + price + "円");
			
			
	}
	
	
	@Override
	public void displayDeliv() {
		
		System.out.println("【*特別送料300円*】" + name + ":" + price + "円");
		
	}
	
}
