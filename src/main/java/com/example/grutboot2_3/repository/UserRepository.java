package com.example.grutboot2_3.repository;

import com.example.grutboot2_3.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
