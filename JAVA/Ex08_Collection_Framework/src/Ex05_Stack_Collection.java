import java.util.Stack;

import kr.or.bit.Coin;
import kr.or.bit.MyStack;

public class Ex05_Stack_Collection {

	public static void main(String[] args) {
		// LIFO
		// Stack : Collection Framework가 제공하는 클래스

		Stack stack = new Stack();
		stack.push("a");
		stack.push("b");
		System.out.println(stack.pop()); // pop: 가장 위에 있는 값1개를 꺼집어 낸다. //b
		System.out.println(stack.pop()); // a
		// System.out.println(stack.pop()); //java.util.EmptyStackException

		// stack 값 확인하는 방법
		System.out.println(stack.isEmpty()); // true: 비어있다. false: 값 있다.
		
		Stack st = new Stack();
		st.push(1);
		System.out.println(st);
		st.push(1);
		st.push(2);
		System.out.println(st);
		st.pop();
		System.out.println(st);
		
		
		
		
		//동전케이스 만들기
		//자료구조 원하는 형태를 찾는다 => stack
		Stack<Coin> coinbox = new Stack<Coin>();
		coinbox.push(new Coin(100));
		coinbox.push(new Coin(50));
		coinbox.push(new Coin(500));
		
		//System.out.println(coinbox.pop().getValue()); 
		//pop()은 주소값을 가진 coinbox때문에 get으로 해야 값이 나온다.
		
		while(!coinbox.isEmpty()) { //coinbox가 비어있지 않으면 스탑!
			Coin coin = coinbox.pop();
			System.out.println("꺼낸 동전: "+ coin.getValue()+" 원");
		}
		
		
		Stack<Coin> coin = new Stack<Coin>();
		coin.push(new Coin(500));
		coin.push(new Coin(1000));
		coin.push(new Coin(700));
		
		System.out.println(coin);
		while(!coin.isEmpty()) {
			Coin c = coin.pop();
			System.out.println("c: "+c.getValue());
		}
		
		
		
		//스텍 만들기
		MyStack my = new MyStack(3);
		System.out.println("--------PUSH--------");
		my.stackPush("A");
		my.stackPush("b");
		//my.stackPush("c");
		//System.out.println(my.push("d"));
        
        System.out.println("---------POP--------");
        System.out.println(my.stackPop());
		System.out.println(my.stackPop());
		System.out.println(my.stackPop());
		System.out.println(my.stackPop());
		System.out.println(my.stackPop());
	}

}
