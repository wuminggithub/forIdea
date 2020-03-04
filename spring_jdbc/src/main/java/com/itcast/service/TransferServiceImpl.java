package com.itcast.service;

import com.itcast.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;

public class TransferServiceImpl implements TransferService {
    @Autowired
    private AccountDao accountDao;
    public void transferMoney() {
        accountDao.out();
    }
}
