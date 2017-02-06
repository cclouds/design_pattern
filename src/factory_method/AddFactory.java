package factory_method;
/**
 * 加法类工厂
 * @author user
 *
 */
public class AddFactory implements Factory{

	@Override
	public Operation CreateOperation() {
		return new OperationAdd();
	}

}
