package com.company.project.model;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;

import java.sql.Date;

/**
 * @author wangtao
 * @date 2020/12/2 13:24
 * @desc
 */
@Data
@Accessors(chain = true)
@RequiredArgsConstructor(staticName = "of")
public class Employee {
    Integer emp_no;
    Date birth_date;
    @NonNull
    String first_name;
    @NonNull
    String last_name;
    String gender;
    Date hire_date;
}
