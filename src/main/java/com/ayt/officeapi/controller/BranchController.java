package com.ayt.officeapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ayt.officeapi.entity.Branch;
import com.ayt.officeapi.service.BranchService;

@RestController
public class BranchController {

    @Autowired
    private BranchService branchService;
   
    @GetMapping("/branches")
    public List<Branch> getBranches() {
        return branchService.getBranches();
    }
}
