package com.intheeast.exceptions.trywithresources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class FileReadExample {
	
    public static String readFirstLineFromFile(String path) throws IOException {
        
    	try (FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr)) {
            
    		// fr.close(); // 필수인데... 안 해도 됨 ->try with resource statement를 사용하기 때문에        
    		return br.readLine();
        }
    
    
    // try with resource를 안 쓸 경우
//    FileReader fr2 = null;
//    BufferedReader br2 = null;
//    try {
//    	fr2 = new FileReader(path);
//    	br2 = new BufferedReader(fr2);
//    	ret = br2.readLine();
//    } catch (IOException e) {
//    	System.out.println(e.getMessage());
//    } finally {
//    	fr2.close();
//    	br2.close();
//    }
//    return ret;
    
}    

    
//    public static void xxx(String[] args) {
//        String filePath = "example.txt";
//
//        // 1. 테스트용 파일 생성 (첫 줄 포함)
//        // FileWriter 컨스트럭터를 호출하면,
//        // Checked Exception[IOException]이 발생할 수 있는데,
//        // 왜 예외 처리 코드를 작성하지 않았니라고 컴파일 에러를 발생시킴!!!
//        FileWriter writer = new FileWriter(filePath);
//
//        
//    }
    
    public static void recursiveCall() {
    	recursiveCall();
    }

    public static void main(String[] args) {
    	
    	//recursiveCall();
    	
        String filePath = "example.txt";

        // 1. 테스트용 파일 생성 (첫 줄 포함)
        // try with resource도 catch를 쓰는게 정석!!
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write("이것이 첫 번째 줄입니다.\n");
            writer.write("이것은 두 번째 줄입니다.\n");
        } catch (IOException e) {
            System.err.println("파일 생성 중 오류: " + e.getMessage());
            return;
        }

        // 2. 첫 번째 줄 읽기 및 출력
        try {
            String firstLine = readFirstLineFromFile(filePath);
            System.out.println("파일의 첫 번째 줄: " + firstLine);
        } catch (IOException e) {
            System.err.println("파일 읽기 중 오류: " + e.getMessage());
        }
    }
}