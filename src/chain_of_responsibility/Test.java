package chain_of_responsibility;

/**
 * 测试类：职责链模式
 * 
 * @author user
 *
 */
public class Test {

	public static void main(String[] args) {
		Handler handler1 = new ConcreteHandler1();
		Handler handler2 = new ConcreteHandler2();
		Handler handler3 = new ConcreteHandler3();

		handler1.setHandler(handler2);
		handler2.setHandler(handler3);

		int[] array = { 1, 2, 3, 11, 12, 13, 21, 22, 23, 31, 32, 33 };

		for (int request : array)

			handler1.HandleRequest(request);
	}

}
