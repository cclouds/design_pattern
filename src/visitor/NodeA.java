package visitor;
/**
 * 具体节点类NodeA
 * @author user
 *
 */
public class NodeA extends Node{

	@Override
	public void accept(Visitor visitor) {
		
		visitor.visit(this);
		
	}
	
	/*
	 * NodeA特有的方法
	 */
	public String operationA(){
		return "NodeA";
	}

}
