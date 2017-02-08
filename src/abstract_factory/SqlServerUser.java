package abstract_factory;
/**
 * SqlserverUser实现BaseUser
 * @author user
 *
 */
public class SqlServerUser implements BaseUser{

	@Override
	public void Insert(User user) {
		System.out.println("在SQL Server User表中增加一条记录");
		
	}

	@Override
	public User getUSer(int id) {
		System.out.println("在SQL Server User表中根据id查找记录");
		return null;
	}

}
