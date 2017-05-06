package source.codes.main;

import java.math.BigDecimal;

import org.joda.time.LocalDate;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import source.codes.model.Employee;
import source.codes.service.EmployeeService;

public class AppMainCreate {

  public static void main(String[] args) {
    AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    
    EmployeeService service = (EmployeeService) context.getBean("employeeService");
    
    Employee employee1 = new Employee();
    employee1.setName("Ujjwal Verma");
    employee1.setJoiningDate(new LocalDate(2017, 01, 16));
    employee1.setSalary(new BigDecimal("29166.6667"));
    
    Employee employee2 = new Employee();
    employee2.setName("Amit Madan");
    employee2.setJoiningDate(new LocalDate(2015, 10, 01));
    employee2.setSalary(new BigDecimal("35100"));
    
    service.saveEmployee(employee1);
    service.saveEmployee(employee2);
    
    context.close();
  }

}
