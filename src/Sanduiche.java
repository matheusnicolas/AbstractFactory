
public abstract class Sanduiche {

	protected Pao pao;
	protected Queijo queijo;
	protected Presunto presunto;
	protected Salada salada;
	
	public abstract String prepare();
	
	public String bake(){
		return "Sandu�che no fogo...";
	}
	
	public String pack(){
		return "Sandu�che empacotado e pronto pra servir!";
	}
}
