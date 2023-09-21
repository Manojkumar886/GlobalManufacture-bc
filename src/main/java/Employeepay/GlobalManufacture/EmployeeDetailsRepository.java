package Employeepay.GlobalManufacture;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//JPArepository<entityclassname,id datatype(wrapper)>
@Repository
public interface EmployeeDetailsRepository extends JpaRepository<EmployeeDetails,Integer>
{

}
