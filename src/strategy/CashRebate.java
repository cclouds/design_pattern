package strategy;
/**
 * 打折收费子类
 * @author user
 *
 */
public class CashRebate extends CashSuper{
	private double moneyRebate = 1D;
	
	public CashRebate(double moneyRebate){
		this.moneyRebate = moneyRebate;
	}

	@Override
	public double acceptCash(double money) {
		return money * moneyRebate;
	}

}
