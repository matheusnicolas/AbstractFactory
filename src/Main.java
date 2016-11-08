
public class Main {

	public static void main(String[] args){
		SanduicheStore store = new LanchoneteCGStore();
		SanduicheStore store1 = new  LanchoneteJPStore();
		SanduicheStore store2 = new LanchoneteRTStore();
		store.orderSanduiche("Sanduiche básico");
		store1.orderSanduiche("Sanduiche básico");
		store2.orderSanduiche("Sanduiche básico");
	}
	
}