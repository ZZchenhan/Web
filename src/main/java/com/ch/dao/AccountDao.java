package com.ch.dao;

import com.ch.entity.AccountEntity;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86936
 * Date: 2017-08-15
 * Time: 14:44
 */
@Component
public interface AccountDao {
      AccountEntity selectByName(String name);
     int insertAccount(AccountEntity accountEntity);
}
