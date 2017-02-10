package abstract_factory;
/**
 * MysqlDepartment实现BaseDepartment
 * @author user
 *
 */
public class MysqlDepartment implements BaseDepartment{

	@Override
	public void insert(Department department) {
		System.out.println("在Mysql Department表中增加一条记录");
		
	}

	@Override
	public Department getDepartment(int id) {
		System.out.println("在Mysql Department表中根据id查找记录");
		return null;
	}

}
