package java8.mapvsflatmap;

import java8.mapvsflatmap.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    /**
     * map is used for transformation and flatmap is used for transformation+flattening
     * @param args
     */
    public static void main(String[] args) {
        List<java8.mapvsflatmap.Employee> empList = new ArrayList<java8.mapvsflatmap.Employee>();
        empList.add(new java8.mapvsflatmap.Employee(101,"siva",101,"active",2000,"abc1@gmail.com",List.of("9818082721","9818087721")));
        empList.add(new java8.mapvsflatmap.Employee(102,"reddy",101,"active",5000,"abc2@gmail.com",List.of("9818082721","9818087721")));
        empList.add(new java8.mapvsflatmap.Employee(103,"raju",102,"inactive",6000,"abc3@gmail.com",List.of("9818082721","9818087721")));
        empList.add(new java8.mapvsflatmap.Employee(104,"shivam",102,"inactive",4000,"abc4@gmail.com",List.of("9818082721","9818087721")));
        empList.add(new java8.mapvsflatmap.Employee(105,"bob",103,"active",3500,"abc5@gmail.com",List.of("9818082721","9818087721")));
        empList.add(new java8.mapvsflatmap.Employee(106,"alice",103,"inactive",3500,"abc6@gmail.com",List.of("9818082721","9818087721")));
        empList.add(new Employee(107,"srinu",104,"active",3500,"abc7@gmail.com",List.of("9818082721","9818087721")));

        List<String> emails = empList.stream().map(emp-> emp.getEmail()).collect(Collectors.toList());
        emails.stream().forEach(System.out::println);

        List<List<String>> phones = empList.stream().map(emp-> emp.getPhoneNumbers()).collect(Collectors.toList());
        System.out.println(phones);

        System.out.println();
        List<String> flatPhones = empList.stream().flatMap(emp-> emp.getPhoneNumbers().stream()).collect(Collectors.toList());
        System.out.println(flatPhones);

    }
}
