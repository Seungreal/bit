package day02;
//숫자를 입력받아
//홀수,짝수를 출력하는 프로그램

import java.util.Scanner;
public class Ex13IfElse02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("숫자를 입력하세요: ");
        int number = scanner.nextInt();
        
        if(number%2==1) {
            System.out.println("홀수입니다.");
        }
        else {
            System.out.println("짝수입니다.");
        }
        
        scanner.close();

    }

}
