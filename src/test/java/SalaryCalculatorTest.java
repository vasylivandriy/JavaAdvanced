import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;

public class SalaryCalculatorTest {

    private SalaryCalculator salaryCalculator;


    @Before
    public void setup() {

        salaryCalculator = new SalaryCalculator();
    }


    @Test
    public void salaryTest() {

        int salaryPerHour1 = 200;
        int hoursWork1 = 172;
        int hoursHospital1 = 61;
        int hourHospitalSalary1 = 100;

        int actual = salaryCalculator.salary(salaryPerHour1, hoursWork1, hoursHospital1, hourHospitalSalary1);
        int expected = 20200;

        Assert.assertEquals("It is not true", expected, actual);
    }


    @Test
    public void hospitalSalaryTest() throws IOException {

        int hoursHospital2 = 61;
        int hourHospitalSalary2 = 100;

        int actual = salaryCalculator.hospitalSalary(hoursHospital2, hourHospitalSalary2);
        int expected = 1500;
        Assert.assertEquals(expected, actual);
        Assert.assertTrue(actual > 1000);
    }

    @Test
    public void isWorkSalaryTest20Thous() {

        salaryCalculator.setSalaryPerHour(200);
        salaryCalculator.setHoursWork(172);
        salaryCalculator.setHoursHospital(61);
        salaryCalculator.setHourHospitalSalary(100);

        boolean actual = salaryCalculator.isWorkSalary(salaryCalculator.salary(salaryCalculator.getSalaryPerHour(), salaryCalculator.getHoursWork(), salaryCalculator.getHoursHospital(), salaryCalculator.getHourHospitalSalary()));
        boolean expected = true;

        Assert.assertTrue(actual);

    }


}
