package abstract_factory;
/**
 * BaseFactory接口：抽象的工厂接口
 * @author user
 *
 */
public interface BaseFactory {
      BaseUser createUser();
      
      BaseDepartment createDepartment();
}
