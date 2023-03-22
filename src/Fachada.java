public class Fachada {

	Service service;
	
	public Fachada() {
		this.service = new Service();
	}
	
	public void criaProduto(String nome, double preco,  String fabricante) {
		service.criaProduto(nome, preco, fabricante);
	}
	
}
