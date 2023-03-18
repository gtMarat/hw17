package pro.sky.skyprospringdemo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.skyprospringdemo.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String helloInCalculator() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/plus")
    public String plus(
            @RequestParam(name = "num1",required = false) Integer num1,
            @RequestParam(name = "num2", required = false) Integer num2

    ) {
        if (num1 == null || num2 == null) {
            return " пустое значение , выражжение не верно";

        }
    return calculatorService.plus(num1,num2).toString();
    }
    @GetMapping("/minus")
    public String minus(
            @RequestParam(name = "num1",required = false) Integer num1,
            @RequestParam(name = "num2", required = false) Integer num2

    ) {
        if (num1 == null || num2 == null) {
            return " пустое значение , выражжение не верно";

        }

        return calculatorService.minus(num1,num2).toString();
    }
    @GetMapping("/multiply")
    public String multiply(
            @RequestParam(name = "num1",required = false) Integer num1,
            @RequestParam(name = "num2", required = false) Integer num2

    ) {
        if (num1 == null || num2 == null) {
            return " пустое значение , выражжение не верно";

        }
        return calculatorService.multiply(num1,num2).toString();
    }
    @GetMapping("/divide")
    public String divide(
            @RequestParam("num1") Integer num1,
            @RequestParam("num2") Integer num2

    ) {
        if (num2.equals(0)) {
            return " Деление на 0, передайте другое значение ";
        }
        return calculatorService.divide(num1,num2).toString();
    }
}
