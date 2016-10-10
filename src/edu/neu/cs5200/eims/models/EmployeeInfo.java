package edu.neu.cs5200.eims.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmployeeInfo {
	@Id
	private int id;
	private String name;
	private int depatment;
}
