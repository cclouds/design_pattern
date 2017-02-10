package state;
/**
 * 测试类:状态模式
 * @author user
 *
 */
public class Test {
	
	public static void main(String[] args) {
		Work w = new Work();
		w.setHour(9);
		w.writeProgram();
		w.setHour(10);
		w.writeProgram();
		w.setHour(12);
		w.writeProgram();
		w.setHour(13);
		w.writeProgram();
		w.setHour(15);
		w.writeProgram();
		w.setHour(17);
		w.writeProgram();
		w.setHour(20);
		w.setFinish(true);
		w.writeProgram();
		w.setHour(21);
		w.writeProgram();
		w.setHour(22);
		w.writeProgram();
		
	}
}
