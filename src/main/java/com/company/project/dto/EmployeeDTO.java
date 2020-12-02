package com.company.project.dto;

import com.company.project.model.Employee;
import com.google.common.base.Converter;
import lombok.Data;
import org.springframework.beans.BeanUtils;

/**
 * @author wangtao
 * @date 2020/12/2 13:28
 * @desc
 */
@Data
public class EmployeeDTO {
    String first_name;
    String last_name;
    String gender;

    public Employee convertToEmployee() {
        EmplyeeDTOConvert emplyeeDTOConvert = new EmplyeeDTOConvert();
        Employee employee = emplyeeDTOConvert.convert(this);
        return employee;
    }

    public EmployeeDTO converFor(Employee employee) {
        EmplyeeDTOConvert emplyeeDTOConvert = new EmplyeeDTOConvert();
        EmployeeDTO employeeDTO = emplyeeDTOConvert.reverse().convert(employee);
        return employeeDTO;
    }

    private static class EmplyeeDTOConvert extends Converter<EmployeeDTO, Employee> {

        @Override
        protected Employee doForward(EmployeeDTO employeeDTO) {
            Employee employee = new Employee();
            BeanUtils.copyProperties(employeeDTO,employee);
            return employee;
        }

        @Override
        protected EmployeeDTO doBackward(Employee employee) {
            EmployeeDTO employeeDTO = new EmployeeDTO();
            BeanUtils.copyProperties(employee,employeeDTO);
            return employeeDTO;
        }
    }
}
