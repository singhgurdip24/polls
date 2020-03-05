package com.codesingh.polls.repository;

import com.codesingh.polls.model.Role;
import com.codesingh.polls.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRespository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}
