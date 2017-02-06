package strategy;
/**
 * 返利收费子类
 * @author user
 *
 */
public class CashReturn extends CashSuper {
	/*
	 * 购买满多少
	 */
	private double moneyCondition = 0.0D;

	/*
	 * 返还多少
	 */
	private double moneyReturn = 0.0D;

	public CashReturn(double moneyCondition, double moneyReturn) {
		this.moneyCondition = moneyCondition;
		this.moneyReturn = moneyReturn;

	}

	@Override
	public double acceptCash(double money) {
		money = money - Math.floor( money / moneyCondition) * moneyReturn;
		return money;
	}

}
