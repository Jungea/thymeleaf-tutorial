package com.example.playgroundjung.thymeleaftutorial.controller;

import com.example.playgroundjung.thymeleaftutorial.domain.Gender;
import com.example.playgroundjung.thymeleaftutorial.dto.SignUpForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/signUp")
    public String signUpForm(Model model, SignUpForm signUpForm) {
        signUpForm.setFirstName("길동");
        signUpForm.setLastName("홍");
        signUpForm.setPolicyAgree(true);
        signUpForm.setGender(Gender.X);
        signUpForm.setPhoneNumber1("011");

        model.addAttribute("allGenders", Gender.values());

        ArrayList<String> allPhoneNumber1s = new ArrayList<>();
        allPhoneNumber1s.add("000");
        allPhoneNumber1s.add("010");
        allPhoneNumber1s.add("011");
        allPhoneNumber1s.add("070");
        model.addAttribute("allPhoneNumber1s", allPhoneNumber1s);

        return "/signUpForm";
    }
}
