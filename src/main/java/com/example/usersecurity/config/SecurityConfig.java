package com.example.usersecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf().disable() // Отключаем CSRF для API
                .authorizeHttpRequests((requests) -> requests
                        .requestMatchers("/api/users").permitAll() // Разрешить доступ к /api/users без аутентификации
                        .anyRequest().authenticated() // Все остальные запросы требуют аутентификации
                );
        return http.build();
    }
}
