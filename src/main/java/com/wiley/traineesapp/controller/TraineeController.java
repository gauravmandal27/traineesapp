package com.wiley.traineesapp.controller;

import com.wiley.traineesapp.dto.TraineeDto;
import com.wiley.traineesapp.model.Trainee;
import com.wiley.traineesapp.service.TraineeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TraineeController {

    @Autowired
    private TraineeService traineeService;

    @GetMapping("/")
    public String sayHello(){
        System.out.println("Hello Sir/Mam");
        return "index.jsp";
    }

//    @GetMapping("/add-trainee")
//    public String submitForm(@ModelAttribute Trainee trainee) {
//        System.out.println(trainee);
//        return "index.jsp";
//    }

    @PostMapping("/add-trainee")
    public String addTrainee(@ModelAttribute("trainee") Trainee trainee){
            TraineeDto traineeDto= traineeService.saveTrainee(new TraineeDto(0,trainee.getName(),trainee.getEmail(),trainee.getLocation()));
            trainee.setId(traineeDto.id());
        System.out.println("Trainee Added Successfully with ID: "+trainee.getId());
        return "view-trainee.jsp";
    }

//    @GetMapping("/view-all")
//    public String viewTrainees(@ModelAttribute("trainees") ArrayList<TraineeDto> trainees){
//        System.out.println("Getting all the trainees from the DB!!");
//        trainees=new ArrayList<TraineeDto>(traineeService.getAllTrainees());
//        for(TraineeDto tr:trainees){
//            System.out.println(tr);
//        }
//        return "view-trainees.jsp";
//    }
    @GetMapping("/view-all")
    public String viewTrainees(Model model){
        System.out.println("Getting all the trainees from the DB!!");
        List<TraineeDto> trainees= traineeService.getAllTrainees();
        for(TraineeDto tr: trainees){
            System.out.println(tr);
        }
        model.addAttribute("trainees",trainees);
        return "view-trainees.jsp";
    }

    @GetMapping("/search{id}")
    public String remove(@ModelAttribute("trainees") ArrayList<TraineeDto> trainees){
//        traineeService.deleteTrainee(id);
        return "view-trainees.jsp";
    }

    @GetMapping("/delete-trainee")
    public String deleteTrainee(@RequestParam("id") int id){
        traineeService.deleteTrainee(id);
        System.out.println("deleting "+id);
        return "view-all";
    }



}
