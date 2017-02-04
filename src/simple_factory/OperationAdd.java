package simple_factory;
/**
 * 加法类
 * @author user
 *
 */
public class OperationAdd extends Operation{
	@Override
	public double getResult() {
		double result = 0;
		result = number1 + number2;
		return result;
	}

}
