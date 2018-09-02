package com.qa.SpringbootVueAccountManager.service.business;

import com.qa.SpringbootVueAccountManager.domain.Account;

public interface AccountService {

    Iterable<Account> getAllAccounts();
    Account addAccount(Account account);
    Account updateAccount(Account account);
    String deleteAccount(Long id);
}
