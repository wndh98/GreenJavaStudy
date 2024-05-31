package api01_object;

import java.util.Arrays;

public class Member implements Cloneable{
	private String id;
	private String password;
	private String name;
	int test[]=new int[3];
	
	
	
	public Member(String id, String password, String name) {
		this.id = id;
		this.password = password;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "Member [id=" + id + ", password=" + password + ", name=" + name + ", test=" + test
				+ "]";
	}
	public boolean equals(Member obj) {
		if(obj.getId()!=id) return false; 
		if(obj.getPassword()!=password) return false;
		return true;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
}
