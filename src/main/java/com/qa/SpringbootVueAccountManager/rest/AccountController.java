package com.qa.SpringbootVueAccountManager.rest;

import com.qa.SpringbootVueAccountManager.constants.Constants;
import com.qa.SpringbootVueAccountManager.domain.Account;
import com.qa.SpringbootVueAccountManager.service.business.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping(value="/api")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping(value= Constants.ADD, method= RequestMethod.POST)
    public @ResponseBody Account addAccount (@RequestBody Account account) {
        return accountService.addAccount(account);
    }

    @RequestMapping(value= Constants.GETALL, method=RequestMethod.GET)
    public @ResponseBody Iterable<Account> getAllAccounts() {

        return accountService.getAllAccounts();
    }

    @RequestMapping(value= Constants.GET, method=RequestMethod.GET)
    public @ResponseBody
    Optional<Account> findAccount(@PathVariable long id) {

        return accountService.findAccount(id);
    }

    @RequestMapping(value= Constants.DELETE, method= RequestMethod.DELETE)
    public @ResponseBody String deleteAccount (@PathVariable long id) {

        return accountService.deleteAccount(id);
    }

    @RequestMapping(value= Constants.UPDATE, method= RequestMethod.PUT)
    public @ResponseBody Account updateAccount (@RequestBody Account account) {
        return accountService.updateAccount(account);
    }
}