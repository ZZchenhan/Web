package com.ch.service;

import com.ch.entity.AccountEntity;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86936
 * Date: 2017-08-15
 * Time: 14:45
 */
public interface AccountService {
    int insert(AccountEntity accountEntity);
    AccountEntity selectByName(String name);
}
