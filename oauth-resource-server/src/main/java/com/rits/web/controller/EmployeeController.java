package com.rits.web.controller;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;
import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;

import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.rits.web.dto.Employee;
/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 24/03/19
 */
@Controller
public class EmployeeController {

    public EmployeeController() {
        super();
    }

    @PreAuthorize("#oauth2.hasScope('employee') and #oauth2.hasScope('read')")
    @RequestMapping(method = RequestMethod.GET, value = "/employee/{id}")
    @ResponseBody
    public Employee findById(@PathVariable final long id) {
        return new Employee(Long.parseLong(randomNumeric(2)), "Employee Resource Accessed");
    }

    @PreAuthorize("#oauth2.hasScope('employee') and #oauth2.hasScope('write')")
    @RequestMapping(method = RequestMethod.POST, value = "/employees")
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public Employee create(@RequestBody final Employee employee) {
        employee.setId(Long.parseLong(randomNumeric(2)));
        return employee;
    }

}
