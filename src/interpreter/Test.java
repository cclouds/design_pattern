package interpreter;
/**
 * 测试类：解释器模式
 * @author user
 *
 */
public class Test {
	
	public static void main(String[] args) {
		Context con = new Context();
		Variable x =new Variable("x");
		Variable y = new Variable("y");
		Constant c = new Constant(true);
		
		
		con.assign(x, false);
		con.assign(y, true);
		Expression exp1  = new Or(x,y);
		Expression exp2  = new And(x,c);
		
        System.out.println("x="+x.interpreter(con));
        System.out.println("y="+y.interpreter(con));
        //false or ture
        System.out.println("exp1="+exp1.interpreter(con));
        //false and true
        System.out.println("exp2="+exp2.interpreter(con));

	}

}
