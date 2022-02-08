package com.employee_mgmt.Service;


	import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee_mgmt.Model.EmployeeModel;
import com.employee_mgmt.Repo.EmployeeRepo;


	@Service
	public class EmployeeService { 

		@Autowired
		EmployeeRepo employeeRepo;
		public List<EmployeeModel> getEmployee(){
			return employeeRepo.findAll();


		}
		public EmployeeModel postEmployee(EmployeeModel employee) {
			return employeeRepo.save(employee);




		}
		public EmployeeModel updateEmployee(EmployeeModel employeeObj){

			return employeeRepo.save(employeeObj);

		}
		public String  deleteEmployee(Integer id)  {


			Optional<EmployeeModel> employee=employeeRepo.findById(id);
			if(employee.isPresent()) {
				employeeRepo.delete(employee.get());;
				return "employee is deleted with id" +id;
			}
			else
				return "no employee found";




		}

	}
