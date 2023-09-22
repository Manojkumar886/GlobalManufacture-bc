package Employeepay.GlobalManufacture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

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

    public List<EmployeeDetails> viewall()
    {
        return (List<EmployeeDetails>) repo.findAll();
    }

    public String removing(int id)
    {
        EmployeeDetails temp=repo.findById(id).orElse(new EmployeeDetails());
        repo.delete(temp);
        return temp.getEmpUsername()+"has been deleted";
    }

    public Optional<EmployeeDetails> readone(int id)
    {
        return  repo.findById(id);
    }

}
