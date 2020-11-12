package com.company.project.dao;

import com.company.project.model.Client;
import org.apache.ibatis.annotations.MapKey;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;

/**
 * @author wangtao
 * @date 2020/11/11 19:14
 * @desc
 */
public interface ClientMapper {
    void insertClient(Client client);

    HashMap<BigInteger,Client> queryClientAndCompany(int clientId);

    @MapKey("client_id")
    HashMap<BigInteger,Client> queryClientAndCompany2(int clientId);

    List<HashMap<BigInteger,Client>> queryClientAndCompany3();

    List<HashMap<BigInteger,Client>> queryClientAndCompany4();
}
