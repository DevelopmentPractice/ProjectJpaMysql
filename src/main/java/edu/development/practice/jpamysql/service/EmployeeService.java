package edu.development.practice.jpamysql.service;

import edu.development.practice.jpamysql.entity.EmployeeEntity;
import edu.development.practice.jpamysql.model.request.EmployeeRequest;

public interface EmployeeService {

    EmployeeEntity insert(EmployeeRequest request);

    EmployeeEntity get(String id);
}
