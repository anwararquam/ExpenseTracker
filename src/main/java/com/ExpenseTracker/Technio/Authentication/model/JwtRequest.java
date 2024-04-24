package com.ExpenseTracker.Technio.Authentication.model;

import lombok.*;

import javax.lang.model.element.Name;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class JwtRequest {
    private String email;
    private String password;
}
