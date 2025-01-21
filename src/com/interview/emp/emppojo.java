package com.interview.emp;

public class emppojo {
	int id;
	String name;
	String department;
	double salary;
	
	int depid;

	public int getDepid() {
		return depid;
	}

	public emppojo(int id, String name, double salary, int depid) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.depid = depid;
	}

	public void setDepid(int depid) {
		this.depid = depid;
	}

	public emppojo(int id, String name, String department, double salary) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "emppojo [id=" + id + ", name=" + name + ", salary=" + salary + ", depid=" + depid + "]";
	}

}
