package com.intheeast.exceptions.trywithresources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadFinallyExample {

    // finally 블록으로 close 처리하는 메서드
    static String readFirstLineFromFileWithFinallyBlock(String path) throws IOException {
        FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr);
        try {
            return br.readLine();
        } finally {
            // 리소스 해제는 finally에서 반드시 수행
            br.close();
            fr.close();
        }
    }

    public static void main(String[] args) {
        String filePath = "example_finally.txt";

        // 1. 테스트용 파일 생성 (첫 줄 포함)
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write("첫 번째 줄입니다.\n");
            writer.write("두 번째 줄입니다.\n");
        } catch (IOException e) {
            System.err.println("파일 쓰기 중 오류: " + e.getMessage());
            return;
        }

        // 2. 파일의 첫 번째 줄 읽기 및 출력 (finally 블록 사용한 메서드)
        try {
            String firstLine = readFirstLineFromFileWithFinallyBlock(filePath);
            System.out.println("파일의 첫 번째 줄: " + firstLine);
        } catch (IOException e) {
            System.err.println("파일 읽기 중 오류: " + e.getMessage());
        }
    }
}