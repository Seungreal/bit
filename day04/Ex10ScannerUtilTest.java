package day04;

import java.util.Scanner;

import util.ScannerUtil;
public class Ex10ScannerUtilTest {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        
        System.out.println("1. 곧장 nextLine() 실행하는 경우");
        System.out.print("이름: ");
        String name = ScannerUtil.nextLine(scanner);
        System.out.println("name: "+name);
        
        System.out.println("2. 숫자 입력후 nextLine() 실행하는 경우");
        System.out.print("숫자: ");
        int number = scanner.nextInt();
        System.out.print("이름: ");
        name = ScannerUtil.nextLine(scanner);
        System.out.println("number: "+number);
        System.out.println("name: "+name);
        
        System.out.println("int값 범위 제한 nextInt()");
        int korean = ScannerUtil.nextInt(scanner, "국어 점수:",0, 100);
        System.out.println("korean: "+korean);
        
        System.out.println("사용자 message를 출력하는 nextInt()");
        korean = ScannerUtil.nextInt(scanner, "국어: ",0,100);
        System.out.println("korean: "+korean);
        
        scanner.close();
    }
}
