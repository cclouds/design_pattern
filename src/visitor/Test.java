package visitor;
/*
 * 测试类：访问者模式
 */
public class Test {
	
	public static void main(String[] args) {
		
		//构建一个结构对象
		ObjectStructure os = new ObjectStructure();
		
	    //给结构增加一个节点
		os.add(new NodeA());
		
		 //给结构增加一个节点
		os.add(new NodeB());
		
		//创建一个访问者
		Visitor visitor = new VisitorA();
		
		os.action(visitor);
	}

}
