package simple_factory;
/**
 * 除法类
 * @author user
 *
 */
public class OperationDiv extends Operation{

	@Override
	public double getResult() {
		double result = 0;
		if(number2 == 0){
			try {
				throw new Exception("除数不能为0");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		result = number1/number2;
		return result;
	}

}
