import java.util.ArrayList;
import java.util.List;

class Product{
	
}

class Tv extends Product{
	@Override
	public String toString() {
		return "Tv";
	}
}

class Audio extends Product{
	@Override
	public String toString() {
		return "Audio";
	}
}

class NoteBook extends Product{
	@Override
	public String toString() {
		return "NoteBook";
	}
}

public class Ex07_Generic_Quiz {

	public static void main(String[] args) {
		//1.Array(배열) 사용해서 cart를 만들고 제품3개를 담으세요. 
		//(크기가 정해져있다.)
		Product[] cart = new Product[3];
		cart[0] = new Tv();
		cart[1] = new Audio();
		cart[2] = new NoteBook();
		
		//출력
		for(Product pro : cart) {
			System.out.println(pro);
		}
		
		System.out.println("//////////");
		System.out.println();
		
		
		//ArrayList를 사용해서 cart를 만들고 제품3개를 담으세요.
		//추가의 제한이 없다.
		List<Product> product = new ArrayList<>();
		product.add(new Tv());
		product.add(new Tv());
		product.add(new Audio());
		product.add(new Audio());
		product.add(new Tv());
		product.add(new Tv());
		product.add(new Tv());
		product.add(new NoteBook());
		//generic를 사용해서 객체 리스트를 만들어라
		
		//출력
		for(Product pro : product) {
			System.out.println(pro.toString());
		}
		
		
		
	}

}
