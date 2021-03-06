package com.example.employeepayrollapp.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.validation.constraints.*;
import java.time.LocalDate;
import java.util.List;

@Data
public class EmployeePayrolDTO {
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$",message ="Employee firstname pattern is wrong")
    public String fName;
    @Min(value = 500, message = "Min salary should be more than 500")
    public int salary;
    @Pattern(regexp = "male|female",message = "Gender needs to be  male or female")
    public String gender;
    @JsonFormat(pattern = "dd MMM yyyy")
    @NotNull(message = "startdate should not be empty")
    public LocalDate startDate;
    @NotBlank(message = "Note cannot be empty")
    public String note;
    @NotBlank(message = "profilePic cannot be empty")
    public String profilePic;
    @NotNull(message = "department should not be empty")
    public List<String> department;
}
