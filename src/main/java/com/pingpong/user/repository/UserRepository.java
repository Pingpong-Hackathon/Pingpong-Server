package com.pingpong.user.repository;

import com.pingpong.user.UserEntity;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface UserRepository extends Neo4jRepository<UserEntity, Long> {

}
