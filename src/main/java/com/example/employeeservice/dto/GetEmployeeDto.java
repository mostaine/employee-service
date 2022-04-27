package com.example.employeeservice.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GetEmployeeDto {
    private String idEmployee;
    private String nomEmployee;
    private String prenomEmployee;
    private String email;
}
