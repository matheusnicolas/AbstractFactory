
public class SanduichesIngredientFactoryRT implements SanduichesIngredientFactory {

	public Pao criarPao(){
		return new PaoBola();
	}
	
	public Queijo criarQueijo(){
		return new QueijoCheddar();
	}
	
	public Presunto criarPresunto(){
		return new PresuntoPeru();
	}
	
	public Salada criarSalada(){
		return new SaladaSem();
	}
}
