package com.bootcamp.msSavingAccount.services;

import com.bootcamp.msSavingAccount.models.dto.CustomerDTO;
import reactor.core.publisher.Mono;

public interface ICustomerDTOService {
    public Mono<CustomerDTO> getCustomer(String customerIdentityNumber);
}
