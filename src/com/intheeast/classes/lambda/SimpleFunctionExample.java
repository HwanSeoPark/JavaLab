package com.intheeast.classes.lambda;

import java.util.function.Function;

public class SimpleFunctionExample {
	
	
	static class Employee {
        private String name;
        private int age;
        private String department;

        public Employee(String name, int age, String department) {
            this.name = name;
            this.age = age;
            this.department = department;
        }

        public String getName() { 
        	return name; 
        	}
       
        public int getAge() { 
        	return age; 
        	}
        
        public String getDepartment() {
        	return department; 
        	}
        
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Bob", 40, "Finance");

        // Employee → 나이(Integer) 변환
        // Function<Employee, Integer> {
        //    Integer apply(Employee e) {
        //			return e.getAge();
        //    }
//      Function<Employee, Integer> ageExtractor = (Employee e) -> e.getAge();
        Function<Employee, Integer> ageExtractor = (Employee e) -> {
        	return e.getAge();
        };
        
        // Employee → 이름(String) 추출
        // Function<Employee, String> {
        //     String apply(Employee e) {
        //			return e.getName();
        //     }
//      Function<Employee, String> nameExtractor = (Employee e) -> e.getName();
        Function<Employee, String> nameExtractor = (Employee e) -> {
        	return e.getName();
        };

        // Employee → 부서(String) 추출
        // Function<Employee, String> {
        //     String apply(Employee e) {
        //			return e.getDepartment();
        //     }
//      Function<Employee, String> deptExtractor = (Employee e) -> e.getDepartment();
        Function<Employee, String> deptExtractor = (Employee e) -> {
        	return e.getDepartment();
        };
                
        // apply를 직접 호출해서 사용
        int age = ageExtractor.apply(emp);
        String name = nameExtractor.apply(emp);
        String department = deptExtractor.apply(emp);

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
    }
    
    
    
}
