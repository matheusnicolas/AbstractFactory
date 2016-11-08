
public class LanchoneteJPStore extends SanduicheStore{

	public LanchoneteJPStore(){
		super.factory = new SanduichesIngredientFactoryJP();
	}
	
	public Sanduiche createSanduiche(String tipo){
			if(tipo.equalsIgnoreCase("Sanduiche básico")){
				return new SanduicheBasico(super.factory);
			}
			return null;
		
		}
		
}

