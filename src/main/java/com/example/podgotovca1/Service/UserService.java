package com.example.podgotovca1.Service;

import com.example.podgotovca1.Dto.UserDto;
import com.example.podgotovca1.Entity.Role;
import com.example.podgotovca1.Entity.User;
import com.example.podgotovca1.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public void registration(UserDto userDto){
        User user = new User();
        user.setName(userDto.getName());
        user.setPassword(passwordEncoder.encode(userDto.getPassword()));
        user.setRoles(Collections.singleton(Role.USER));
        userRepository.save(user);
    }
}
