package strategy;
/**
 * 策略模式
 * CashContext类
 * @author user
 *
 */
public class CashContext {
	 CashSuper cashSuper = null;
	
	public CashContext(String type){
		switch (type) {
		case "正常收费":
			cashSuper = new CashNormal();
			break;

		case "打8折":
			cashSuper = new CashRebate(0.8);
			break;
			
		case "满300返100":
			cashSuper = new CashReturn(300, 100);
			break;
		}
	}
	
	public double getResult(double money){
	     return cashSuper.acceptCash(money);
	}

}
