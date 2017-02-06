package factory_method;

/**
 * 减法类工厂
 * @author user
 *
 */
public class SubFactory implements Factory{

	@Override
	public Operation CreateOperation() {
		return new OperationSub();
	}

}
