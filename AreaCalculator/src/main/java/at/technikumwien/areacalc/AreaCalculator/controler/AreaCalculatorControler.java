package at.technikumwien.areacalc.AreaCalculator.controler;

import at.technikumwien.areacalc.AreaCalculator.Service.AreaCalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AreaCalculatorControler {
    private final AreaCalculatorService areaCalculatorService;

    public AreaCalculatorControler(AreaCalculatorService areaCalculatorService){
        this.areaCalculatorService = areaCalculatorService;
    }

    @GetMapping(path = "/circle")
    public String calcCircleArea(@RequestParam(name = "value") double value){
        return String.valueOf(areaCalculatorService.calcCircleArea(value));
    }
}
