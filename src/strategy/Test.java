package strategy;
/**
 * 测试类:策略模式
 * @author user
 *
 */
public class Test {
	public static void main(String[] args) {
		
		double totalPrice = 0.0D;
		CashContext cc = new CashContext("满300返100");
		
		totalPrice = cc.getResult(1000);
		
		System.out.println(totalPrice);
	}
}
