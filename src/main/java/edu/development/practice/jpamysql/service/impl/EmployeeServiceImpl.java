package edu.development.practice.jpamysql.service.impl;

import edu.development.practice.jpamysql.entity.EmployeeEntity;
import edu.development.practice.jpamysql.model.request.EmployeeRequest;
import edu.development.practice.jpamysql.repository.EmployeeRepository;
import edu.development.practice.jpamysql.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Override
    public EmployeeEntity insert(EmployeeRequest request) {
        EmployeeEntity employeeEntity = EmployeeEntity.builder()
          .position(request.getPosition())
          .salary(request.getSalary())
          .build();
        employeeRepository.save(employeeEntity);

        return employeeEntity;
    }

    @Override
    public EmployeeEntity get(String id) {
        return employeeRepository.findById(Integer.parseInt(id)).orElseThrow(() -> new RuntimeException("No se Encontro el Registro"));
    }
}
