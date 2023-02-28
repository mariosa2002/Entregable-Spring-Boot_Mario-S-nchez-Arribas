package com.example.CRUDSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping
public class StudentsController {
    @Autowired
    private StudentsInterfaceService service;
    @GetMapping("/list")
    public String list (Model model) {
        List<StudentsModel> students = service.list();
        model.addAttribute("students", students);
        return "Index";
    }
    @GetMapping("/add")
    public String add (Model model) {
        model.addAttribute("student", new StudentsModel());
        return "Form";
    }
    @PostMapping("/save")
    public String save (@Validated StudentsModel studentsModel, Model model) {
        service.save(studentsModel);
        return "redirect:/list";
    }
    @GetMapping("/edit/{idStudent}")
    public String edit (@PathVariable int idStudent, Model model) {
        Optional<StudentsModel> student = service.listById(idStudent);
        model.addAttribute("student", student);
        return "Form";
    }

    @GetMapping("/delete/{idStudent}")
    public String delete (@PathVariable int idStudent, Model model) {
        service.delete(idStudent);
        return "redirect:/list";
    }
}
