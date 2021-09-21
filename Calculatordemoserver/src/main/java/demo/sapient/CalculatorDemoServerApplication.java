package demo.sapient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CalculatorDemoServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculatorDemoServerApplication.class, args);
	}

}
