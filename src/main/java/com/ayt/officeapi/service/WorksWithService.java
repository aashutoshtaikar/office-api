package com.ayt.officeapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ayt.officeapi.dao.WorksWithRepo;
import com.ayt.officeapi.entity.WorksWith;

@Service
public class WorksWithService {
    
    @Autowired
    private WorksWithRepo worksWithRepo;
    
    public List<WorksWith> getAll() {
        return worksWithRepo.findAll();
    }
}
