package com.company.project.service.impl;

import com.company.project.dao.ClientMapper;
import com.company.project.model.Client;
import com.company.project.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;

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

    @Override
    public HashMap<BigInteger,Client> queryClientAndCompany(int clientId) {
        return clientMapper.queryClientAndCompany(clientId);
    }

    @Override
    public HashMap<BigInteger, Client> queryClientAndCompany2(int clientId) {
        return clientMapper.queryClientAndCompany2(clientId);
    }

    @Override
    public List<HashMap<BigInteger, Client>> queryClientAndCompany3() {
        return clientMapper.queryClientAndCompany3();
    }

    @Override
    public List<HashMap<BigInteger, Client>> queryClientAndCompany4() {
        return clientMapper.queryClientAndCompany4();
    }
}
