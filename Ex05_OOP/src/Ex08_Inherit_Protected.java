import kr.or.bit.Pclass;

//������(����) : default, private, public ��Ӱ��迡�� Protected����..
//��Ӱ��迡�� ����
//��鼺: default, public(��Ӱ��迡��) �ΰ����� �����Ѵ�.

//��Ӱ��迡�� Protected
//����� ���� �ʴ� �ڵ忡�� �ǹ̾��� (�Ʒ��� ����)
//���� ���ϴ� ����̶�.. ��ӹ��� Ŭ���� ��..!

//���� �� ��Ӿȿ����� �Ǵ������ڴ� �� ���������???????
//why? class Car{Protected void turn() }
//=> ���� ����ϴ� ����� �ڿ��� ������ ������ ���ڴµ�... ���ص� �ǰ�..(�ǵ�)
class Child2 extends Pclass{
	void method(){
		this.p = 1000; //��� ���迡�� protected�� public�̵ǰ�..
		 System.out.println(this.p);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}

public class Ex08_Inherit_Protected {

	public static void main(String[] args) {
		Pclass pc = new Pclass();
		System.out.println("public: "+pc.j);
		
		//�ٸ� ���� ������ public�� ������ �Ǵ���..
		//default, peotected �Ⱥ���..
		
		Child2 ch = new Child2();
		ch.method();
	}

}
