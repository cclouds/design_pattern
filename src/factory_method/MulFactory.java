package factory_method;
/**
 * 乘法类工厂
 * @author user
 *
 */

public class MulFactory implements Factory{

	@Override
	public Operation CreateOperation() {
		return new OperationMul();
	}

}
