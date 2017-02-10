package adapter;
/**
 * 测试类:适配器模式 
 * @author user
 *
 */
public class Test {
	public static void main(String[] args) {
		
	
	Target target= new Adapter();
	
	target.request();
	}
}
