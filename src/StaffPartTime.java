public class StaffPartTime extends Staff{
    private double workingHours;

    public StaffPartTime() {
    }

    public StaffPartTime(int employeeId, String name, int age, String phoneNumber, String email, Address address, double workingHours) {
        super(employeeId, name, age, phoneNumber, email, address);
        this.workingHours = workingHours;
    }

    public double getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(double workingHours) {
        this.workingHours = workingHours;
    }

    @Override
    public double realSalary() {
        double totalSalary2 = workingHours * 100000;
        return totalSalary2;
    }
}
