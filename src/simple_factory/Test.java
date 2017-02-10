package simple_factory;
/**
 * 测试类:简单工厂模式
 * @author user
 *
 */
public class Test {

	public static void main(String[] args) {
		Operation oper = OperationFactory.createOperate("+");
		oper.setNumber1(2);
		oper.setNumber2(1);
		System.out.println(oper.getResult());
	}

}
