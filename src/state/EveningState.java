package state;
/**
 * 晚间工作状态
 * @author user
 *
 */
public class EveningState extends State{

	@Override
	public void writeProgram(Work w) {
		if(w.isFinish()){
			w.setState(new RestState());
			w.writeProgram();
		}else{
			if(w.getHour()<21){
				System.out.println("当前时间："+w.getHour()+"晚上加班");
			}else{
				w.setState(new SleepingState());
				w.writeProgram();
			}
			
		}
		
	}

}
