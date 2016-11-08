
public class SanduichesIngredientFactoryCG implements SanduichesIngredientFactory {

	public Pao criarPao(){
		return new PaoIntegral();
	}
	
	public Queijo criarQueijo(){
		return new QueijoPrato();
	}
	
	public Presunto criarPresunto(){
		return new PresuntoFrango();
	}
	
	public Salada criarSalada(){
		return new SaladaSem();
	}
}
