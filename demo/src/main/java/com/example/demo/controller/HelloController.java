package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.service.IStudentService;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/")
public class HelloController {

    @Autowired
    private IStudentService studentService;

    @GetMapping
    public String showStudentList(Model model) {
        model.addAttribute("students", studentService.findAll());
        return "home";
    }

    @GetMapping("/show-create-form")
    public String createForm(Model model) {
        model.addAttribute("student", new Student());
        return "create-form";
    }

    @PostMapping("/add-student")
    public String addStudent(@ModelAttribute("student") Student student, RedirectAttributes redirectAttributes) {
        studentService.addStudent(student);
        redirectAttributes.addFlashAttribute("msg", "Them moi thanh cong!");
        return "redirect:/";
    }
}
