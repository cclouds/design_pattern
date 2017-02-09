package state;

public class Work {
	private State state;
	
	public Work(){
		state = new MorningState();
	}
	
	private double hour;
	


	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public double getHour() {
		return hour;
	}

	public void setHour(double hour) {
		this.hour = hour;
	}
	
	private boolean finish = false;
	
	public boolean TaskFinished(){
		return finish;
	}
	

	public boolean isFinish() {
		return finish;
	}

	public void setFinish(boolean finish) {
		this.finish = finish;
	}

	public void WriteProgram(){
		state.WriteProgram(this);
	}
	
	
	

}
