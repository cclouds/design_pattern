package strategy;
/**
 * 正常收费子类
 * @author user
 *
 */
public class CashNormal extends CashSuper{

	@Override
	public double acceptCash(double money) {
		return money;
	}

}
