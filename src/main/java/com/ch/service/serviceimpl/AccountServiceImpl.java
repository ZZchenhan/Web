package com.ch.service.serviceimpl;

import com.ch.dao.AccountDao;
import com.ch.entity.AccountEntity;
import com.ch.service.AccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86936
 * Date: 2017-08-15
 * Time: 14:46
 */
@Service
public class AccountServiceImpl implements AccountService{
    @Resource
    AccountDao userDao;

    public int insert(AccountEntity accountEntity) {
        return userDao.insertAccount(accountEntity);
    }

    public AccountEntity selectByName(String name) {
        return userDao.selectByName(name);
    }
}
