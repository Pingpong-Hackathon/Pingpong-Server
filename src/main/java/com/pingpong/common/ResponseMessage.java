package com.pingpong.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@Builder
public class ResponseMessage<T> {
    private HttpStatus status;
    private T data;

    public static <T> ResponseMessage<T> response(final HttpStatus status, final T t) {
        return ResponseMessage.<T>builder()
            .status(status)
            .data(t)
            .build();
    }
}
