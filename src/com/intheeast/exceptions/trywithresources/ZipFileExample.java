package com.intheeast.exceptions.trywithresources;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

public class ZipFileExample {

    // 주어진 메서드
    public static void writeToFileZipFileContents(String zipFileName,
                                                  String outputFileName)
                                                  throws IOException {
        // Charset 설정 및 output 파일 Path 설정
        Path outputFilePath = Paths.get(outputFileName);

        // try-with-resources로 zip 파일과 output 파일 오픈
        try (
            ZipFile zf = new ZipFile(zipFileName);
            BufferedWriter writer = Files.newBufferedWriter(outputFilePath, StandardCharsets.US_ASCII)
        ) {
            // Zip 파일 내부 엔트리 나열
            Enumeration<? extends ZipEntry> entries = zf.entries();
            while (entries.hasMoreElements()) {
                ZipEntry entry = entries.nextElement();
                String newLine = System.getProperty("line.separator");
                String zipEntryName = entry.getName() + newLine;
                writer.write(zipEntryName, 0, zipEntryName.length());
            }
        }
    }

    public static void main(String[] args) {
        String zipFileName = "test.zip";
        String outputFileName = "zip_contents.txt";

        // 1. 테스트용 zip 파일 생성 (파일 2개 추가)
        try (FileOutputStream fos = new FileOutputStream(zipFileName);
             ZipOutputStream zos = new ZipOutputStream(fos)) {

            // 첫 번째 파일
            ZipEntry entry1 = new ZipEntry("folder/file1.txt");
            zos.putNextEntry(entry1);
            zos.write("File 1 contents".getBytes(StandardCharsets.UTF_8));
            zos.closeEntry();

            // 두 번째 파일
            ZipEntry entry2 = new ZipEntry("folder/file2.txt");
            zos.putNextEntry(entry2);
            zos.write("File 2 contents".getBytes(StandardCharsets.UTF_8));
            zos.closeEntry();

        } catch (IOException e) {
            System.err.println("ZIP 파일 생성 중 오류: " + e.getMessage());
            return;
        }

        // 2. zip 파일 내용을 outputFileName에 기록
        try {
            writeToFileZipFileContents(zipFileName, outputFileName);
        } catch (IOException e) {
            System.err.println("ZIP 파일 목록 기록 중 오류: " + e.getMessage());
            return;
        }

        // 3. 결과 파일 출력 확인
        System.out.println("ZIP 파일 목록이 " + outputFileName + " 파일에 기록되었습니다.");

        // 4. 기록된 파일 출력
        try {
            System.out.println("=== " + outputFileName + " 내용 ===");
            Files.lines(Paths.get(outputFileName), StandardCharsets.US_ASCII)
                 .forEach(System.out::println);
        } catch (IOException e) {
            System.err.println("결과 파일 읽기 중 오류: " + e.getMessage());
        }
    }
}