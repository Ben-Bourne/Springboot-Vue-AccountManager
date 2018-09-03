package com.qa.SpringbootVueAccountManager.service.business;

import com.qa.SpringbootVueAccountManager.domain.Account;
import com.qa.SpringbootVueAccountManager.service.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService{

    @Autowired
    private AccountRepository repository;

    @Override
    public Iterable<Account> getAllAccounts() {

        return repository.findAll();
    }

    @Override
    public Optional<Account> findAccount(Long id) {

        return repository.findById(id);
    }

    @Override
    public Account addAccount(Account account) {
        repository.save(account);
        return account;
    }

    @Override
    public Account updateAccount(Account account) {
        repository.save(account);
        return account;
    }

    @Override
    public String deleteAccount(Long id) {
        repository.deleteById(id);
        return "Account deleted successfully";
    }
}
