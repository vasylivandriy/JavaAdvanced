import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.internal.configuration.injection.scanner.MockScanner;

import java.io.IOException;

public class SalaryCalculatorTest {

    private Main main;


    @Before
    public void setup() {

        main = new Main();
    }


    @Test
    public void salaryTest() {

        int actual = main.salary(main.salaryCalculator0.getSalaryPerHour(), main.salaryCalculator0.getHoursWork(), main.salaryCalculator0.getHoursHospital(), main.salaryCalculator0.getHourHospitalSalary());
        int expected = 20200;

        Assert.assertEquals("It is not true", expected, actual);
    }


    @Test
    public void hospitalSalaryTest() throws IOException {

        main.salaryCalculator5.setHoursHospital(10);

        int actual = main.hospitalSalary(main.salaryCalculator5.getHoursHospital(), main.salaryCalculator5.getHourHospitalSalary());
        int expected = 1500;
        Assert.assertEquals(expected, actual);
        Assert.assertTrue(actual > 1000);
    }

    @Ignore("I don't have a time")
    public void isWorkSalaryTest20Thous() {

        boolean actual = main.isWorkSalary(main.salary(main.salaryCalculator0.getSalaryPerHour(), main.salaryCalculator0.getHoursWork(), main.salaryCalculator0.getHoursHospital(), main.salaryCalculator0.getHourHospitalSalary()));
        boolean expected = true;

        Assert.assertTrue(actual);

    }


}
