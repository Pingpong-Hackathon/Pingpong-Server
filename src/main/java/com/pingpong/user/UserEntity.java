package com.pingpong.user;

import java.util.HashSet;
import java.util.Set;
import lombok.Builder;
import lombok.Getter;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

@Node("User")
@Getter
public class UserEntity {

    @Id
    @GeneratedValue
    private Long uid;

    private final String username;

    private final String nickname;

    private final UserType userType;

    private final String email;

    private final String phone;

    private Boolean isWithdraw = false;

    @Relationship(type = "MAJOR_IN")
    private Set<MajorEntity> majors = new HashSet<>();

    public Set<MajorEntity> getMajors() {
        return majors;
    }

    public void setMajors(Set<MajorEntity> majors) {
        this.majors = majors;
    }

    @Builder
    public UserEntity(String username, String nickname, UserType userType, String email, String phone) {
        this.username = username;
        this.nickname = nickname;
        this.userType = userType;
        this.email = email;
        this.phone = phone;
    }
}
