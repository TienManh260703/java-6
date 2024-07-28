package com.example.stream;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StaffService {
    private List<Staff> list = Arrays.asList(
            new Staff("Nguyễn Tiến Mạnh 1", 33.0),
            new Staff("Trần Tiến Mạnh", 55.4),
            new Staff("Nguyễn Mạnh", 66.5),
            new Staff("Võ Tiến Khải", 33.8),
            new Staff("Nguyễn Long Vũ", 49.99),
            new Staff("Nguyễn Huy Hoàng", 99.3),
            new Staff("Nguyễn Quốc Toàn", 51.3)
    );

    // tăng lương x 2
    public void salaryIncrease() {
        list.stream().forEach(staff -> staff.setSalary(staff.getSalary() * 2));
    }

    // filter
    public void findStaffBySalary(Double salary) {
        list.stream().filter(staff -> staff.getSalary() < salary)
                .forEach(staff -> System.out.println(staff.getName()));
    }

    public  List<Staff>  findStaffByStartName (String startName){
        return list.stream().filter( staff -> staff.getName().startsWith(startName)).collect(Collectors.toList());
    }

    public  List<String> getNameStaff (){
        return  list.stream().map( staff -> staff.getName()).collect(Collectors.toList());
    }

    // nv có lương dưới
    public List<Staff> getStaffBySalary (Double salary){
        return list.stream().filter(staff -> staff.getSalary()<salary)
                .collect(Collectors.toList());
    }

    public List<String> getFullNameBySalary (Double salary){
        return list.stream().filter(staff -> staff.getSalary()<salary)
                .map(staff -> staff.getName())
                .collect(Collectors.toList());
    }

    public List<Double> getStaffSalaryBySalary (Double salary){
        return list.stream().filter(staff -> staff.getSalary()<salary)
                .map(staff -> staff.getSalary())
                .collect(Collectors.toList());
    }

}
