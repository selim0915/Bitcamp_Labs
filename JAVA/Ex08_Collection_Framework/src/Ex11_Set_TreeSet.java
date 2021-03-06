import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

//TreeSet 추가적으로 알고 있으면 좋다..
public class Ex11_Set_TreeSet {

	public static void main(String[] args) {
		//순서(x) ,중복(x)
		HashSet<String> hs = new HashSet<String>();
		hs.add("B");
		hs.add("A");
		hs.add("F");
		hs.add("K");
		hs.add("G");
		hs.add("D");
		hs.add("P");
		hs.add("A"); //중복
		System.out.println(hs.toString()); //순서도 없고, 중복된 데이터도 걸러 짐
		
		//HashSet 확장 > LinkedHashSet (순서유지) > Linked(주소값) > node 개념
		Set<String> hs2 = new LinkedHashSet<String>(); //다음 노드에 주소값을 알고있는거
		hs2.add("B");
		hs2.add("A");
		hs2.add("F");
		hs2.add("K");
		hs2.add("G");
		hs2.add("D");
		hs2.add("P");
		hs2.add("A"); //중복
		System.out.println(hs2.toString()); //[add]한 [순서] ,정렬은 안된상태
		
		
		//순서(x), 중복(x), 정렬(sort):오름차순 기본적 제공
		//TreeSet: 검색에 용이, 정렬 두가지 요소를 필요로 하는 구조
		//이진트리: 정렬되고 많은 양의 데이터를 저장할 때 효율적
		//로또: 1~45까지의 난수 > 6개 > 중복되면 안된다. > 오름차순정렬
		
		Set<Integer> lotto = new TreeSet<Integer>();
		for(int i=0; lotto.size()<6; i++) {
			lotto.add((int)(Math.random()*45)+1);
		}
		System.out.println("1회차"+lotto.toString());
		
		
		//iterator()출력
		int sum=0;
		Iterator<Integer> it =lotto.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			sum+=it.next();
		}
		//System.out.println("sum: "+sum);
		
		
		
		
	}

}
