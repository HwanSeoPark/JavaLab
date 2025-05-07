package com.intheeast.inheritance;

public class SubClass2 extends SuperClass2 {

	NestedClass nc;
	
	public SubClass2() {
		System.out.println("SubClass2");
	}
	
	public int getSuperPrivateField() {
		return super.getPrivateField();		
	}
	
	public void setSuperPrivateField(int field) {
		super.setPrivateField(field);
		return ;		
	}
	
	// SubNestedClass는 SuperClass2로부터 상속받은 NestedClass를 상속함
	class SubNestedClass extends /*SuperClass2.*/NestedClass {
	
		public SubNestedClass() {
			System.out.println("SubNestedClass constructor");
		}
		
        void accessSuperPrivateField() {
            // SubNestedClass는 SuperClass2의 내부 클래스인 NestedClass를 상속받았으므로, 
            // SuperClass2의 privateField에 접근할 수 있습니다.
            // 하지만 직접적으로 접근하는 것이 아니라, 
            // SuperClass2의 인스턴스를 통해 간접적으로 접근하게 됩니다.
            accessPrivateField(); // 이것은 super.accessPrivateField()와 동일합니다.
        }
    }
}
