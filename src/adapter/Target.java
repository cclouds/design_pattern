package adapter;

/**
 * 适配器模式 target:可以是具体类或抽象类也可以是接口
 * 
 * @author user
 *
 */
public abstract class Target {
	
	public  void request() {
		System.out.println("普通的请求");
	}

}
