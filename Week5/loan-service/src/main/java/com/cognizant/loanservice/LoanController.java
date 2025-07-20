package com.cognizant.loanservice; // adjust package if needed

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/loans")
public class LoanController {

    @GetMapping("/{number}")
    public Map<String, Object> getLoan(@PathVariable String number) {
        return Map.of(
            "number", number,
            "type", "car",
            "loan", 1400000,
            "emi", 32358,
            "tenure", 18
        );
    }
}
