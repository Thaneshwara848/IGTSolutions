package com;
// encupulated class // bean class // pojo class (plane old java obj )
class Emp
{
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
public class Demo1 {
	public static void main(String[] args) {		
		Emp e = new Emp();
		e.setId(100);e.setName("Thanesh");
		System.out.println(e.getId());
		System.out.println(e.getName());
	}
}
