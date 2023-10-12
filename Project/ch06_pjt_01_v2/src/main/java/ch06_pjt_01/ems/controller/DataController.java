package ch06_pjt_01.ems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class DataController {

    @Autowired
    private Map<String, String> sampleData; 

    @GetMapping("/showData")
    public String showData(Model model) {
        model.addAttribute("data", sampleData);
        return "dataView";
    }
}