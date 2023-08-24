package com.valcos98.personalportfolio.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.valcos98.personalportfolio.models.Technologies;

import com.valcos98.personalportfolio.repositories.TechnologiesRepository;

@Controller
public class MasterController {
    @Autowired
    private TechnologiesRepository techRepo;

    @GetMapping("/")
    public String getAllCV(Model model){
        List<Technologies> allTechs = techRepo.findAll();
        model.addAttribute("techs", allTechs);
        return "front/full-cv";
    }

    @GetMapping("/edit")
    public String getEditPage(){
        
        return "back/edit-cv";
    }

    @PostMapping("/edit")
    public String postAllTheCVInfo(@RequestParam String techString){
        List<Technologies> listOfTechs = new ArrayList<>();
        String[] techsSplitted = techString.split("\\r\\n");
        for (String string : techsSplitted) {
            String[] singleTech = string.split(",");
            System.out.println(singleTech[1]);
            Integer years = Integer.valueOf(singleTech[1]);
            Technologies technology = new Technologies(singleTech[0],years);
            listOfTechs.add(technology);
        }
        techRepo.saveAll(listOfTechs);
        return "redirect:/edit";
    }
}
