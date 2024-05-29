package com.ayt.officeapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ayt.officeapi.entity.WorksWith;
import com.ayt.officeapi.entity.WorksWithId;

public interface WorksWithRepo extends JpaRepository<WorksWith, WorksWithId> {
    
}
