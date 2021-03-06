package com.common.helper;

import java.util.List;
import java.util.function.Predicate;

/**
 * Hello world!
 *
 */
public class BeanHelper 
{
    public List<Employee> employees;
    
    public Employee getEmployeeDetails(String empName) {
		
    	Predicate<Employee> testForEmpName = emp -> emp.getName().equalsIgnoreCase(empName); 
    	
    	return employees.stream().filter(testForEmpName).findFirst().get();
	}
    
    public Employee getEmployeeDetails(Integer id, String empName) {

		Predicate<Employee> testForEmpName = emp -> emp.getName().equalsIgnoreCase(empName) && emp.getId().equals(id);

		return employees.stream().filter(testForEmpName).findFirst().get();
	}
}

