package singleton;

/**
 * 单例模式
 * 懒汉模式：要在第一次被引用时。才会将自己实例化
 * 线程不安全
 */
public class Singleton2 {
	//1.构造方法私有化，外界无法用new创建此类的实例
	private Singleton2(){
		
	}
	//2.创建类的唯一实例
	private static Singleton2 instance;
	
	
	//3.创建类的唯一实例
	public static Singleton2 getInstance(){
		//若实例不存在，则new一个新实例，否则返回已有的实例
				if(instance==null){
					instance = new Singleton2();
		}
		return instance;
	}

}
