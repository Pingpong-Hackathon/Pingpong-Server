package com.pingpong.user.controller;

import com.pingpong.common.ResponseMessage;
import com.pingpong.user.dto.UserLoginRequestDto;
import com.pingpong.user.dto.UserSaveRequestDto;
import com.pingpong.user.dto.UserSaveResponseDto;
import com.pingpong.user.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import javax.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(description = "사용자 관련 API", tags = "사용")
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    @ApiOperation(value = "사용자 생성")
    @ApiResponses(value = {
        @ApiResponse(code = 201, message = "사용자 성공")
    })
    public ResponseEntity<ResponseMessage<UserSaveResponseDto>> createUser(
        @RequestBody @Valid UserSaveRequestDto request) {
        return new ResponseEntity<>(ResponseMessage.response(HttpStatus.CREATED, userService.saveUser(request)),
            HttpStatus.CREATED);
    }
}
