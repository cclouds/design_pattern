package adapter;
/**
 * Adapter类，把源接口转换成目标接口
 * @author user
 *
 */
public class Adapter extends Target{
	
	private Adaptee adaptee = new Adaptee();

	@Override
	public void request() {
		
		adaptee.SpecificRequest();
		
	}
	

}
