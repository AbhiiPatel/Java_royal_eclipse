package javaInroduction.io;

import java.io.Serializable;

public class Student implements Serializable{

	private int rolllno;
	private String name;
	private  transient int std;
	
	public Student(int rolllno, String name, int std) {
		super();
		this.rolllno = rolllno;
		this.name = name;
		this.std = std;
	}
	public int getRolllno() {
		return rolllno;
	}
	public void setRolllno(int rolllno) {
		this.rolllno = rolllno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStd() {
		return std;
	}
	public void setStd(int std) {
		this.std = std;
	}
	
	
	
	
}
