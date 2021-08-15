package com.bootcamp.msSavingAccount.models.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerDTO {
    private String id;
    private String name;
    private String customerIdentityType;
    private String customerIdentityNumber;
}
