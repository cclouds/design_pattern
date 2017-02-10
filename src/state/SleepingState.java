package state;
/**
 * 睡眠状态
 * @author user
 *
 */
public class SleepingState extends State{

	@Override
	public void writeProgram(Work w) {
		System.out.println("当前时间："+w.getHour()+"想睡觉");
	}

}
