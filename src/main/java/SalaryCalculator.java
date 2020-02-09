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
}