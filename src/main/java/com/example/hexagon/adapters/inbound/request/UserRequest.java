package com.example.hexagon.adapters.inbound.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserRequest {

    private String name;
    private String email;
    private String cellphone;
    private String cep;
    private Integer houseNumber;
    private String permission;

}
