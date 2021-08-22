package com.bootcamp.msSavingAccount.services;

import com.bootcamp.msSavingAccount.models.dto.Customer;
import com.bootcamp.msSavingAccount.models.dto.CustomerDTO;
import reactor.core.publisher.Mono;

/**
 * The interface Customer dto service.
 */
public interface ICustomerDTOService {
    /**
     * Gets customer.
     *
     * @param customerIdentityNumber the customer identity number
     * @return the customer
     */
    public Mono<Customer> getCustomer(String customerIdentityNumber);
}
