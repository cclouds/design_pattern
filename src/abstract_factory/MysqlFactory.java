package abstract_factory;
/**
 * MysqlFactory类实现BaseFactory接口，实例化MysqlUser,MysqlDepartment
 * @author user
 *
 */
public class MysqlFactory implements BaseFactory{

	@Override
	public BaseUser createUser() {
		return new MysqlUser();
	}

	@Override
	public BaseDepartment createDepartment() {
		return new MysqlDepartment();
	}

}
