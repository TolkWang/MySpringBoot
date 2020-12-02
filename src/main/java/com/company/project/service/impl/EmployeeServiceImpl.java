package com.company.project.service.impl;

import com.company.project.dao.EmployeeMapper;
import com.company.project.model.Employee;
import com.company.project.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wangtao
 * @date 2020/12/2 13:33
 * @desc
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public void insertEmployee(Employee employee) {
        employeeMapper.insertEmployee(employee);
    }
}
