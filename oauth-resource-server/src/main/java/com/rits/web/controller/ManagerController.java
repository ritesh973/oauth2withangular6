package com.rits.web.controller;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;
import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;

import com.rits.web.dto.Manager;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 24/03/19
 */
@Controller
public class ManagerController {

    public ManagerController() {
        super();
    }

    @PreAuthorize("#oauth2.hasScope('manager') and #oauth2.hasScope('read')")
    @RequestMapping(method = RequestMethod.GET, value = "/manager/{id}")
    @ResponseBody
    public Manager findById(@PathVariable final long id) {
        return new Manager(Long.parseLong(randomNumeric(2)), "Manager Resource Accessed");
    }

    @PreAuthorize("#oauth2.hasScope('manager') and #oauth2.hasScope('write') and hasRole('ROLE_ADMIN')")
    @RequestMapping(method = RequestMethod.POST, value = "/managers")
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public Manager create(@RequestBody final Manager manager) {
        manager.setId(Long.parseLong(randomNumeric(2)));
        return manager;
    }

}
