package com.pingpong.user.dto;

import com.pingpong.user.MajorEntity;
import com.pingpong.user.UserEntity;
import com.pingpong.user.UserType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Set;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@ApiModel(value = "User 생성 요청")
public class UserSaveRequestDto {

    @ApiModelProperty(position = 1, required = true, value = "이")
    private String username;

    @ApiModelProperty(position = 2, required = true, value = "닉네임")
    private String nickname;

    @ApiModelProperty(position = 2, required = true, value = "패스워드")
    private String password;

    @ApiModelProperty(position = 3, required = true, value = "가입유형(STUDENT: 학생, ENTERPRISE: 기업)")
    private UserType userType;

    @ApiModelProperty(position = 4, required = true, value = "이메일")
    private String email;

    @ApiModelProperty(position = 5, required = true, value = "핸드폰 번호(01012345678)형식")
    private String phone;

    @ApiModelProperty(position = 6, required = true, value = "전공")
    private Set<Integer> majors;

    public UserEntity toEntity() {
        UserEntity user = UserEntity.builder()
            .username(username)
            .nickname(nickname)
            .userType(userType)
            .email(email)
            .phone(phone)
            .build();

        for (int mid : majors) {
            user.getMajors().add(new MajorEntity(mid));
        }

        return user;
    }
}
