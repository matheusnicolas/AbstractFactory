
public class SanduichesIngredientFactoryJP implements SanduichesIngredientFactory {

	public Pao criarPao(){
		return new PaoFrances();
	}
	
	public Queijo criarQueijo(){
		return new QueijoMussarela();
	}
	
	public Presunto criarPresunto(){
		return new PresuntoFrango();
	}
	
	public Salada criarSalada(){
		return new SaladaCom();
	}
}
