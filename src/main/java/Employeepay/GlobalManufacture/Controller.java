package Employeepay.GlobalManufacture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class Controller
{
    @Autowired
    EmployeeDetailsService serv;

//    http://localhost:8081
//url mapping-post(Create),put(update),get(read,list),delete(Delete)

    @PostMapping("/create")//http://localhost:8081/create
    public String Creation(@RequestBody EmployeeDetails emp)
//            @Request body is used to set of values return in frontend
    {
        return  serv.create(emp).getEmpName()+" has been added in my oracle database";
    }

    @GetMapping("/")
    public List<EmployeeDetails>  listall()
    {
        return (List<EmployeeDetails>) serv.viewall();
    }

    @PutMapping("/update")
    public String updating(@RequestBody EmployeeDetails emp)
    {
        return serv.create(emp).getEmpName()+" has been updated successfully";
    }

    @DeleteMapping("/deleteone/{id}")
    public String deleting(@PathVariable("id")int id)
    {
        return  serv.removing(id)+"";
    }

    @GetMapping("/readone/{empid}")
    public Optional<EmployeeDetails> showone(@PathVariable("empid")int empid)
    {
        return serv.readone(empid);
    }
}
