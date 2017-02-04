package singleton;
/**
 *  单例模式
 *  实例有且仅有一个
 *  饿汉模式
 */ 
public class Singleton {
	//1.构造方法私有化
	private Singleton(){
	}
	
	//2.创建类的唯一实例
	private static Singleton instance = new Singleton();
	
	//3.获取实例的方法
	public static Singleton getinstance(){
		return instance;
	}

}
