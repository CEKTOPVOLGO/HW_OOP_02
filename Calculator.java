public class Calculator {

    private int number1;
    private int number2;
    private char op;
    private double result;
    
    public Calculator(int number1, int number2, char op) {
        this.number1 = number1;
        this.number2 = number2;
        this.op = op;
        Calc(number1, number2, op);
    }
    
    public int getNumber1() {
        return number1;
    }
    public void setNumber1(int number1) {
        this.number1 = number1;
    }
    public int getNumber2() {
        return number2;
    }
    public void setNumber2(int number2) {
        this.number2 = number2;
    }
    public char getOp() {
        return op;
    }
    public void setOp(char op) {
        this.op = op;
    }

    public void Calc(int number1, int number2, char op){
        switch (op){
        case '-':
        result = number1 - number2;
        break;
        case '+':
        result = number1 + number2;
        break;
        case '*':
        result = number1 * number2;
        break;
        case '/':
        result = number1 * 1.0 / number2;
        }

    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
    


    
    
}
