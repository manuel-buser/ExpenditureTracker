package com.ExpenditureTracker.ExpenditureTracker.controller;

import com.ExpenditureTracker.ExpenditureTracker.model.ExpenditureModel;
import com.ExpenditureTracker.ExpenditureTracker.service.ExpenditureService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/expenditure")
public class ExpenditureController {

    private final ExpenditureService expenditureService;

    public ExpenditureController(ExpenditureService expenditureService) {
        this.expenditureService = expenditureService;
    }

    // 1. Show the "Add Expenditure" form
    @GetMapping("/new")
    public String showAddExpenditureForm(Model model) {
        model.addAttribute("expenditureForm", new ExpenditureModel());
        return "add_expenditure"; // Thymeleaf template
    }

    // 2. Handle form submission
    @PostMapping
    public String addExpenditure(@ModelAttribute("expenditureForm") ExpenditureModel expenditure) {
        expenditureService.saveExpenditure(expenditure);
        return "redirect:/expenditure/list";
    }

    // 3. Show a list of all expenditures
    @GetMapping("/list")
    public String listExpenditures(Model model) {
        model.addAttribute("expenditures", expenditureService.getAllExpenditures());
        return "list_expenditures"; // Thymeleaf template
    }
}
