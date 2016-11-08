
public class SanduicheBasico extends Sanduiche{

	public SanduicheBasico(SanduichesIngredientFactory factory){
		super.pao = factory.criarPao();
		super.presunto = factory.criarPresunto();
		super.queijo = factory.criarQueijo();
		super.salada = factory.criarSalada();
	}
	
	public String prepare(){
		return "Ingredientes: =>\n" + pao.getDescricao() + "\n" + presunto.getDescricao() 
		+ "\n" + queijo.getDescricao() + "\n" + salada.getDescricao();
	}
}