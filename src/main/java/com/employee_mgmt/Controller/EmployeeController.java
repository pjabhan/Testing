package com.employee_mgmt.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee_mgmt.Model.EmployeeModel;
import com.employee_mgmt.Service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;


	@GetMapping("/getEmployees")
	public List<EmployeeModel> getEmployee(){


		return employeeService.getEmployee(); 
	}
	@PostMapping("/postEmployees")
	public EmployeeModel postEmployee(@RequestBody EmployeeModel employee ) {


		return employeeService.postEmployee(employee);




}
	@PutMapping("/update")
	public EmployeeModel updateEmployee (@RequestBody EmployeeModel employeeId){

	return employeeService.updateEmployee(employeeId);



	}

	@DeleteMapping("/delete/{id}")
	public String deleteEmployee(@PathVariable Integer id) {

		return employeeService.deleteEmployee(id);

	}

}

