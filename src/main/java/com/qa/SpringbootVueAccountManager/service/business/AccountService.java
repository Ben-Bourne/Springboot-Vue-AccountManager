package com.qa.SpringbootVueAccountManager.service.business;

import com.qa.SpringbootVueAccountManager.domain.Account;

import java.util.Optional;

public interface AccountService {

    Iterable<Account> getAllAccounts();
    Optional<Account> findAccount(Long id);
    Account addAccount(Account account);
    Account updateAccount(Account account);
    String deleteAccount(Long id);
}
