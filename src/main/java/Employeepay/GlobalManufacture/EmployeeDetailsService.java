package Employeepay.GlobalManufacture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeDetailsService
{
    @Autowired// object creation
    EmployeeDetailsRepository repo;//repo name is object name(used defined name)

    public EmployeeDetails create(EmployeeDetails emp)
    {
        return  repo.save(emp);
//        jparepository is give to more than method.save method is used to stored
//        a set of values in database.
    }

}
