package com.javatunes.personnel;

import org.junit.Before;
import org.junit.Test;

import java.sql.Date;

import static org.junit.Assert.*;

public class SalariedEmployeeTest {

    private SalariedEmployee emp;
    private SalariedEmployee emp2;
    @Before
    public void setUp() {
        emp = new SalariedEmployee("Logan", Date.valueOf("2020-10-01"), 1500.0);
        emp2 = new SalariedEmployee("Logan", Date.valueOf("2020-10-01"), 1500.0);
    }

    @Test
    public void equals_shouldReturnFalse_differentName_sameHireDate_sameSalary() {
        emp2.setName("Jeremy");
        assertNotEquals(emp, emp2);
    }

    @Test
    public void equals_shouldReturnFalse_sameName_differentHireDate_sameSalary() {
        emp2.setHireDate(Date.valueOf("2020-02-02"));
        assertNotEquals(emp, emp2);
    }

    @Test
    public void equals_shouldReturnFalse_sameName_sameHireDate_differentSalary() {
        emp2.setSalary(1299.0);
        assertNotEquals(emp, emp2);
    }

    @Test
    public void equals_shouldReturnTrue_allProperitesSame() {
        assertEquals(emp, emp2);
    }

    @Test
    public void testPayTaxes() {
        assertEquals(450.0, emp.payTaxes(), .001);
    }

    @Test
    public void testPay() {
        assertEquals(1500.0, emp.pay(), .001);
    }


}