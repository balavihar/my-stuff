package org.sample.spock.tests

import com.common.helper.BeanHelper
import com.common.helper.Employee
import spock.lang.Unroll

class BeanHelperTest extends TestService {

    BeanHelper helper

    def setup() {
        helper = new BeanHelper()
    }

    def "Test Get Employee Details"(){
        given:
        helper.with {
            employees = new ArrayList<Employee>()
        }
        setUpData(helper.employees)

        when:
        Employee e = helper.getEmployeeDetails("Rock")

        then:
        e.getId() == 2
    }

    @Unroll
    def "Test Get Employee Details with name #name"(){
        given:
        helper.with {
            employees = new ArrayList<Employee>()
        }
        setUpData(helper.employees)

        when:
        Employee e = helper.getEmployeeDetails(name)

        then:
        e.getId() == results

        where:
        name   || results
        "Rock" || 2
        "John" || 1
    }

    @Unroll
    def "Test Get Employee Details with name #name and id #id"(){
        given:
        helper.with {
            employees = new ArrayList<Employee>()
        }
        setUpData(helper.employees)

        when:
        Employee e = helper.getEmployeeDetails(id, name)

        then:
        e.getPhone() == phoneNo // here phoneNo is results

        where:
        id | name    || phoneNo
        2  | "Rock"  || 222222
        1  | "John"  || 111111
    }

    @Unroll
    def "Test in other pattern: Get Employee Details with name #name and id #id"(){
        setup:
        helper.with {
            employees = new ArrayList<Employee>()
            employees << new Employee(4, "Mark", 123456, "Ipswich")
            employees << new Employee().with {
                setId(5)
                setName("James")
                setPhone(678900)
                setAddress("London")
            }
        }
        //setUpData(helper.employees)

        when:
        Employee e = helper.getEmployeeDetails(id, name)

        then:
        e.getPhone() == phoneNo // here phoneNo is results

        where:
        id | name    || phoneNo
        4  | "Mark"  || 123456
        //5  | "James" || 678900
    }
}
