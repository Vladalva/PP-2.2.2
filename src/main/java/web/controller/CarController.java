package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import web.Service.CarService;



@Controller
@RequestMapping("/cars")
public class CarController {

    private CarService carService;
    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @RequestMapping()
    public String countCar(@RequestParam(value = "count", required = false) Integer count,
            Model model){
        model.addAttribute("cars", carService.countCar(count));
        return "Cars";
    }

}
