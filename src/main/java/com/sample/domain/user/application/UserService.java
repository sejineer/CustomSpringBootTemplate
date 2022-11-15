package com.sample.domain.user.application;

import java.util.Optional;

import com.sample.global.DefaultAssert;
import com.sample.global.config.security.token.UserPrincipal;
import com.sample.domain.user.domain.User;
import com.sample.global.payload.ApiResponse;
import com.sample.domain.user.domain.repository.UserRepository;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;

    public ResponseEntity<?> readByUser(UserPrincipal userPrincipal){
        Optional<User> user = userRepository.findById(userPrincipal.getId());
        DefaultAssert.isOptionalPresent(user);
        ApiResponse apiResponse = ApiResponse.builder().check(true).information(user.get()).build();
        return ResponseEntity.ok(apiResponse);
    }
}
