package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.dto.EmployeeDTO;
import com.company.project.model.Employee;
import com.company.project.model.User;
import com.company.project.service.EmployeeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangtao
 * @date 2020/12/2 13:32
 * @desc
 */
@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/insertEmployee")
    public Result insertEmployee(@RequestBody EmployeeDTO employeeDTO) {
        Employee employee = employeeDTO.convertToEmployee();
        employeeService.insertEmployee(employee);
        EmployeeDTO result = employeeDTO.converFor(employee);
        return ResultGenerator.genSuccessResult(result);
    }

}
