package Employeepay.GlobalManufacture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


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

}
