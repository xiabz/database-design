package edu.neu.cs5200.eims.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RegistEmployee {
	@Id
	private int id;
	private String name;
	private String password;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public RegistEmployee(Integer id, String name, String password) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
	}
	public RegistEmployee() {
		super();
	}
}
