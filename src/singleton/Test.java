package singleton;

/**
 * 
 *
 */
public class Test {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getinstance();
		Singleton s2 = Singleton.getinstance();
		System.out.println(s1==s2);
		
		Singleton2 s3 = Singleton2.getinstance();
		Singleton2 s4 = Singleton2.getinstance();
		System.out.println(s3==s4);
		
	}

}
