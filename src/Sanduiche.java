
public abstract class Sanduiche {

	protected Pao pao;
	protected Queijo queijo;
	protected Presunto presunto;
	protected Salada salada;
	
	public abstract String prepare();
	
	public String bake(){
		return "Sanduíche no fogo...";
	}
	
	public String pack(){
		return "Sanduíche empacotado e pronto pra servir!";
	}
}
