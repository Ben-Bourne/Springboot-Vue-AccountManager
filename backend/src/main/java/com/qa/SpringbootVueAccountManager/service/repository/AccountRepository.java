package com.qa.SpringbootVueAccountManager.service.repository;

import com.qa.SpringbootVueAccountManager.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
}