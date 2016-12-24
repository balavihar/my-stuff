package org.sample.spock.tests;

import com.common.helper.Employee
import spock.lang.Specification;

import java.util.List;

class TestService extends Specification {

	protected void setUpData(List<Employee> employees) {
		Employee e1 = new Employee()
		Employee e2 = new Employee()
		Employee e3 = new Employee()
		
		e1.setId(1)
		e1.setName("John")
		e1.setAddress("Hyd")
		e1.setPhone(111111)
		
		e2.setId(2)
		e2.setName("Rock")
		e2.setAddress("Bang")
		e2.setPhone(222222)
		
		e3.setId(3)
		e3.setName("Sam")
		e3.setAddress("Mum")
		e3.setPhone(333333)
		
		employees.add(e1)
		employees.add(e2)
		employees.add(e3)
	}
	
}
