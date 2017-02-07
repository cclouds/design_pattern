package prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
/**
 * 原型模式
 * @author user
 *
 */
public class Prototype implements Cloneable , Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1579634936337009763L;

	/*
	 * 姓名
	 */
	private  String name;
	
	/*
	 * 身高
	 */
	private int height;
	
	private ArrayList<String> nameList = new ArrayList<String>(); 
	
	public Object clone(){
		Prototype prototype = null;
		try {
			prototype = (Prototype) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prototype;
		
	}
	
	public Object deepClone() throws IOException, ClassNotFoundException{
		//将对象写到流里
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(this);
		
		 //将对象从流中取出
		ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bis);
		return  ois.readObject();
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public ArrayList<String> getNameList() {
		return nameList;
	}

	public void setNameList(ArrayList<String> nameList) {
		this.nameList = nameList;
	}
	
	

}
