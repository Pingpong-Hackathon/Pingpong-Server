package com.pingpong.user.service;

import com.pingpong.user.UserEntity;
import com.pingpong.user.dto.UserLoginRequestDto;
import com.pingpong.user.dto.UserLoginResponseDto;
import com.pingpong.user.dto.UserSaveRequestDto;
import com.pingpong.user.dto.UserSaveResponseDto;
import com.pingpong.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public UserSaveResponseDto saveUser(UserSaveRequestDto request) {
        UserEntity newUser = userRepository.save(request.toEntity());
        return new UserSaveResponseDto(newUser);
    }
}
