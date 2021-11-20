package com.pingpong.user;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum MajorType {
    COMPUTER_SCIENCE(1, "컴퓨터 공학부");

    private final int mCode;
    private final String mName;

    public static MajorType fromMCode(int mCode) {
        for (MajorType majorType : values()) {
            if (majorType.getMCode() == mCode) {
                return majorType;
            }
        }
        throw new IllegalArgumentException();
    }
}
