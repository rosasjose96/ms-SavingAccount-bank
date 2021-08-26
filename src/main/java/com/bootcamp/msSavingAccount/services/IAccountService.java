package com.bootcamp.msSavingAccount.services;

import com.bootcamp.msSavingAccount.models.entities.Account;
import reactor.core.publisher.Mono;

/**
 * The interface Account service.
 */
public interface IAccountService extends ICRUDService<Account, String> {
    /**
     * Find by customer identity number mono.
     *
     * @param customerIdentityNumber the customer identity number
     * @return the mono
     */
    public Mono<Account> findByCustomerIdentityNumber(String customerIdentityNumber);

    /**
     * Validate customer identity number mono.
     *
     * @param customerIdentityNumber the customer identity number
     * @return the mono
     */
    Mono<Account> validateCustomerIdentityNumber(String customerIdentityNumber);

    /**
     * Find by account number mono.
     *
     * @param accountNumber the account number
     * @return the mono
     */
    Mono<Account> findByAccountNumber(String accountNumber);

}
