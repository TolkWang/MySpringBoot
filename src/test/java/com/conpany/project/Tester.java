package com.conpany.project;


import com.company.project.Application;
import com.company.project.core.ResultGenerator;
import com.company.project.dao.CompanyMapper;
import com.company.project.model.Client;
import com.company.project.model.Company;
import com.company.project.model.User;
import com.company.project.service.ClientService;
import com.company.project.service.CompanyService;
import com.company.project.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 单元测试继承该类即可
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class Tester {

    @Autowired
    CompanyService service;

    @Autowired
    UserService userService;

    @Autowired
    ClientService clientService;

    @Test
    public void test1() {

        HashMap<String,Object> map = new HashMap<>();
        map.put("companyName","pple");
        Integer[] ids = {1,2,3,4,5,6,21};
        map.put("CompanyIds",ids);
        map.put("CreateDate","2020-11-11");

        List<Company> companies = service.selectByMap(map);
        System.out.println(companies.toString());
        //companies.forEach(company -> System.out.println(company.getCompanyId()));
    }

    @Test
    public void test2() {
        User user = new User();
        user.setId(99);
        user.setUsername("dfg");
        userService.save(user);
    }

    @Test
    public void test3() {
        Client client = new Client();
        client.setClientName("小白");
        client.setClientAge(25);
        client.setClientDefaultPrice(new BigDecimal("99.98"));
        client.setCompanyId(BigInteger.valueOf(22));
        client.setDelete(true);
        clientService.insertClient(client);
    }




}



