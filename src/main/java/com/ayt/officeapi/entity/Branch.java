package com.ayt.officeapi.entity;


import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "branch")
@Data
public class Branch {
    @Id
    @Column(name = "branch_id")
    private Integer branchId;

    @Column(name = "branch_name", length = 40)
    private String branchName;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "mgr_id", referencedColumnName = "emp_id")
    private Employee manager;

    @OneToMany(mappedBy = "branch")
    @JsonManagedReference
    private List<Employee> employees;

    @Column(name = "mgr_start_date")
    private Date mgrStartDate;
}
