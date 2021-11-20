package com.pingpong.user.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@ApiModel(value = "User 생성 요청")
public class UserLoginRequestDto {

    @ApiModelProperty(position = 1, required = true, value = "이메일")
    private String email;

    @ApiModelProperty(position = 2, required = true, value = "패스워드")
    private String password;
}
