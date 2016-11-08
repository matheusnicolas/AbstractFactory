
public class LanchoneteCGStore extends SanduicheStore {

	public LanchoneteCGStore(){
		super.factory = new SanduichesIngredientFactoryCG();
	}
	
	public Sanduiche createSanduiche(String tipo){
		if(tipo.equalsIgnoreCase("Sanduiche b�sico")){
			return new SanduicheBasico(super.factory);
		}
		return null;
	}
}
