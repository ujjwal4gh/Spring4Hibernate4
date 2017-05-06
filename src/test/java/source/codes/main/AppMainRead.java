package source.codes.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import source.codes.configuration.AppConfig;
import source.codes.model.Employee;
import source.codes.service.EmployeeService;

public class AppMainRead {

  public static void main(String[] args) {
    AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    
    EmployeeService service = (EmployeeService) context.getBean("employeeService");
    
    List<Employee> employees = service.findAllEmployee();
    System.out.println("====================================");
    System.out.println();
    for(Employee employee : employees) {
      System.out.println("Employee Name: " + employee.getName());
      System.out.println("Employee Joining Date: " + employee.getJoiningDate());
      System.out.println("Employee Salary: " + employee.getSalary());
      System.out.println();
    }
    
    System.out.println("====================================");
    context.close();
  }

}
