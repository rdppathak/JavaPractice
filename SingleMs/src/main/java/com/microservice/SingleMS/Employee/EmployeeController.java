package com.microservice.SingleMS.Employee;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.discovery.shared.transport.decorator.EurekaHttpClientDecorator.RequestType;

@Controller
public class EmployeeController {
	
	@RequestMapping("/createEmployee")
	public @ResponseBody Employee createEmployee(@RequestParam(value="id") long id,
			@RequestParam(value="firstName") String firstName,
			@RequestParam(value="emailId") String emailId){
		Employee employee = new Employee(id, firstName, emailId);
		return employee;
	}
}
