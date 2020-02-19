import java.io.IOException;

class SalaryCalculator {


    private String name;
    private String surname;
    private int salaryPerHour;
    private int hoursWork;
    private int hoursHospital;
    private int hourHospitalSalary;

    public SalaryCalculator() {
    }

    public SalaryCalculator(String name, String surname, int salaryPerHour, int hoursWork, int hoursHospital, int hourHospitalSalary) {
        this.name = name;
        this.surname = surname;
        this.salaryPerHour = salaryPerHour;
        this.hoursWork = hoursWork;
        this.hoursHospital = hoursHospital;
        this.hourHospitalSalary = hourHospitalSalary;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalaryPerHour() {
        return salaryPerHour;
    }

    public void setSalaryPerHour(int salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }


    public int getHoursWork() {
        return hoursWork;
    }

    public void setHoursWork(int hoursWork) {
        this.hoursWork = hoursWork;
    }

    public int getHoursHospital() {
        return hoursHospital;
    }

    public void setHoursHospital(int hoursHospital) {
        this.hoursHospital = hoursHospital;
    }

    public int getHourHospitalSalary() {
        return hourHospitalSalary;
    }

    public void setHourHospitalSalary(int hourHospitalSalary) {
        this.hourHospitalSalary = hourHospitalSalary;

    }

    @Override
    public String toString() {
        return "SalaryCalculator{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salaryPerHour=" + salaryPerHour +
                ", hoursWork=" + hoursWork +
                ", hoursHospital=" + hoursHospital +
                ", hourHospitalSalary=" + hourHospitalSalary +
                '}';
    }


    int salary(int salaryPerHour, int hoursWork, int hoursHospital, int hourHospitalSalary) {

        return salaryPerHour * (hoursWork - hoursHospital) + hoursHospital * hourHospitalSalary;

    }


    int hospitalSalary(int hoursHospital, int hourHospitalSalary) throws IOException {

        if (hoursHospital > 15) {
            throw new IOException("You inputted wrong (too much) hospital hours. Must be less then 15");
        } else {
            return hoursHospital * hourHospitalSalary;
        }
    }


    boolean isWorkSalary (int workSalary){

        if (workSalary<20000){
            try {
                throw new Exception("Hospital Salary can't be more then work salary. Worker was sicken too much time!!!");
            } catch (Exception e) {
                e.printStackTrace();
            }
            return Boolean.parseBoolean(null);
        }
        else return workSalary>20000;


    }



}