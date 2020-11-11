package com.company.project.service.impl;

import com.company.project.dao.ClientMapper;
import com.company.project.model.Client;
import com.company.project.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wangtao
 * @date 2020/11/11 19:13
 * @desc
 */
@Service
public class ClientServiceImpl implements ClientService {
    @Autowired
    private ClientMapper clientMapper;

    @Override
    public void insertClient(Client client) {
        clientMapper.insertClient(client);
    }
}
