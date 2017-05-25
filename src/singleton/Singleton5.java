package singleton;

public class Singleton5 {
	// 1.构造方法私有化，外界无法用new创建此类的实例
	private Singleton5() {
	}

	// 静态(static)内部类
	private static class SingletonHolder {
		private static final Singleton5 INSTANCE = new Singleton5();
	}

	public static final Singleton5 getInstance() {
		return SingletonHolder.INSTANCE;
	}

}
