package ie.atu.calculator;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class CalculatorController {
    @GetMapping("/calculator")
    public Calculator newCalculation(@RequestParam float num1, @RequestParam float num2, @RequestParam String operator){
        Calculator total = new Calculator(operator, 0);
        total.setOperator(operator);
        return total.calculation(num1, num2);
    }
}
