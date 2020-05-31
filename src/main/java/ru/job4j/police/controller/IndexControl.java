package ru.job4j.police.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.job4j.police.repository.AccidentMem;

@Controller
public class IndexControl {
    @Autowired
    AccidentMem store;
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("accidents", store.getAll());
        return "index";
    }
}