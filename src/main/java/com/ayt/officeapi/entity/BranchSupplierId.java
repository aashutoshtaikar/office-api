package com.ayt.officeapi.entity;

import lombok.Data;

@Data
public class BranchSupplierId implements Serializable {
    private int branchId;
    private String supplierName; 
}
