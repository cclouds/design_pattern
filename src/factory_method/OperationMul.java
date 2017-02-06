package factory_method;
/**
 * 乘法类
 * @author user
 *
 */
public class OperationMul extends Operation{

	@Override
	public double getResult() {
		double result = 0;
		result = number1 * number2;
		return result;
	}

}
