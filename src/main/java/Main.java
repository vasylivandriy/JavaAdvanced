import java.io.IOException;

public class Main {


    SalaryCalculator salaryCalculator0 = new SalaryCalculator("Andriy", "Vareg", 200, 172, 61, 100);
    SalaryCalculator salaryCalculator1 = new SalaryCalculator("Vasyl", "Arial", 250, 172, 52, 125);
    SalaryCalculator salaryCalculator2 = new SalaryCalculator("Oleh", "Serif", 50, 172, 9, 25);
    SalaryCalculator salaryCalculator3 = new SalaryCalculator("Karl", "Aref", 150, 172, 12, 75);
    SalaryCalculator salaryCalculator4 = new SalaryCalculator("Karolina", "Vagen", 100, 172, 0, 50);
    SalaryCalculator salaryCalculator5 = new SalaryCalculator("Pavlo", "Agen", 300, 172, 72, 150);


    int salary(int salaryPerHour, int hoursWork, int hoursHospital, int hourHospitalSalary) {

        return salaryPerHour * (hoursWork - hoursHospital) + hoursHospital * hourHospitalSalary;

    }


    int hospitalSalary(int hoursHospital, int hourHospitalSalary) throws IOException {

        if (hoursHospital > 15) {
            throw new IOException("You inputted wrong hospital hours");
        } else {
            return hoursHospital * hourHospitalSalary;
        }
    }


}
