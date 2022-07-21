package com.javaproject.collectionexample.map;

public class Department  {
	private Integer dptId;
	private String dptName;
	public Department(Integer dptId, String dptName) {
		super();
		this.dptId = dptId;
		this.dptName = dptName;
	}
	@Override
	public String toString() {
		return "Department [dptId=" + dptId + ", dptName=" + dptName + "]";
	}
	
	
}

	