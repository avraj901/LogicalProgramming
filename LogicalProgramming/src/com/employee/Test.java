package com.employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;

public class Test {

	public static void main(String[] args) {

		List<Employee> employeeList = new ArrayList<>();

		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

		// Find male and female employee

		Map<String, Long> noOfMaleAndFemaleEmp = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

		System.out.println(noOfMaleAndFemaleEmp);

		// Find name of the all department

		employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);

		// Average age of male and female employee

		Map<String, Double> avgAgeOfMaleAndFemale = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getAge)));

		System.out.println(avgAgeOfMaleAndFemale);

		// find highest paid employee

		Employee emp = employeeList.stream().max(Comparator.comparingDouble(Employee::getSalary)).get();

		System.out.println(emp);

		// second approach

		Employee highestpaidEmploee = employeeList.stream()
				.collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))).get();

		System.out.println(highestpaidEmploee);

		// Find all the employee who have joined after 2015

		List<Employee> empList = employeeList.stream().filter(empl -> empl.getYearOfJoining() > 2015)
				.collect(Collectors.toList());

		System.out.println(empList);

		// count the number of employee in each department

		Map<String, Long> departmentCount = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

		System.out.println(departmentCount);

		// average salary of each department

		Map<String, Double> avgSalaryOfEachDept = employeeList.stream().collect(
				Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));

		System.out.println(avgSalaryOfEachDept);

		// Find youngest male emp in product development department

		Employee minAgeOfEmp = employeeList.stream().filter(empd -> empd.getDepartment().equals("Product Development"))
				.filter(empg -> empg.getGender().equals("Male")).min(Comparator.comparing(Employee::getAge)).get();

		System.out.println(minAgeOfEmp);

		// both filter added in one filter

		Employee minAgeOfEmpl = employeeList.stream()
				.filter(empd -> empd.getDepartment().equals("Product Development") && empd.getGender().equals("Male"))
				.min(Comparator.comparing(Employee::getAge)).get();

		System.out.println(minAgeOfEmpl);

		// find most working experience

		Employee mostWorkExp = employeeList.stream().sorted(Comparator.comparing(Employee::getYearOfJoining))
				.findFirst().get();

		System.out.println(mostWorkExp);

		// find male and female employee in sales and marketing department

		Map<String, Long> countMaleAndFemaleEmpInSales = employeeList.stream()
				.filter(empDep -> empDep.getDepartment().equals("Sales And Marketing"))
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

		System.out.println("countMaleAndFemaleEmpInSales : : " + countMaleAndFemaleEmpInSales);

		// List down the names of all employee in each department

		Map<String, List<Employee>> EmpListByDepartment = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment));

		System.out.println(EmpListByDepartment);

		// Find average salary and total salary

		DoubleSummaryStatistics summaryStatistics = employeeList.stream()
				.collect(Collectors.summarizingDouble(Employee::getSalary));

		System.out.println("Sum :: " + summaryStatistics.getSum());
		System.out.println("Average ::" + summaryStatistics.getAverage());

		// Separate all the employee who are younger or equal to 25

		Map<Boolean, List<Employee>> EmplByAge = employeeList.stream()
				.collect(Collectors.partitioningBy(empAge -> empAge.getAge() >= 25));

		System.out.println(EmplByAge);

		// Find oldest employee
		Employee maxAgeEmp = employeeList.stream().max(Comparator.comparing(Employee::getAge)).get();

		System.out.println("Max age Employee : " + maxAgeEmp);

	}

}
