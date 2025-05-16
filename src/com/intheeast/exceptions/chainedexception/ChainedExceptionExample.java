package com.intheeast.exceptions.chainedexception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ChainedExceptionExample {
    public static void main(String[] args) {
        try {
            processFile("input.txt");
        } catch (RuntimeException e) {
            System.err.println("최종 예외 발생: " + e);
            Throwable cause = e.getCause();
            while (cause != null) {
                System.err.println("원인: " + cause);
                cause = cause.getCause();
            }
        }
    }

    public static void processFile(String filePath) {
        try {
            String line = readFirstLine(filePath);
            int number = parseInteger(line);
            System.out.println("읽은 숫자: " + number);
        } catch (IOException e) {
            throw new RuntimeException("파일 처리 중 오류 발생", e);
        } catch (IllegalArgumentException e) {
            throw new RuntimeException("데이터 처리 중 오류 발생", e);
        }
    }

    public static String readFirstLine(String filePath) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line = br.readLine();
            if (line == null) {
                throw new IOException("파일이 비어있습니다.");
            }
            return line;
        }
    }

    public static int parseInteger(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            IllegalArgumentException wrapped = 
            		new IllegalArgumentException("숫자 변환 실패: [" + input + "]");
            wrapped.initCause(e);
            throw wrapped;
        }
    }
}