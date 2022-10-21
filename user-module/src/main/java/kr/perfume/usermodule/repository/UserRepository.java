package kr.perfume.usermodule.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import kr.perfume.usermodule.entity.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);
}
