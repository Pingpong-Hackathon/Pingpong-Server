package com.pingpong;

import com.pingpong.user.MajorEntity;
import com.pingpong.user.UserEntity;
import com.pingpong.user.UserType;
import com.pingpong.user.repository.UserRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class UserCreateTest {
    private final UserRepository userRepository;
    public UserCreateTest(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Test
    @DisplayName("사용자 생성 테스트")
    void createUser() {
        UserEntity user = UserEntity.builder()
            .username("홍길동")
            .email("hong@inu.ac.kr")
            .userType(UserType.STUDENT)
            .nickname("길동")
            .phone("2342358123")
            .build();


        userRepository.save(user);
    }
}
