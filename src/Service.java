
public class Service {
	Repositorio repo;
	
	public void criaProduto(String nome, double preco,  String fabricante){
		Produto prod = new Produto(nome, preco, fabricante);
		Repositorio.add(prod);
	}
	
}
