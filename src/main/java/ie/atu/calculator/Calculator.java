package ie.atu.calculator;

public class Calculator {
    private String operator;
    private float answer;

    public Calculator(String operator, float answer) {
        this.operator = operator;
        this.answer = answer;
    }

    public void setOperator(String operator) {this.operator = operator;}

    public Calculator calculation(float num1, float num2){
        switch(operator){
            case "add": this.answer = num1 + num2; break;
            case " subtract": this.answer = num1 - num2; break;
            case "multiply": this.answer = num1 * num2; break;
            case "divide": this.answer = num1 / num2; break;
            default: this.operator = "Invalid operator"; this .answer = 0; break;
        }
        return new Calculator(this.operator, this.answer);
    }
}
