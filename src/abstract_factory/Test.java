package abstract_factory;


/**
 * 测试类
 * 
 * @author user
 *
 */
public class Test {
	public static void main(String[] args) {
		User user = new User();
		Department department = new Department();

		BaseFactory factory = new MysqlFactory();

		BaseUser mysqlUser = factory.createUser();
		BaseDepartment mysqlDepartment = factory.createDepartment();

		mysqlUser.Insert(user);

		mysqlUser.getUSer(1);

		mysqlDepartment.Insert(department);

		mysqlDepartment.GetDepartment(1);

		
		//读取db.properties使用反射
		Prop prop = new Prop();
		String db = prop.GetProper();
		DataAccess dataAccess = new DataAccess();
		dataAccess.setDb(db);

		try {
			BaseUser baseUser = dataAccess.createUser();
			baseUser.Insert(user);
			baseUser.getUSer(1);

			BaseDepartment baseDepartment = dataAccess.createDepartment();
			baseDepartment.Insert(department);
			baseDepartment.GetDepartment(1);

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
