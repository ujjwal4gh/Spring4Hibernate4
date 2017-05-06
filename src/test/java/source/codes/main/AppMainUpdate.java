package source.codes.main;

import java.math.BigDecimal;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import source.codes.configuration.AppConfig;
import source.codes.model.Employee;
import source.codes.service.EmployeeService;

public class AppMainUpdate {

  public static void main(String[] args) {
    AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    
    EmployeeService service = (EmployeeService) context.getBean("employeeService");

    Employee employee = service.findEmployeeById((long) 2);
    employee.setSalary(new BigDecimal("40000"));
    service.updateEmployee(employee);
    
    context.close();
  }

}
