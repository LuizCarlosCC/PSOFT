import java.util.Map;

public class Repositorio {
	
	static Map<Integer, Produto> map;
	
	public static void add(Produto prod) {
		map.put(prod.getId(), prod);
		
	}

}
