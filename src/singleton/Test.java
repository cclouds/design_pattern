package singleton;

/**
 * 测试类
 */
public class Test {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		System.out.println(s1==s2);
		
		Singleton2 s3 = Singleton2.getInstance();
		Singleton2 s4 = Singleton2.getInstance();
		System.out.println(s3==s4);
		
		Singleton3 s5 = Singleton3.getInstance();
		Singleton3 s6 = Singleton3.getInstance();
		System.out.println(s5==s6);
		
		Singleton4 s7 = Singleton4.getInstance();
		Singleton4 s8 = Singleton4.getInstance();
		System.out.println(s7==s8);
		
		Singleton5 s9 = Singleton5.getInstance();
		Singleton5 s10 = Singleton5.getInstance();
		System.out.println(s9==s10);
		
		Singleton6 s11 = Singleton6.INSTANCE;
		Singleton6 s12 = Singleton6.INSTANCE;
		System.out.println(s11==s12);
		
	}

}
