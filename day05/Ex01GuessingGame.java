package day05;

import java.util.Random;
import java.util.Scanner;

import util.ScannerUtil;

//숫자 맞추기 게임을
//메소드로 분리해서 유지보수가 쉽게 만들어보자

public class Ex01GuessingGame {
    private final static int MAX = 100;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        showMenu(scan);
        scan.close();
    }
    
    //사용자가 입력한 숫자와 컴퓨터의 숫자를 비교해서
    //UP DOWN을 출력하는 메소드    
    private static void printResult(int userNumber,int computerNumber) {
        if(userNumber > computerNumber) {
            System.out.println("DOWN");
        }else if(userNumber < computerNumber) {
            System.out.println("UP");
        }
    }
    
    //사용자의 최고점수를 출력하는 메소드
    private static void printScore(int score) {
        if(score==0) {
            System.out.println("아직 플레이한 기록이 없습니다.");
        }else {
            System.out.printf("현재 최고 기록: %02d회\n",score);
        }
    }
    
    //현재점수와 최고점수를 비교해서 더 작은 숫자를
    //리턴해주는 setBestscore 메소드
    private static int setBestScore(int score,int bestScore) {
        if(bestScore==0) {
            System.out.println("맨 처음 플레이하셔서 최고기록을 달성하셨습니다.");
            return score;
        }
        if(score < bestScore) {
            System.out.println("신기록 달성!");
            return score;
        }else {
            return bestScore;
        }
    }
    
    //게임 플레이 기능
    //단 매번 끝날때마다 최고 점수를 return해서
    //메뉴 메소드에서 최고점수를 메번 갱신하게 한다.
    private static int play(Scanner scan, int bestScore) {
        Random random = new Random();
        int userNumber = ScannerUtil.nextInt(scan, "숫자: ", 1, MAX);
        int computerNumber = random.nextInt(MAX);
        int score = 1;
        
        while(userNumber != computerNumber) {
            printResult(userNumber, computerNumber);
            userNumber = ScannerUtil.nextInt(scan, "숫자: ", 1, MAX);
            score++;
        }
        System.out.println("정답!");
        System.out.printf("총 %d회만에 맞추셨습니다.\n",score);
        
        return setBestScore(score,bestScore);
    }
    
    private static void showMenu(Scanner scan) {
        int bestScore=0;
        
        while(true) {
            System.out.println("1.플레이 2.최고기록 보기 3.종료");
            int userChoice = ScannerUtil.nextInt(scan, ">", 1, 3);
            if(userChoice==1) {
                bestScore=play(scan, bestScore);
            }else if(userChoice==2) {
                printScore(bestScore);
            }
            else if(userChoice==3) {
                System.out.println("종료합니다.");
                break;
            }
        }
    }
}
