package ch03_pjt_03;
public class CalDiv implements ICalculator {
    public int doOperation(int firstNum, int secondNum) {
        return secondNum != 0 ? (firstNum / secondNum) : 0;
    }
}