package singleton;
/**
 *  ����ģʽ
 *  ʵ�����ҽ���һ��
 *  ����ģʽ
 */ 
public class Singleton {
	//1.���췽��˽�л�
	private Singleton(){
	}
	
	//2.�������Ψһʵ��
	private static Singleton instance = new Singleton();
	
	//3.��ȡʵ���ķ���
	public static Singleton getinstance(){
		return instance;
	}

}
