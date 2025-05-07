package com.intheeast.classes.lambda;

import java.util.function.Function;

public class FunctionTransformExample {

	interface Adder {
	    int add(int a, int b); 
		
	}
	
	 // 원본 도메인 클래스
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

        public String getName() { return name; }
        public int getAge() { return age; }
        public String getDepartment() { return department; }
        public int getSalary() { return salary; }
    }

    // 변환 대상 DTO 클래스
    static class EmployeeDTO {
        private String summary; // 직원의 이름, 부서, 나이를 묶음
        private boolean isSenior;
        private double tax;

        public EmployeeDTO(String summary, boolean isSenior, double tax) {
            this.summary = summary;
            this.isSenior = isSenior;
            this.tax = tax;
        }

        @Override
        public String toString() {
            return "[SUMMARY] " + summary +
                   "\n[SENIOR] " + (isSenior ? "Yes" : "No") +
                   "\n[EST. TAX] $" + tax;
        }
    }

    // 이 메서드가 리턴하는 데이터 타입은
    // Function<Employee, EmployeeDTO> 인터페이스를 구현한 구체에 대한 참조값
    public static Function<Employee, EmployeeDTO> makeEmployeeDtoFunc(Employee emp) {
        // Function<Employee, EmployeeDTO>
        //     EmployeeDTO apply<Employee e>
        //
        // 변환 함수: Employee → EmployeeDTO
        Function<Employee, EmployeeDTO> toDTO = e -> {
        	// summary = "Daniel(IT, 45세)"
            String summary = e.getName() + " (" + e.getDepartment() + ", " + e.getAge() + "세)";
            boolean isSenior = e.getAge() >= 40;
            double estimatedTax = e.getSalary() * 0.18; // 18% 세금 추정

            return new EmployeeDTO(summary, isSenior, estimatedTax);
        };
        
        return toDTO;
    }
    
    public static void main(String[] args) {
        Employee emp = new Employee("Daniel", 45, "IT", 8500);
        
        Function<Employee, EmployeeDTO> toDTO = makeEmployeeDtoFunc(emp);
        EmployeeDTO dto = toDTO.apply(emp);
        
        System.out.println(dto);
   
        // adder는 로컬 변수이기 때문에,
        Adder adder = null;
        // 초기화가 되어야만 다음과 같이 사용할 수 있다.
        adder.add(5, 3);
    
    }
   
}
