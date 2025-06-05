package driver;

import store.AbsProduct;
import store.Deliverable;
import store.LimitedProduct;
import store.NomalProduct;
import store.SpecialProduct;


public  class Driver {
	
	public static void main(String[] args) {
		
		System.out.println("---商品リスト---");
		System.out.println();
		AbsProduct[] items = makeProductlist();
		//displayProductlist(makeProductlist());
		displayProductlist(items);
		System.out.println();
		System.out.println("---配達可能商品---");
		//getDelivarable(makeProductlist());
		//getDelivarable(items);
		displayDelivList(getDelivarable(items));
		
		
	}
	
	
	//メソッド
	public static AbsProduct[] makeProductlist() {
		
		AbsProduct[] items = {
				
				new LimitedProduct("マウス",2000,10),
				new SpecialProduct("特価キーボード",3600,4500),
				new LimitedProduct("Webカメラ",3900,7),
				new NomalProduct("マイク",2800),
				new SpecialProduct("ディスプレイ",15000,20000),
				new NomalProduct("LDE照明",4200)
				
		};
		
		return items;
	}
	
	public static void displayProductlist(AbsProduct[] absProd) {
		
		
		
		for (int i = 0; i < absProd.length ; i++) {
			
			absProd[i].display();
			
		}
		
	}
	
	
	public static Deliverable[] getDelivarable(AbsProduct[] prod) {
		
		Deliverable[] deliver = new Deliverable[6];
		//AbsProduct[] a = makeProductlist();
		
		for (int j = 0; j < prod.length; j++) {
			
			if (prod[j] instanceof Deliverable) {
				
				deliver[j] = (Deliverable)prod[j];
				
				
			} else {
				
				continue;
				
			}
			
		}
		
		return deliver;
		
	}
	
	public static void displayDelivList(Deliverable[] deliv) {
			
		for (int k = 0; k < deliv.length ; k++) {
					
			if (deliv[k] == null) {
				
				continue;
				
			} else {
				
				deliv[k].displayDeliv();
					
			}
		}
	}
	
}
