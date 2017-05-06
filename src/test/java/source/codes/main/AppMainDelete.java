package source.codes.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import source.codes.configuration.AppConfig;
import source.codes.model.Employee;
import source.codes.service.EmployeeService;

public class AppMainDelete {

  public static void main(String[] args) {
    AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    
    EmployeeService service = (EmployeeService) context.getBean("employeeService");

    Employee employee = service.findEmployeeById((long) 2);
    service.deleteEmployee(employee);
    
    context.close();
  }

}
