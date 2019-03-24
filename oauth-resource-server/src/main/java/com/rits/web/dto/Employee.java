package com.rits.web.dto;

/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 24/03/19
 */

public class Employee {
    private long id;
    private String name;

    public Employee() {
        super();
    }

    public Employee(final long id, final String name) {
        super();

        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(final long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

}