package abstract_factory;

/**
 * DataAccess类，用反射技术，取代BaseFactory，SqlServerFactory，MysqlFactory
 * 
 * @author user
 *
 */
public class DataAccess {

	private String db;

	public String getDb() {
		return db;
	}

	public void setDb(String db) {
		this.db = db;
	}

	public BaseUser createUser() throws ClassNotFoundException,
			InstantiationException, IllegalAccessException {
		if (db != null && !db.equals("")) {
			// 拼接字符串，注意类名包含包名
			String className = "abstract_factory." + db + "User";
			// 获取以className字符串为名的类
			Class<BaseUser> baseUser = (Class<BaseUser>) Class
					.forName(className);
			// 返回类的实例
			return baseUser.newInstance();
		}
		return null;
	}

	public BaseDepartment createDepartment() throws InstantiationException,
			IllegalAccessException, ClassNotFoundException {
		if (db != null && !db.equals("")) {
			// 拼接字符串，注意类名包含包名
			String className = "abstract_factory." + db + "Department";
			// 获取以className字符串为名的类
			Class<BaseDepartment> baseDepartment = (Class<BaseDepartment>) Class
					.forName(className);
			// 返回类的实例
			return baseDepartment.newInstance();
		}
		return null;
	}

}
