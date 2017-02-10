package abstract_factory;
/**
 * SqlServerDepartment实现BaseDepartment
 * @author user
 *
 */
public class SqlServerDepartment implements BaseDepartment{

	@Override
	public void insert(Department department) {
		System.out.println("在SQL Server Department表中增加一条记录");
		
	}

	@Override
	public Department getDepartment(int id) {
		System.out.println("在SQL Server Department表中根据id查找记录");
		return null;
	}

}
