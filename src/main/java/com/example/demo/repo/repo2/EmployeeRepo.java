package com.example.demo.repo.repo2;

import com.example.demo.models.models2.employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepo extends CrudRepository<employee, Long > {

      List<employee> findBySalaryContains(String name);

    List<employee> findBySalary(String name);

}
