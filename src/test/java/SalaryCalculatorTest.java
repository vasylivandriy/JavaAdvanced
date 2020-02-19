import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.internal.configuration.injection.scanner.MockScanner;

import java.io.IOException;

public class SalaryCalculatorTest {

    private SalaryCalculator salaryCalculator;

    SalaryCalculator salaryCalculator0 = new SalaryCalculator("Andriy", "Vareg", 200, 172, 61, 100);
    SalaryCalculator salaryCalculator1 = new SalaryCalculator("Vasyl", "Arial", 250, 172, 52, 125);
    SalaryCalculator salaryCalculator2 = new SalaryCalculator("Oleh", "Serif", 50, 172, 9, 25);
    SalaryCalculator salaryCalculator3 = new SalaryCalculator("Karl", "Aref", 150, 172, 12, 75);
    SalaryCalculator salaryCalculator4 = new SalaryCalculator("Karolina", "Vagen", 100, 172, 0, 50);
    SalaryCalculator salaryCalculator5 = new SalaryCalculator("Pavlo", "Agen", 300, 172, 150, 150);


    @Before
    public void setup() {

        salaryCalculator = new SalaryCalculator();
    }


    @Test
    public void salaryTest() {

        int actual = salaryCalculator.salary(salaryCalculator0.getSalaryPerHour(), salaryCalculator0.getHoursWork(), salaryCalculator0.getHoursHospital(), salaryCalculator0.getHourHospitalSalary());
        int expected = 20200;

        Assert.assertEquals("It is not true", expected, actual);
    }


    @Test
    public void hospitalSalaryTest() throws IOException {

        salaryCalculator5.setHoursHospital(10);

        int actual = salaryCalculator.hospitalSalary(salaryCalculator5.getHoursHospital(), salaryCalculator5.getHourHospitalSalary());
        int expected = 1500;
        Assert.assertEquals(expected, actual);
        Assert.assertTrue(actual > 1000);
    }

    @Test
    public void isWorkSalaryTest20Thous() {

        boolean actual = salaryCalculator.isWorkSalary(salaryCalculator.salary(salaryCalculator0.getSalaryPerHour(), salaryCalculator0.getHoursWork(), salaryCalculator0.getHoursHospital(), salaryCalculator0.getHourHospitalSalary()));
        boolean expected = true;

        Assert.assertTrue(actual);

    }




}
