package com.employee_mgmt.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee_mgmt.*;
import com.employee_mgmt.Model.DepartmentModel;


@Repository
public interface DepartmentRepo extends JpaRepository<DepartmentModel, Integer> {

}