package com.company.project.service;

import com.company.project.model.Client;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;

/**
 * @author wangtao
 * @date 2020/11/11 19:13
 * @desc
 */
public interface ClientService {
    void insertClient(Client client);

    HashMap<BigInteger,Client> queryClientAndCompany(int clientId);

    HashMap<BigInteger,Client> queryClientAndCompany2(int clientId);

    List<HashMap<BigInteger,Client>> queryClientAndCompany3();

    List<HashMap<BigInteger,Client>> queryClientAndCompany4();
}
