package com.example.demo;

public class DomesticPlan extends Plan {
	@Override
	 public Integer getUnits() {
	return units;
	}

@Override
public Integer getRate() {
	// TODO Auto-generated method stub
return rate;	
}

@Override
public Integer calculateBills1(Integer rate,Integer units)
{
	return rate*units;
}
}
