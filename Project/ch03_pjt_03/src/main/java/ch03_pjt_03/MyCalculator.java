package ch03_pjt_03;
public class MyCalculator {
    public void calculate(int fNum, int sNum, ICalculator calculator) {
    // ICalculator 객체주입
        int value = calculator.doOperation(fNum, sNum);  // 연산 실행 
        System.out.println("result : " + value);
    }
}