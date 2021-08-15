package com.test.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id", length = 6, nullable = false)
    private long id;

    @Column(name = "table_number")
    private String table_number;

    @Column(name = "last_name")
    private String last_name;

    @Column(name = "name")
    private String name;

    @Column(name = "second_name")
    private String second_name;

    @Column(name = "date_birthday")
    private Date date_birthday;

    @Column(name = "is_boss")
    private boolean is_boss;

    public Employee() {
    }

    public Employee(String table_number, String last_name, String name, String second_name, Date date_birthday, boolean is_boss) {
        this.table_number = table_number;
        this.last_name = last_name;
        this.name = name;
        this.second_name = second_name;
        this.date_birthday = date_birthday;
        this.is_boss = is_boss;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTable_number() {
        return table_number;
    }

    public void setTable_number(String table_number) {
        this.table_number = table_number;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecond_name() {
        return second_name;
    }

    public void setSecond_name(String second_name) {
        this.second_name = second_name;
    }

    public Date getDate_birthday() {
        return date_birthday;
    }

    public void setDate_birthday(Date date_birthday) {
        this.date_birthday = date_birthday;
    }
}
