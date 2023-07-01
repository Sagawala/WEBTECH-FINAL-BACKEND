package Sagawala.developer.EmployeesSystem.Controller;

import Sagawala.developer.EmployeesSystem.Entity.Employee;
import Sagawala.developer.EmployeesSystem.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@CrossOrigin(origins = "*",allowedHeaders = "*")
@Controller
@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeRepository eRepo;





    @PostMapping("/save")
    public Employee createEmployee(@RequestBody Employee employee){
        return eRepo.save(employee);
    }

    @GetMapping("/list")
public List<Employee> getEmployee(){
        return eRepo.findAll();
    }
@DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable Long id){
        Employee deleteEmployee=eRepo.findById(id).get();
        eRepo.delete(deleteEmployee);
        return "deleted";
}


@PutMapping("/update/{id}")
    public String updateEmployee(@PathVariable Long id,@RequestBody Employee employee){
        Employee updatedEmployee=eRepo.findById(id).get();
        updatedEmployee.setName(employee.getName());
        updatedEmployee.setEmail(employee.getEmail());
        updatedEmployee.setDepartment(employee.getDepartment());
        eRepo.save(updatedEmployee);
        return "updated";
}

@GetMapping("/getbyid/{id}")
    public Optional<Employee> getEmployee(@PathVariable Long id ){
        return eRepo.findById(id);
}


}
