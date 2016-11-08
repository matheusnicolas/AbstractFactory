
public class LanchoneteRTStore extends SanduicheStore {

	public LanchoneteRTStore() {
		super.factory = new SanduichesIngredientFactoryRT();
	}

	public Sanduiche createSanduiche(String tipo) {
		if (tipo.equalsIgnoreCase("Sanduiche b�sico")) {
			return new SanduicheBasico(super.factory);
		}
		return null;

	}

}
