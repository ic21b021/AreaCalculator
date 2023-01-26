package at.technikumwien.areacalc.AreaCalculator.Service;

import org.springframework.stereotype.Service;

@Service
public class AreaCalculatorService {

    public double calcCircleArea(double radius){
        return Math.PI * Math.sqrt(radius);
    }
}
