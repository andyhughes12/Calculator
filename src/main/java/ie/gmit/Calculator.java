/*
Andrew Hughes
11/02/2021
g00345869@gmit.ie
* */

package ie.gmit;

public class Calculator {
    private int firstNum;
    private int secondNum;

    public Calculator(){
        this.firstNum = 0;
        this.secondNum = 0;
    }

    public Calculator(int firstNum, int secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    public int add(int num1, int num2){

        int result = num1 + num2;
        return result;
    }
}
