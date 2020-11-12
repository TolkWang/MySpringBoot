package com.company.project.service;

import com.company.project.model.Company;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;

/**
 * @author wangtao
 * @date 2020/11/11 14:07
 * @desc
 */
public interface CompanyService {
    void insertCompany(Company company);

    void batchInsertCompany(List<Company> companies);

    List<Company> selectByCompanyName(String companyName);

    List<String> selectByCompanyName2(String companyName);

    List<Company> selectByMap(HashMap<String,Object> map);

    void updateById(Company company);

    List<Company> selectByChoose(String companyName);
}
