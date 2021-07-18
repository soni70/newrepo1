package com.example.demo;








import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;






@RestController
@RequestMapping("/api/bill/")
public class controller{
	@GetMapping("/get")
    public Plan bills()
    {
	
		domestic d=new domestic();
			String planType="domestic";
		Plan p2=d.getPlan(planType);
	

	
		
	return p2;
    }
	
	
	@PostMapping("create")
	public String commercialservicedata(@RequestBody DomesticPlan dp )
	{

		
	
		Plan p=dp;
		

Integer a = p.getRate();
Integer b = p.getUnits();

	
	return a+" "+b+" "+p.calculateBills1(a,b);
		
	}
	
	
	
	
		
	
	
	

	
			
			
}
