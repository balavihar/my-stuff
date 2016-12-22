package org.sample.junit.tests;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.common.helper.BeanHelper;
import com.common.helper.Employee;

public class BeanHelperTest extends TestService {
	private BeanHelper helper; 
	
	@Before
	public void setUp() {
		helper = new BeanHelper();
		helper.employees = new ArrayList<Employee>();
		setUpData(helper.employees);
	}
	
	@Test
	public void testGetEmployeeDetails() {
		Employee e = helper.getEmployeeDetails("Rock");
		
		Assert.assertEquals(new Integer(2), e.getId());
	}
	
}
