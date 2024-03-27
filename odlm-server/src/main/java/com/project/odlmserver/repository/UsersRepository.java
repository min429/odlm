package com.project.odlmserver.repository;

import com.project.odlmserver.domain.STATE;
import com.project.odlmserver.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {

    Optional<Users> findByEmail(String email);

    @Query("UPDATE Users u SET u.state = :state")
    void updateState(STATE state);
}
