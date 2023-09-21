package Employeepay.GlobalManufacture;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDetails
{
    @Id//primary Key
    @GeneratedValue(strategy = GenerationType.AUTO)//Auto Increment
    private int empId;
    private String empName;
    private String empUsername;
//    @Nullable- this field not need any value(null)
    private String empPassword;
    private String empDesignation;
    private String empExperience;
    @Column(name = "AnnualIncome")// alius name(as) column name will be changed
    private String empSalary;
}
