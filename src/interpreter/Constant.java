package interpreter;
/**
 * 一个Constant对象代表一个布尔常量
 * @author user
 *
 */
public class Constant extends Expression{
	
	private boolean value;
	
	

	public Constant(boolean value) {
		super();
		this.value = value;
	}

	@Override
	public boolean interpreter(Context con) {
		return value;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj!=null && obj instanceof Constant){
			return this.value == ((Constant)obj).value;
		}
		return false;
	}



	@Override
	public int hashCode() {
		return this.toString().hashCode();
	}

	@Override
	public String toString() {
		return new Boolean(value).toString();
	}
	
	

}
