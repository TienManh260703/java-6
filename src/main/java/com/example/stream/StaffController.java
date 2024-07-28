package com.example.stream;

public class StaffController {
    private static StaffService staffService = new StaffService();

    public static void main(String[] args) {
//        staffService.salaryIncrease();
//        staffService.getList().forEach(staff -> {
//            System.out.println("Name : "+ staff.getName());
//            System.out.println("Salary : "+ staff.getSalary());
//        });

        // lọc theo lương -> in ra tên
//        staffService.findStaffBySalary(50.0);
//        Lọc họ bắt đầu
//        staffService.findStaffByStartName("Trần").forEach(
//                staff -> System.out.println(staff.getName())
//        );
//      Lấy tiên nhân viên
//        staffService.getNameStaff().forEach(System.out::println);
//      Lấy nhân viên theo lương
        staffService.getStaffBySalary(50.0).forEach(System.out::println);
    }
}
