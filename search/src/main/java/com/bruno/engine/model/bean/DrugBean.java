package com.bruno.engine.model.bean;

public class DrugBean {
	
	private int id;
	private String drugName;
	
	public DrugBean(){};
	
	public DrugBean(int id, String drugName) {
		this.id = id;
		this.drugName = drugName;
	}
	public int getId() {
		return id;
	}
	public DrugBean setId(int id) {
		this.id = id;
		return this;
	}
	public String getDrugName() {
		return drugName;
	}
	public DrugBean setDrugName(String drugName) {
		this.drugName = drugName;
		return this;
	}
	
	@Override
	public String toString() {
		return "Drug: " + drugName;
	}
	
}
