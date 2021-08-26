package com.bootcamp.msSavingAccount.services;

import com.bootcamp.msSavingAccount.models.dto.Credit;
import com.bootcamp.msSavingAccount.models.dto.Creditcard;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ICreditService {
    Mono<Boolean> validateDebtorCredit(String customerIdentityNumber);

    Flux<Credit> getCredit(String customerIdentityNumber);

    Mono<Creditcard> getCreditcard(String customerIdentityNumber);
}
