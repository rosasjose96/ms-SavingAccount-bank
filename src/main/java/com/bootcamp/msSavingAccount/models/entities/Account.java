package com.bootcamp.msSavingAccount.models.entities;

import com.bootcamp.msSavingAccount.models.dto.CustomerDTO;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

/**
 * The type Account.
 */
@Document(collection = "accountsaving")
@Setter
@Getter
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
@NoArgsConstructor
public class Account {

    @Id
    private String id;

    private String typeOfAccount;

    @Indexed(unique=true)
    private String accountNumber;

    private double amount;

    private int maxLimitMovementPerMonth;

    private double commission;

    private int movementPerMonth;

    private String customerIdentityNumber;

    private double minAmountAveragePerMonth;

    private double amountAveragePerMonth;

    private CustomerDTO customer;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime dateOperation = LocalDateTime.now();
}
