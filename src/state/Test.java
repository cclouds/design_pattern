package state;
/**
 * 测试类
 * @author user
 *
 */
public class Test {
	
	public static void main(String[] args) {
		Work w = new Work();
		w.setHour(9);
		w.WriteProgram();
		w.setHour(10);
		w.WriteProgram();
		w.setHour(12);
		w.WriteProgram();
		w.setHour(13);
		w.WriteProgram();
		w.setHour(15);
		w.WriteProgram();
		w.setHour(17);
		w.WriteProgram();
		w.setHour(20);
		w.setFinish(true);
		w.WriteProgram();
		w.setHour(21);
		w.WriteProgram();
		w.setHour(22);
		w.WriteProgram();
		
	}
}
