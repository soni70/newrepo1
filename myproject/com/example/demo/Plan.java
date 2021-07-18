package com.example.demo;
public abstract class Plan {
	public Integer rate;
	public Integer units;
public void setRate(Integer rate) {
		this.rate = rate;
	}
	public void setUnits(Integer units) {
		this.units = units;
	}
public abstract Integer getRate();
public abstract Integer getUnits();
public abstract Integer calculateBills1(Integer rate,Integer Units);







}