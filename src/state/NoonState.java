package state;
/**
 * 中午工作状态类
 * @author user
 *
 */
public class NoonState extends State{

	@Override
	public void writeProgram(Work w) {
		if(w.getHour()<13){
			System.out.println("当前时间:"+w.getHour()+"午饭，午休");
		}else{
			w.setState(new AfternoonState());
			w.writeProgram();
		}
	}

}
