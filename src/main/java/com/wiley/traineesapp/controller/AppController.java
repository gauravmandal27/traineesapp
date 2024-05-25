package com.wiley.traineesapp.controller;

import com.wiley.traineesapp.model.Trainee;
import com.wiley.traineesapp.repository.TraineeRepository;
import com.wiley.traineesapp.repository.TraineeRepositoryImpl;
import com.wiley.traineesapp.service.TraineeService;
import com.wiley.traineesapp.service.TraineeServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {
//    TraineeService repo = new TraineeServiceImpl(new TraineeRepositoryImpl());
//    @GetMapping("/")
//    public String sayHello(){
//        System.out.println("Hello Sir/Mam");
//        return "index.jsp";
//    }


//
//    @GetMapping("/user")
//    public String getUser(Model model){
////        Trainee user = new Trainee("Harsh","harsh@yahoo,com");
//        Trainee trainee = new Trainee();
//        trainee.setName("Gaurav");
//        trainee.setId(123);
//        trainee.setEmail("gaurav@gmail.com");
//        trainee.setLocation("Hyderabad");
//        model.addAttribute("trainee",trainee);
//        System.out.println(trainee.getName());
////        System.out.println(trainee.name());
//
//        return "show-user.jsp";
//    }
//    @GetMapping("/add-trainee")
//    public String getUser(Model model){
//        Trainee trainee = new Trainee();
//        trainee.setName("Gaurav");
//        trainee.setId(123);
//        trainee.setEmail("gaurav@gmail.com");
//        trainee.setLocation("Hyderabad");
//        model.addAttribute("trainee",trainee);
//        System.out.println(trainee.getName());
//
//        return "show-user.jsp";
//    }
//    @GetMapping("/")
//    public String home(){
//        return "index.jsp";
//    }


//    @PostMapping("/user")
//    public ModelAndView addUser(HttpServletRequest request){
//        String username = request.getParameter("username");
//        String email = request.getParameter("email");
//        User user = new User(username,email);
//        ModelAndView mv = new ModelAndView("show-user.jsp");
//        mv.addObject("user",user);
//        return mv;
//    }

//    @PostMapping("/user")
//    public ModelAndView addUser(@RequestParam("username") String username,
//                                @RequestParam("email") String email){
//        User user = new User(username,email);
//        ModelAndView mv = new ModelAndView("show-user.jsp");
//        mv.addObject("user",user);
//        return mv;
//    }




}
