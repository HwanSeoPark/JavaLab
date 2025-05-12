package com.intheeast.controlflowstatements;

public class BreakWithLabelDemo {

	public static void main(String[] args) {

		// 이차원 배열
        int[][] arrayOfInts = { 
            { 32, 87, 3, 589 },
            { 12, 1076, 2000, 8 },
            { 622, 127, 77, 955 }
        };
        // arrayOfInts[][]
        // 1st [] : row(행) 인덱스
        // 2nd [] : column(열) 인덱스
        // arrayOfInts[1][3] = 8
        // arrayOfInts[0][0] = 32
        
        int searchfor = 12;

        int i;
        int j = 0;
        boolean foundIt = false;

    search: // <--Label (밞음은 레이블이지만 라벨이라 쓴다)
        // 중첩 : nested : 소프트웨어에서 많이 사용
        for (i = 0; i < arrayOfInts.length; i++) {
        	
        	for (j = 0; j < arrayOfInts[i].length; j++) {

            	int elementValue = arrayOfInts[i][j];
            	System.out.println(elementValue);
            	
                if (arrayOfInts[i][j] == searchfor) {
                    foundIt = true;
                    break search;
                    
                }
            }
        }

        if (foundIt) {
            System.out.println("Found " + searchfor + " at " + i + ", " + j);
        } else {
            System.out.println(searchfor + " not in the array");
        }
    }
}
