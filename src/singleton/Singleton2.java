package singleton;

/**
 * ����ģʽ
 * ����ģʽ
 */
public class Singleton2 {
	//1.���췽��˽�л�
	private Singleton2(){
		
	}
	//2.�������Ψһʵ��
	private static Singleton2 instance;
	
	//3.��ȡʵ���ķ���
	public static Singleton2 getinstance(){
		if(instance==null){
			instance = new Singleton2();
		}
		return instance;
	}

}
