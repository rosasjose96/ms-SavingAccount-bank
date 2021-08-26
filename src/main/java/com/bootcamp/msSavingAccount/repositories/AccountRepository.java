package com.bootcamp.msSavingAccount.repositories;

import com.bootcamp.msSavingAccount.models.entities.Account;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

/**
 * The interface Account repository.
 */
public interface AccountRepository extends ReactiveMongoRepository<Account, String> {
    /**
     * Find by customer identity number mono.
     *
     * @param customerIdentityNumber the customer identity number
     * @return the mono
     */
    Mono<Account> findByCustomerIdentityNumber(String customerIdentityNumber);

    /**
     * Find by account number mono.
     *
     * @param accountNumber the account number
     * @return the mono
     */
    public Mono<Account> findByAccountNumber(String accountNumber);
}
