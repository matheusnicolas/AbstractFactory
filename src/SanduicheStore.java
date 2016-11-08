
public abstract class SanduicheStore {

	protected SanduichesIngredientFactory factory;
	
	public Sanduiche orderSanduiche(String tipo){
		Sanduiche sanduiche = createSanduiche(tipo);
		System.out.println(sanduiche.prepare());
		System.out.println(sanduiche.bake());
		System.out.println(sanduiche.pack());
		return sanduiche;
	}
	
	protected abstract Sanduiche createSanduiche(String tipo);
}
