package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class AppIntegrationTest
{
    static App app;

    @BeforeAll
    static void init()
    {
        app = new App();
        app.connect("localhost:33060", 30000);

    }

    @Test
    void testGetEmployee()
    {
        Employee emp = app.getEmployee(255530);
        assertEquals(emp.emp_no, 255530);
        assertEquals(emp.first_name, "Ronghao");
        assertEquals(emp.last_name, "Garigliano");
    }

    @Test
    void testGetEmployee2()
    {
        Employee emp = app.getEmployee("Ronghao", "Garigliano");
        assertEquals(emp.emp_no, 255530);
        assertEquals(emp.first_name, "Ronghao");
        assertEquals(emp.last_name, "Garigliano");
    }

    @Test
    void testGetAllSalaries(){
        ArrayList<Employee> all = app.getAllSalaries();
        assertEquals(all.size(),71086);
    }

    @Test
    void testGetSpecificSalary(){
        ArrayList<Employee> salaries = app.getSpecificSalaries("Engineer");
        assertEquals(salaries.size(), 9224);
    }

    @Test
    void testGetSpecificSalaryNull(){
        ArrayList<Employee> salaries = app.getSpecificSalaries("None");
        assertEquals(salaries.size(), 0);
    }
}