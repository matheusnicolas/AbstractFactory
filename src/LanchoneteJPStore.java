
public class LanchoneteJPStore extends SanduicheStore{

	public LanchoneteJPStore(){
		super.factory = new SanduichesIngredientFactoryJP();
	}
	
	public Sanduiche createSanduiche(String tipo){
			if(tipo.equalsIgnoreCase("Sanduiche b�sico")){
				return new SanduicheBasico(super.factory);
			}
			return null;
		
		}
		
}

