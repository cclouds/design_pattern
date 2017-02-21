package visitor;
/**
 * 具体访问者VisitorA类
 * @author user
 *
 */
public class VisitorA implements Visitor{
    /*
     * 对于NodeA的操作
     */
	@Override
	public void visit(NodeA node) {
		
		System.out.println(node.operationA());
		
	}

	/*
     * 对于NodeB的操作
     */
	@Override
	public void visit(NodeB node) {

		System.out.println(node.operationB());
		
	}

}
