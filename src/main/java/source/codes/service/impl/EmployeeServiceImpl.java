package source.codes.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import source.codes.dao.EmployeeDAO;
import source.codes.model.Employee;
import source.codes.service.EmployeeService;

@Service("employeeService")
@Transactional
public class EmployeeServiceImpl implements EmployeeService{

  @Autowired
  private EmployeeDAO employeeDAO;
  
  @Override
  public void saveEmployee(Employee employee) {
    employeeDAO.saveEmployee(employee);
  }

  @Override
  public List<Employee> findAllEmployee() {
    return employeeDAO.findAllEmployees();
  }

  @Override
  public void deleteEmployee(Employee employee) {
    employeeDAO.deleteEmployee(employee);
  }

  @Override
  public Employee findEmployeeById(Long id) {
    return employeeDAO.findById(id);
  }

  @Override
  public void updateEmployee(Employee employee) {
    employeeDAO.updateEmployee(employee);
  }

}
