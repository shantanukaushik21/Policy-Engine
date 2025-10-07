package com.PolicyEngine.demo.controller;

import com.PolicyEngine.demo.model.Policy;
import com.PolicyEngine.demo.repository.PolicyRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/policies")
public class PolicyController {

    private final PolicyRepository policyRepo;

    public PolicyController(PolicyRepository policyRepo) {
        this.policyRepo = policyRepo;
    }

    @GetMapping
    public List<Policy> getAllPolicies() {
        return policyRepo.findAll();
    }
}