package factory_method;
/**
 * 减法类
 * @author user
 *
 */
public class OperationSub extends Operation{

	@Override
	public double getResult() {
		double result = 0;
		result = number1 - number2;
		return result;
	}

}
