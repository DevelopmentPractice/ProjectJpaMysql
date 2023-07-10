package edu.development.practice.jpamysql.controller;

import edu.development.practice.jpamysql.entity.EmployeeEntity;
import edu.development.practice.jpamysql.model.request.EmployeeRequest;
import edu.development.practice.jpamysql.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/employee/crud")
public class EmployeeController {

    private final EmployeeService employeeService;

    @PostMapping(value = "/insert")
    public ResponseEntity<EmployeeEntity> insert(@RequestBody EmployeeRequest request) {
        return new ResponseEntity<>(employeeService.insert(request), HttpStatus.OK);
    }
    @GetMapping(value = "/get/{id}")
    public ResponseEntity<EmployeeEntity> get(@PathVariable(name = "id") String id) {
        return new ResponseEntity<>(employeeService.get(id), HttpStatus.OK);
    }
}
