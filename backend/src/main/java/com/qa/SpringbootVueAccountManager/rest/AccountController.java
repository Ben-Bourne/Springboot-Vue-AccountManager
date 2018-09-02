package com.qa.SpringbootVueAccountManager.rest;

import com.qa.SpringbootVueAccountManager.domain.Account;
import com.qa.SpringbootVueAccountManager.service.business.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping(value="/api")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping(value="/add", method= RequestMethod.POST)
    public @ResponseBody Account addAccount (@RequestBody Account account) {
        return accountService.addAccount(account);
    }

    @RequestMapping(value="/getall", method=RequestMethod.GET)
    public @ResponseBody Iterable<Account> getAllAccounts() {

        return accountService.getAllAccounts();
    }

    @RequestMapping(value="/delete/{id}", method= RequestMethod.DELETE)
    public @ResponseBody String deleteAccount (@PathVariable long id) {

        return accountService.deleteAccount(id);
    }

    @RequestMapping(value="/update", method= RequestMethod.PUT)
    public @ResponseBody Account updateAccount (@RequestBody Account account) {
        return accountService.updateAccount(account);
    }
}