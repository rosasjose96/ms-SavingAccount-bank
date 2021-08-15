package com.bootcamp.msSavingAccount.services.Impl;

import com.bootcamp.msSavingAccount.models.dto.CustomerDTO;
import com.bootcamp.msSavingAccount.repositories.AccountRepository;
import com.bootcamp.msSavingAccount.services.ICustomerDTOService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.Map;

@Service
public class CustomerDTOServiceImpl implements ICustomerDTOService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerDTOServiceImpl.class);

    @Autowired
    private WebClient.Builder webClientBuilder;


    @Override
    public Mono<CustomerDTO> getCustomer(String customerIdentityNumber){
        Map<String, Object> params = new HashMap<String,Object>();
        LOGGER.info("initializing client query");
        params.put("customerIdentityNumber",customerIdentityNumber);
        return webClientBuilder
                .baseUrl("http://localhost:8081/customer")
                .build()
                .get()
                .uri("/findCustomerCredit/{customerIdentityNumber}",customerIdentityNumber)
                .accept(MediaType.APPLICATION_JSON)
                .exchangeToMono(clientResponse -> clientResponse.bodyToMono(CustomerDTO.class))
                .doOnNext(c -> LOGGER.info("Customer Response: Customer={}", c.getName()));
    }
}
