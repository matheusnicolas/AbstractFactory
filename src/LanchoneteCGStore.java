
public class LanchoneteCGStore extends SanduicheStore {

	public LanchoneteCGStore(){
		super.factory = new SanduichesIngredientFactoryCG();
	}
	
	public Sanduiche createSanduiche(String tipo){
		if(tipo.equalsIgnoreCase("Sanduiche básico")){
			return new SanduicheBasico(super.factory);
		}
		return null;
	}
}
