package state;
/**
 * 下午工作状态
 * @author user
 *
 */
public class AfternoonState extends State{

	@Override
	public void WriteProgram(Work w) {
		if(w.getHour()<17){
			System.out.println("当前时间："+w.getHour()+"下午工作时间");
		}else{
			w.setState(new EveningState());
			w.WriteProgram();
		}
		
	}

}
