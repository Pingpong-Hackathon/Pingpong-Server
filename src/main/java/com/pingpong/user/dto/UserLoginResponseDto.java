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
@ApiModel(value = "User 생성 응답")
public class UserLoginResponseDto {
    @ApiModelProperty(position = 1, required = true, value = "사용자 고유 번호")
    private Long uid;

    @ApiModelProperty(position = 2, required = true, value = "이름")
    private String username;

    @ApiModelProperty(position = 3, required = true, value = "닉네임")
    private String nickname;

    @ApiModelProperty(position = 4, required = true, value = "가입유형(STUDENT: 학생, ENTERPRISE: 기업)")
    private UserType userType;

    @ApiModelProperty(position = 5, required = true, value = "이메일")
    private String email;

    @ApiModelProperty(position = 6, required = true, value = "핸드폰 번호(01012345678)형식")
    private String phone;

    @ApiModelProperty(position = 7, required = true, value = "전공")
    private Set<MajorEntity> major;

    public UserLoginResponseDto (UserEntity userEntity) {
        this.uid = userEntity.getUid();
        this.username = userEntity.getUsername();
        this.nickname = userEntity.getNickname();
        this.userType = userEntity.getUserType();
        this.email = userEntity.getEmail();
        this.phone = userEntity.getPhone();
        this.major = userEntity.getMajors();
    }
}
