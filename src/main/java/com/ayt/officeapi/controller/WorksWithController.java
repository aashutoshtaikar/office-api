package com.ayt.officeapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ayt.officeapi.entity.WorksWith;
import com.ayt.officeapi.service.WorksWithService;

@RestController
public class WorksWithController {
    
    @Autowired
    private WorksWithService worksWithService;

    @GetMapping("/worksWith")
    public List<WorksWith> getAll() {
        return worksWithService.getAll();
    }
}
