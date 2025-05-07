package com.intheeast.classes.nestedclass;

import java.util.function.Function;

public class DataStructure {
    
    // Create an array
    private final static int SIZE = 15;
    private int[] arrayOfInts = new int[SIZE];
     
    public DataStructure() {
        // fill the array with ascending integer values
        for (int i = 0; i < SIZE; i++) {
            arrayOfInts[i] = i;
        }
    }
    
    public int[] getArray() {
    	return arrayOfInts;
    }
    
    public int getElement(int index) {
        return arrayOfInts[index];        
    }
     
    public void printEven() {
         
        // Print out values of even indices of the array
        DataStructureIterator iterator = this.new EvenIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
    
    public void print(DataStructureIterator iterator) {
    	
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();    	
        
    }
    
//    public interface Function<T, R> {        
//        R apply(T t);
//    }    
    /*
     힌트: 이 print 메서드에서 for 표현식을 사용하여 arrayOfInts 배열에 포함된 요소를 단계별로 탐색할 수 있습니다. 
		 각 인덱스 값에 대해 function.apply 메서드를 호출합니다. 
         이 메서드가 특정 인덱스 값에 대해 true 값을 반환하면 해당 인덱스 값에 포함된 요소를 출력합니다.
     */
    public void print(Function<Integer, Boolean> iterator) {
    	
    	for (int i=0; i<arrayOfInts.length; i++) {
    		if(iterator.apply(arrayOfInts[i]))
    			System.out.println(arrayOfInts[i]);
    	}
    }
    
    // You can define a method in DataStructure 
    // that creates and returns a new instance of EvenIterator.
    // DataStructure 클래스 외부에서 EvenIterator 인스턴스를 만들려고 할때,
    // 다음 메서드를 외부에서 사용할 수 있도록 하기 위해...
    public DataStructureIterator makeDataStructureIterator() {
    	DataStructureIterator iterator = this.new EvenIterator();
    	return iterator;
    }
    
    // JDK에서 지원하는 Integer 클래스가 있다
    // : Wrapper 클래스 -> 기본 데이터 타입을 특정 필드[value]에 저장하는 클래스
    //  private final int value;
	//  public interface Function<Integer, Boolean> {        
	//  	Boolean apply(Integer t);
	// }  
    public Boolean isEvenIndex(Integer index) {

    	/*
    	// intValue : 참조 변수
    	Integer instanceValue = 3; // 문법이 틀린 코드!!
    	//Integer instanceValue = Integer.valueOf(3); // new Integer(); AutoBoxing...
    	int value = instanceValue; // 문법이 틀린 코드!!
    	//int value = instanceValue.intValue();  // UnBoxing...
    	*/
    	
    	return arrayOfInts[index] % 2 == 0 ? true : false;
    }
    
    // Function<Integer, Boolean> evenIterator
    public boolean isOddIndex(int index) {
    	return arrayOfInts[index] % 2 != 0 ? true : false;
    }
     
    interface DataStructureIterator extends java.util.Iterator<Integer> { } 
 
    // Inner class implements the DataStructureIterator interface,
    // which extends the Iterator<Integer> interface
     
    // EvenIterator 클래스도 엄연한 DataStructure의 멤버!
    // 그런데 private으로 선언되어 있음.
    // Inner class를 다른 말로, Non-Static Nested Class라고 함!!
    private class EvenIterator implements DataStructureIterator {
         
        // Start stepping through the array from the beginning
        private int nextIndex = 0;
         
        public boolean hasNext() {
             
            // Check if the current element is the last in the array
            return (nextIndex <= SIZE - 1);
        }        
         
        public Integer next() {
             
            // Record a value of an even index of the array
            Integer retValue = Integer.valueOf(arrayOfInts[nextIndex]);
             
            // Get the next even element
            nextIndex += 2;
            return retValue;
        }
    }     
    
    // main 메서드도 DataStructure의 멤버이지만,
    // static 멤버!!!
    public static void main(String s[]) {
         
        // Fill the array with integer values and print out only
        // values of even indices
        DataStructure ds = new DataStructure();
//        ds.printEven();
//        
//        DataStructureIterator dsi = ds.makeDataStructureIterator();
//        ds.print(dsi);
        
        // main 메서드는 DataStructure 클래스 내부에 있는 멤버이기 때문에!!!
//        DataStructureIterator ei = ds.new EvenIterator();
//        ds.print(ei);
        
//        DataStructureIterator oddIterator = 
//        		
//        		new DataStructureIterator() {
//
//		        	// Start stepping through the array from the beginning
//		            private int nextIndex = 1;
//		             
//		            public boolean hasNext() {
//		                 
//		                // Check if the current element is the last in the array
//		                return (nextIndex <= SIZE - 1);
//		            }        
//		             
//		            public Integer next() {
//		                 
//		            	//int value = ds.arrayOfInts[0];
//		                // Record a value of an even index of the array
//		                Integer retValue = Integer.valueOf(ds.getElement(nextIndex)/*ds.arrayOfInts[nextIndex]*/);
//		                 
//		                // Get the next odd element
//		                nextIndex += 2;
//		                return retValue;
//		            }
//        	
//        };
        
        //ds.print(oddIterator);
        
//        Function<Integer, Boolean> evenIterator = (x) -> {
//        	boolean ret = (x % 2) == 0;
//        	return ret;
//        };
        
//        Function<Integer, Boolean> evenIterator = x -> (x % 2) == 0;
//        ds.print(evenIterator);
        
//        System.out.println("###########################################");
//        Function<Integer, Boolean> oddIterators = x -> (x % 2) != 0;
//        ds.print(oddIterators);
        
        // The target type of this expression must be a functional interface
//        ds.print(DataStructure::isEvenIndex);
//        ds.print(DataStructure::isOddIndex);
        // public Boolean isEvenIndex(Integer index)
        Function<Integer, Boolean> evenIteratorL = x -> (x % 2) == 0;
        Function<Integer, Boolean> evenIteratorM = ds::isEvenIndex;
        // Boolean apply(Integer t)
        
        for (int i=0; i<ds.arrayOfInts.length; i++) {
        	if(evenIteratorM.apply(ds.arrayOfInts[i]))
        		System.out.println(ds.arrayOfInts[i]);
        }
        
        Function<Integer, Boolean> oddIterators = ds::isEvenIndex;
        for (int i=0; i<ds.arrayOfInts.length; i++) {
        	if(oddIterators.apply(ds.arrayOfInts[i]))
        		System.out.println(ds.arrayOfInts[i]);
        }
        

        // non-static variable(private class EvenIterator) this cannot be referenced from
        // a static context(main 메서드)"
//        ds.print(new EvenIterator());
    }
}