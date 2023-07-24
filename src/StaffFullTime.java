public class StaffFullTime extends Staff {
    private double bonus;
    private double moneyDeducted;
    private double hardSalary;


    public StaffFullTime() {
    }


    public StaffFullTime(int employeeId, String name, int age, String phoneNumber, String email, Address address, double bonus, double moneyDeducted, double hardSalary) {
        super(employeeId, name, age,  phoneNumber, email, address);
        this.bonus = bonus;
        this.moneyDeducted = moneyDeducted;
        this.hardSalary = hardSalary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getMoneyDeducted() {
        return moneyDeducted;
    }

    public void setMoneyDeducted(double moneyDeducted) {
        this.moneyDeducted = moneyDeducted;
    }

    public double getHardSalary() {
        return hardSalary;
    }

    public void setHardSalary(double hardSalary) {
        this.hardSalary = hardSalary;
    }
    @Override
    public double realSalary() {
        double totalSalary = hardSalary + (bonus - moneyDeducted);
        return totalSalary;
    }



}
