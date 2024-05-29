package com.ayt.officeapi.entity;

import java.io.Serializable;

import lombok.Data;

@Data
public class WorksWithId implements Serializable {
    private Integer employeeId;  // Changed to Long to match the type in WorksWith
    private Integer clientId;  // Changed to Long to match the type in WorksWith
}
