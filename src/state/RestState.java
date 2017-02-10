package state;
/**
 * 下班休息状态
 * @author user
 *
 */
public class RestState extends State{

	@Override
	public void writeProgram(Work w) {
		
		System.out.println("当前时间："+w.getHour()+"下班回家");
		
	}

}
