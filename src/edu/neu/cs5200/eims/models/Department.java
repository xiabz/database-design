package edu.neu.cs5200.eims.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Department {
	@Id
	private int id;
	private String name;
	private int manager_id;
	private int employee_num;
	private String location;
	private int max_num;
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
	public int getManager_id() {
		return manager_id;
	}
	public void setManager_id(int manager_id) {
		this.manager_id = manager_id;
	}
	public int getEmployee_num() {
		return employee_num;
	}
	public void setEmployee_num(int employee_num) {
		this.employee_num = employee_num;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getMax_num() {
		return max_num;
	}
	public void setMax_num(int max_num) {
		this.max_num = max_num;
	}
	public Department(int id, String name, int manager_id, int employee_num, String location, int max_num) {
		super();
		this.id = id;
		this.name = name;
		this.manager_id = manager_id;
		this.employee_num = employee_num;
		this.location = location;
		this.max_num = max_num;
	}
	public Department() {
		super();
	}
	
}
