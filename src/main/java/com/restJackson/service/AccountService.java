package com.restJackson.service;

import com.restJackson.dto.AccountDTO;

import java.util.List;

public interface AccountService {

    List<AccountDTO> getAccounts();

}
