package com.company.project.dao;

import com.company.project.model.Company;
import org.apache.ibatis.annotations.Param;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;

/**
 * @author wangtao
 * @date 2020/11/11 14:04
 * @desc
 */
public interface CompanyMapper {
    void insertCompany(Company company);

    void batchInsertCompany(List<Company> companies);

    List<Company> selectByCompanyName(@Param("companyName")String companyName);

    List<String> selectByCompanyName2(@Param("companyName")String companyName);

    List<Company> selectByMap(@Param("selectMap")HashMap<String,Object> map);

    void updateById(Company company);

    List<Company> selectByChoose(@Param("companyName")String companyName);
}
