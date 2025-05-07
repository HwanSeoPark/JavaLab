
	//
	// Source code recreated from a .class file by IntelliJ IDEA
	// (powered by FernFlower decompiler)
	//

package com.intheeast.classes.anonymous;

import java.util.concurrent.atomic.LongAdder;
import java.util.function.Function;

	public class FunctionTransformExample {
	    public FunctionTransformExample() {
	    }

	    public static Function<Employee, EmployeeDTO> makeEmployeeDtoFunc(Employee emp) {
	        Function<Employee, EmployeeDTO> toDTO = (e) -> {
	            String var10000 = e.getName();
	            String summary = var10000 + " (" + e.getDepartment() + ", " + e.getAge() + "세)";
	            boolean isSenior = e.getAge() >= 40;
	            double estimatedTax = (double)e.getSalary() * 0.18;
	            return new EmployeeDTO(summary, isSenior, estimatedTax);
	        };
	        return toDTO;
	    }

	    public static void main(String[] args) {
	        Employee emp = new Employee("Daniel", 45, "IT", 8500);
	        Function<Employee, EmployeeDTO> toDTO = makeEmployeeDtoFunc(emp);
	        EmployeeDTO dto = (EmployeeDTO)toDTO.apply(emp);
	        System.out.println(dto);
	        LongAdder adder = null;
	        ((LongAdder)adder).add(5);
	        Runnable r = () -> {
	            System.out.println("Running...");
	        };
	    }

	    static class Employee {
	        private String name;
	        private int age;
	        private String department;
	        private int salary;

	        public Employee(String name, int age, String department, int salary) {
	            this.name = name;
	            this.age = age;
	            this.department = department;
	            this.salary = salary;
	        }

	        public String getName() {
	            return this.name;
	        }

	        public int getAge() {
	            return this.age;
	        }

	        public String getDepartment() {
	            return this.department;
	        }

	        public int getSalary() {
	            return this.salary;
	        }
	    }

	    static class EmployeeDTO {
	        private String summary;
	        private boolean isSenior;
	        private double tax;

	        public EmployeeDTO(String summary, boolean isSenior, double tax) {
	            this.summary = summary;
	            this.isSenior = isSenior;
	            this.tax = tax;
	        }

	        public String toString() {
	            return "[SUMMARY] " + this.summary + "\n[SENIOR] " + (this.isSenior ? "Yes" : "No") + "\n[EST. TAX] $" + this.tax;
	        }
	    }
	
}
