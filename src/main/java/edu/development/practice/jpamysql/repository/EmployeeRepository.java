package edu.development.practice.jpamysql.repository;

import edu.development.practice.jpamysql.entity.EmployeeEntity;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<EmployeeEntity, Integer> {
}
