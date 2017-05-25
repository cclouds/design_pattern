package singleton;
/**
 * 单例模式
 * 懒汉模式：要在第一次被引用时。才会将自己实例化
 * 双重锁定保证安全
 */
public class Singleton4 {
	// 1.构造方法私有化，外界无法用new创建此类的实例
	private Singleton4() {

	}

	// 2.创建类的唯一实例
	private volatile static Singleton4 instance;

	// 3.创建类的唯一实例
	public static Singleton4 getInstance() {
		// 若实例不存在，则new一个新实例，否则返回已有的实例
		if (instance == null) { // 双重锁定：先判断实例是否存在，不存在再加锁
			synchronized (Singleton4.class) {
				if (instance == null) {
					instance = new Singleton4();
				}
			}
		}
		return instance;
	}

}
