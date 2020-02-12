import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import java.io.IOException;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class SalaryCalculatorTestMockito {

@InjectMocks
Main main = new Main();




@Test
public void testMockito() throws IOException {

   when(main.hospitalSalary(14,100)).thenReturn(1400);
    verify(main).hospitalSalary(14,100);
   int actual = main.hospitalSalary(main.salaryCalculator1.getHoursHospital(),main.salaryCalculator1.getHourHospitalSalary());
   int expected = 5000;
    Assert.assertEquals(expected,actual);
   //
}



}
