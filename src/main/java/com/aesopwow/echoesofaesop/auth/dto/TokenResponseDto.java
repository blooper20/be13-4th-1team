package com.aesopwow.echoesofaesop.auth.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class TokenResponseDto {
    private final String accessToken;

    private final String refreshToken;
}
