import java.util.ArrayList;
import java.util.List;

public class Manager {
    private List<Staff> listStaff;

    public Manager() {
        listStaff = new ArrayList<>();
    }

    public void createList() {

        StaffFullTime staffFullTime1 = new StaffFullTime(1, "Nguyễn Văn Thành", 20, "0971381340", "Thanh@gmail.com", new Address(), 8000000, 2500000, 5000000);
        StaffFullTime staffFullTime2 = new StaffFullTime(2, "Nguyễn Văn Dân", 30, "0971381340", "Dan@gmail.com", new Address(), 20000000, 2000000, 5000000);
        StaffFullTime staffFullTime3 = new StaffFullTime(3, "Nguyễn Viết Vũ", 28, "0971381340", "Vu@gmail.com", new Address(), 6000000, 2500000, 5000000);
        StaffFullTime staffFullTime4 = new StaffFullTime(4, "Nguyễn Văn Hoàn", 25, "0971381340", "Hoan@gmail.com", new Address(), 1000000, 2500000, 5000000);
        StaffFullTime staffFullTime5 = new StaffFullTime(5, "Nguyễn Văn Thân", 23, "0971381340", "Than@gmail.com", new Address(), 1000000, 200000, 5000000);
        StaffPartTime staffPartTime1 = new StaffPartTime(6, "Nguyễn Thị Hậu", 19, "0971341250", "Hau@gmail.com", new Address(), 160);
        StaffPartTime staffPartTime2 = new StaffPartTime(7, "Nguyễn Thị Hoa", 29, "0971341250", "Hau@gmail.com", new Address(), 130);
        StaffPartTime staffPartTime3 = new StaffPartTime(8, "Nguyễn Thị Ngũ", 30, "0971341250", "Hau@gmail.com", new Address(), 140);
        StaffPartTime staffPartTime4 = new StaffPartTime(9, "Nguyễn Thanh Phương", 23, "0971341250", "Hau@gmail.com", new Address(), 145);
        StaffPartTime staffPartTime5 = new StaffPartTime(10, "Nguyễn Thị Hiền", 40, "0971341250", "Hau@gmail.com", new Address(), 165);


        listStaff.add(staffFullTime1);
        listStaff.add(staffFullTime2);
        listStaff.add(staffFullTime3);
        listStaff.add(staffFullTime4);
        listStaff.add(staffFullTime5);
        listStaff.add(staffPartTime1);
        listStaff.add(staffPartTime2);
        listStaff.add(staffPartTime3);
        listStaff.add(staffPartTime4);
        listStaff.add(staffPartTime5);
    }
    public double avgSalary() {
        double total = 0;
        for (int i = 0; i< listStaff.size();i++) {
             total += listStaff.get(i).realSalary();
        }
        return total/listStaff.size();
    }
    public  void displayListStaff() {
//        createList();
        for (Staff staff:listStaff
             ) {
            System.out.println(staff);
        }
    }
    public void listStaffFullTimeLowerAvg() {
        for (int i = 0; i < listStaff.size();i++) {
            if (listStaff.get(i) instanceof StaffFullTime) {
               StaffFullTime staffFullTime = (StaffFullTime) listStaff.get(i);
            }
            if (listStaff.get(i).realSalary() < avgSalary()) {
                System.out.println(listStaff.get(i));

            }
        }
    }
    public void SalaryPartTime() {
        double total = 0;
        for (int i = 0; i < listStaff.size();i++) {
            if (listStaff.get(i) instanceof StaffPartTime) {
                StaffPartTime staffPartTime = (StaffPartTime) listStaff.get(i);
                total += listStaff.get(i).realSalary();
            }
        }
        System.out.println("Lương phải trả cho tất cả nhân viên bán thời gian là: "+total);
    }
    public void listFullTimeAscending() {
        ArrayList<StaffFullTime> listFullTimeStaff = new ArrayList<>();
        for (int i = 0; i < listStaff.size();i++) {
            if (listStaff.get(i) instanceof StaffFullTime) {
                StaffFullTime staffFullTime = (StaffFullTime) listStaff.get(i);
                listFullTimeStaff.add((StaffFullTime) listStaff.get(i));
            }
        }
        int n = listFullTimeStaff.size();
        for (int i = 0;i < n-1; i++) {
            for (int j = 0; j < n-i-1;j++) {
                if (listFullTimeStaff.get(j).realSalary() > listFullTimeStaff.get(j+1).realSalary()) {
                    StaffFullTime temp = listFullTimeStaff.get(j);
                    listFullTimeStaff.set(j, listFullTimeStaff.get(j+1));
                    listFullTimeStaff.set(j+1, temp);
                }
            }
        }
        for (StaffFullTime a:listFullTimeStaff
             ) {
            System.out.println(a);
        }
    }








}
