package com.hr.controller;

//import com.hr.enity.Employee;
import com.hr.service.EmployeeService;
import com.hr.enity.Employee;
import java.util.List;

//import com.hr.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
//import org.springframework.ui.Model;
//import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.WebDataBinder;
//import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/welcome")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public String goHome(){ 
       return "home";
    }
    
    
    @RequestMapping(value = {"/employees"}, method = RequestMethod.GET)
    public ModelAndView getEmployeesList(){ 
    	List<Employee> results = this.employeeService.findEmployees();
        ModelAndView model1 = new ModelAndView("/employees/list");
        model1.addObject("listemp", results);
        return model1;
    }
    
    @RequestMapping(value = "/employees/add", method = RequestMethod.GET)
    public ModelAndView addForm()
    {
        return new ModelAndView("employees/add", "employee", new Employee());
    }
    
    @RequestMapping(value = "/employees/save", method = RequestMethod.POST)
    public String processAdd(@ModelAttribute("employee")Employee employee, 
    	      BindingResult result, ModelMap model) {
         this.employeeService.saveEmployee(employee);
         return "redirect:/welcome/employees";
    }
    
    @RequestMapping(value = "/employees/edit/{empNo}", method = RequestMethod.GET)
    public String editForm(@PathVariable("empNo") long empNo, Model model){
    	Employee employee=this.employeeService.findEmployeeById(empNo); 
        model.addAttribute(employee);
        return "employees/edit";
    }

    @RequestMapping(value = "/employees/update",method = RequestMethod.POST)
    public String processUpdate(@ModelAttribute("employee")Employee employee, 
  	      BindingResult result, ModelMap model){
        this.employeeService.saveEmployee(employee);
        return "redirect:/welcome/employees";
    }
    
    @RequestMapping(value = "/employees/find/{empNo}", method = RequestMethod.GET)
    public String getEmployee(@PathVariable("empNo") long empNo, Model model){
    	Employee employee1=this.employeeService.findEmployeeById(empNo); 
        model.addAttribute(employee1);
        return "employees/find";
    }
    
//	@RequestMapping(value="/employees/delete/{empNo}")
//    public String removeEmployee(@PathVariable("empNo") long empNo) {
//		this.employeeService.deleteEmployee(empNo);
//		 return "redirect:/welcome/employees";
//  }
//  
}