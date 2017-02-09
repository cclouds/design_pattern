package state;
/**
 * 晚间工作状态
 * @author user
 *
 */
public class EveningState extends State{

	@Override
	public void WriteProgram(Work w) {
		if(w.TaskFinished()){
			w.setState(new RestState());
			w.WriteProgram();
		}else{
			if(w.getHour()<21){
				System.out.println("当前时间："+w.getHour()+"晚上加班");
			}else{
				w.setState(new SleepingState());
				w.WriteProgram();
			}
			
		}
		
	}

}
