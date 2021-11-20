package com.pingpong.user;

import lombok.Getter;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node("Major")
@Getter
public class MajorEntity {
    @Id
    @GeneratedValue
    private Long mid;

    private int mCode;

    private String majorName;

    public MajorEntity(int mCode) {
        this.majorName = MajorType.fromMCode(mCode).getMName();
    }
}
