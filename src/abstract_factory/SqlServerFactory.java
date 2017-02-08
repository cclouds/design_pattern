package abstract_factory;
/**
 * SqlServerFactory类实现BaseFactory,实例化SqlServerUser,SqlServerDepartment
 * @author user
 *
 */
public class SqlServerFactory implements BaseFactory{

	@Override
	public BaseUser createUser() {
		
		return new SqlServerUser();
		
	}

	@Override
	public BaseDepartment createDepartment() {
		
		return new SqlServerDepartment();
		
	}

}
