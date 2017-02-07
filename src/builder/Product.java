package builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Product:产品类，由多个部件组成
 * @author user
 *
 */
public class Product {
	
	List<String> list = new ArrayList<String>();
	
	public void add(String part){
		list.add(part);
	}
	
	public void show(){
		System.out.println("产品创建");
		for(String part:list){
			System.out.println(part);
		}
	}

}
