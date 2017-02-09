package state;
/**
 * 上午工作状态类
 * @author user
 *
 */
public class MorningState extends State{

	@Override
	public void WriteProgram(Work w) {
		if(w.getHour() < 12){
			System.out.println("当前时间："+w.getHour()+"上午工作，精神百倍");
		}else{
			w.setState(new NoonState());
			w.WriteProgram();
		}
		
	}

}
