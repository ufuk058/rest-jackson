package com.restJackson.service.impl;

import com.restJackson.dto.AccountDTO;
import com.restJackson.repository.AccountRepository;
import com.restJackson.service.AccountService;
import com.restJackson.util.MapperUtil;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AccountServiceImpl implements AccountService {
    private final AccountRepository accountRepository;
    private final MapperUtil mapperUtil;

    public AccountServiceImpl(AccountRepository accountRepository, MapperUtil mapperUtil) {
        this.accountRepository = accountRepository;
        this.mapperUtil = mapperUtil;
    }


    @Override
    public List<AccountDTO> getAccounts() {
        return accountRepository.findAll().stream().map(account -> mapperUtil.convert(account, new AccountDTO())).collect(Collectors.toList());
    }
}
