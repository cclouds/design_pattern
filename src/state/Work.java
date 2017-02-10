package state;

public class Work {
	private State state;
	
	public Work(){
		state = new MorningState();
	}
	
	private double hour;
	
	private boolean finish = false;

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
	

	public boolean isFinish() {
		return finish;
	}

	public void setFinish(boolean finish) {
		this.finish = finish;
	}

	public void writeProgram(){
		state.writeProgram(this);
	}
	
	
	

}
