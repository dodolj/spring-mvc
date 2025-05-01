package web.controller;

import lombok.AllArgsConstructor;
import web.service.CarService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@AllArgsConstructor
public class CarsController {
    private final CarService carService;

    @GetMapping("/cars")
    public String showCars(
            @RequestParam(name = "count", defaultValue = "5") int count, Model model) {
        model.addAttribute("cars", carService.getCars(count));
        return "cars";
    }
}
