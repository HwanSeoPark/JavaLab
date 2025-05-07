package com.intheeast.inheritance;

public class SuperClass2 {

	
	private int privateField;
//    NestedClass nc;
	
	public SuperClass2() {
		this.privateField = 1;
		System.out.println("SuperClass2 Constructor");
	}
    
    public SuperClass2(NestedClass nc) {
		this.privateField = 1;
//        this.nc = nc;
		System.out.println("SuperClass2 Constructor");
	}
	
	public int getPrivateField() {
//    	this.nc.accessPrivateField();
		return privateField;
        
	}

	public void setPrivateField(int privateField) {
        //accessPrivateField();
		this.privateField = privateField;
	}

	// 멤버인데... 멤버이지만, class임. class라 함은? 설계도...
	protected class NestedClass {
		
		public NestedClass() {
			System.out.println("NestedClass Constructor");
		}
		
		void accessPrivateField() {
			System.out.printf("accessPrivateField:%d \n", privateField);
		}
	}
}
