public class CalcStringParser {
    private String string;
    private int num1;
    private int num2;
    private char op;

    public CalcStringParser(String string) {
        this.string = string;
        Parsing(string);
    }

    private void Parsing (String string){
        String[] words = string.split(" ");
        num1 = Integer.parseInt(words[0]);
        num2 = Integer.parseInt(words[2]);
        op = words[1].charAt(0);
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public char getOp() {
        return op;
    }

    public void setOp(char op) {
        this.op = op;
    }
    
    
    
}
