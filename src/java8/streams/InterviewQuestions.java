package java8.streams;

import java.util.*;
import java.util.stream.Collectors;

public class InterviewQuestions {

    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<Employee>();
        empList.add(new Employee(101,"siva",101,"active",2000));
        empList.add(new Employee(102,"reddy",101,"active",5000));
        empList.add(new Employee(103,"raju",102,"inactive",6000));
        empList.add(new Employee(104,"shivam",102,"inactive",4000));
        empList.add(new Employee(105,"bob",103,"active",3500));
        empList.add(new Employee(106,"alice",103,"inactive",3500));
        empList.add(new Employee(107,"srinu",104,"active",3500));

        //to print employee details base do the dept.
        Map<Integer,List<Employee>> empMap = empList.stream().collect(Collectors.groupingBy(Employee::getDeptId,Collectors.toList()));
        empMap.entrySet().forEach(emp -> System.out.println(emp.getKey()+"---"+emp.getValue()));

        //write the count of employees working on each dept
        Map<Integer,Long> countMap = empList.stream().collect(Collectors.groupingBy(Employee::getDeptId,Collectors.counting()));
        countMap.entrySet().forEach(count -> System.out.println(count.getKey()+"---"+count.getValue()));

        //find the active and inactive status count
        long activeCount = empList.stream().filter(e -> e.getStatus().equalsIgnoreCase("active")).count();
        long inactiveCount = empList.stream().filter(e -> e.getStatus().equalsIgnoreCase("inactive")).count();

        System.out.println("active count" + activeCount);
        System.out.println("inactive count" + inactiveCount);

        //print the min and max employee salary from given collection
        Optional<Employee> maxEmployee = empList.stream().max(Comparator.comparing(Employee::getSalary));
        Optional<Employee> minEmployee = empList.stream().min(Comparator.comparing(Employee::getSalary));

        System.out.println(maxEmployee.get());
        System.out.println(minEmployee.get());

        //to print the salary of each employee from each dept.
        Map<Integer,Optional<Employee>> employeeMap = empList.stream().collect(Collectors.groupingBy(Employee::getDeptId,Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
        employeeMap.entrySet().forEach(emp -> System.out.println(emp.getKey()+"---"+emp.getValue().get().getSalary()));


    }
}
