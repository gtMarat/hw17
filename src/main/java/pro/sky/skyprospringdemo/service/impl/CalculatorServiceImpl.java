package pro.sky.skyprospringdemo.service.impl;

import org.springframework.stereotype.Service;
import pro.sky.skyprospringdemo.service.CalculatorService;
@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public Integer plus(Integer num1, Integer num2) {
        return num1+num2;
    }
    public Integer minus(Integer num1, Integer num2) {
        return num1-num2;
    }
    public Integer multiply (Integer num1, Integer num2) {
        return num1*num2;
    }
    public Integer divide(Integer num1, Integer num2) {
        return num1/num2;
    }
}
