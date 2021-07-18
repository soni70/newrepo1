package com.example.demo;

public class domestic {
	public Plan getPlan(String plantype) {
		// TODO Auto-generated method stub
		if(plantype.equalsIgnoreCase("domestic"))
		{
			return new DomesticPlan();
		}
		
		return null;
	}

	

	

}
