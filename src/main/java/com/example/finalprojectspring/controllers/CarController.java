package com.example.finalprojectspring.controllers;

import com.example.finalprojectspring.exceptions.CarNotFoundException;
import com.example.finalprojectspring.models.Car;
import com.example.finalprojectspring.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/car")
public class CarController {
    @Autowired
    private CarService carService;

    @GetMapping
    public String showCarListPage(Model model, @ModelAttribute("message") String message,
                                     @ModelAttribute("messageType") String messageType) {
        model.addAttribute("cars", carService.findAllCars());
        return "car/list-car";
    }

   /** @GetMapping("/{id}")
    public String showCarViewPage(@PathVariable Long id, Model model, RedirectAttributes redirectAttributes) {
        try {
            model.addAttribute("car", carService.findCarById(id));
            return "car/view-car";
        } catch (CarNotFoundException e) {
            return handleException(redirectAttributes, e);
        }
    }

    @GetMapping("/delete/{id}")
    public String deleteCar(@PathVariable Long id, RedirectAttributes redirectAttributes) {
        try {
            carService.deleteCarById(id);
            redirectAttributes.addFlashAttribute("message", String.format("Car #%d deleted successfully!", id));
            redirectAttributes.addFlashAttribute("messageType", "success");
            return "redirect:/car";

          return handleException(redirectAttributes, e);
        }
    }

    //To show the create car form page
    @GetMapping("/create")
    public String showCreateCarPage(@ModelAttribute("car") Car car,
                                       @ModelAttribute("message") String message,
                                       @ModelAttribute("messageType") String messageType) {
        return "car/create-car";
    }

    // Called when we press submit button in the create-car form
    @PostMapping
    public String createCar(Car car, RedirectAttributes redirectAttributes) {
        try {
            Car searchCar = carService.findCarByModelName(car.getModelName());
            redirectAttributes.addFlashAttribute("message", String.format("Car(%s) already exists!", car.getModelName()));
            redirectAttributes.addFlashAttribute("messageType", "error");
            return "redirect:/car/create-car";
        } catch (CarNotFoundException e) {
            carService.addCar((car));
            redirectAttributes.addFlashAttribute("message", String.format("Car(%s) has been created successfully!", car.getModelName()));
            redirectAttributes.addFlashAttribute("messageType", "success");
            return "redirect:/car";
        }
    }

    @GetMapping("/update/{id}")
    public String showUpdateCarPage(@PathVariable Long id, RedirectAttributes redirectAttributes,
                                       @RequestParam(value="car", required=false) Car car,
                                       Model model) {
        if (car == null) {
            try {
                model.addAttribute("car", carService.findCarById(id));
            } catch (CarNotFoundException e) {
                return handleException(redirectAttributes, e);
            }
        }

        return "car/update-car";
    }

    @PostMapping("/update")
    public String updateCar(Car car, RedirectAttributes redirectAttributes) {
        try {
            carService.updateCar(car);
            redirectAttributes.addFlashAttribute("message", String.format("Car(id=%d) has been updated successfully!", car.getId()));
            redirectAttributes.addFlashAttribute("messageType", "success");
            return "redirect:/car";
        } catch (CarNotFoundException e) {
            return handleException(redirectAttributes, e);
        }
    }

    @GetMapping("/restore/{id}")
    public String restoreCar(@PathVariable Long id, RedirectAttributes redirectAttributes) {
        try {
            carService.restoreCarById(id);
            redirectAttributes.addFlashAttribute("message", String.format("Car #%d restored successfully!", id));
            redirectAttributes.addFlashAttribute("messageType", "success");
            return "redirect:/car";
        } catch (CarNotFoundException | CourseNotFoundException e) {
            return handleException(redirectAttributes, e);
        }
    }

    // PRIVATE METHODS //
    private String handleException(RedirectAttributes redirectAttributes, Exception e) {
        redirectAttributes.addFlashAttribute("message", e.getLocalizedMessage());
        redirectAttributes.addFlashAttribute("messageType", "error");
        return "redirect:/car";
    } */
}