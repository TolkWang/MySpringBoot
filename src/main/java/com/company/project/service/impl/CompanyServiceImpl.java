package com.company.project.service.impl;

import com.company.project.dao.CompanyMapper;
import com.company.project.model.Company;
import com.company.project.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;

/**
 * @author wangtao
 * @date 2020/11/11 14:08
 * @desc
 */
@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyMapper companyMapper;

    @Override
    public void insertCompany(Company company) {
        companyMapper.insertCompany(company);
    }

    @Override
    public void batchInsertCompany(List<Company> companies) {
        companyMapper.batchInsertCompany(companies);
    }

    @Override
    public List<Company> selectByCompanyName(String companyName) {
        return companyMapper.selectByCompanyName(companyName);
    }

    @Override
    public List<String> selectByCompanyName2(String companyName) {
        return companyMapper.selectByCompanyName2(companyName);
    }

    @Override
    public List<Company> selectByMap(HashMap<String, Object> map) {
        return companyMapper.selectByMap(map);
    }

    @Override
    public void updateById(Company company) {
        companyMapper.updateById(company);
    }

    @Override
    public List<Company> selectByChoose(String companyName) {
        return companyMapper.selectByChoose(companyName);
    }
}
