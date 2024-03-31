package com.sir.richard.boss.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.logout.HeaderWriterLogoutHandler;
import org.springframework.security.web.header.writers.ClearSiteDataHeaderWriter;

import static org.springframework.security.web.header.writers.ClearSiteDataHeaderWriter.Directive.*;

@Slf4j
@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    protected void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        log.info("filterChain: {}", http);


        http
                .authorizeHttpRequests((requests) -> requests
                        .requestMatchers("/", "/ajax").permitAll()
                        .requestMatchers("/", "/error*").permitAll()
                        .requestMatchers("/", "/errors*").permitAll()
                        .requestMatchers("/", "/resources/**").permitAll()
                        .requestMatchers("/", "/anonymous/**").anonymous()
                        .requestMatchers("/login*","/invalid-session*", "/session-expired*", "/index-logout*").permitAll()
                        .anyRequest().authenticated()
                )
                .formLogin((form) -> form
                        .loginPage("/login")
                        .permitAll()
                )
                .logout((logout) -> logout.permitAll());

        return http.build();
        /*
        http
                //.csrf().disable()
                .authorizeRequests()
                //.antMatchers("/hello/*").permitAll()
                //.antMatchers("/main/*").permitAll()
                //.antMatchers("/orders/*").permitAll()
                //.antMatchers("/wiki/*").permitAll()
                .antMatchers("/ajax/*").permitAll()
                .antMatchers("/error*").permitAll()
                .antMatchers("/errors*").permitAll()
                .antMatchers("/", "/resources/**").permitAll()
                .antMatchers("/anonymous*").anonymous()
                .antMatchers("/login*","/invalid-session*", "/session-expired*", "/index-logout*").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login")
                .loginProcessingUrl("/login")
                //.successHandler(successHandler())
                .failureUrl("/login?error=true")
                .and()
                .logout().deleteCookies("JSESSIONID")
                .addLogoutHandler(new HeaderWriterLogoutHandler(new ClearSiteDataHeaderWriter(CACHE, COOKIES, STORAGE)))
                .and()
                .rememberMe().key("uniqueAndSecret").tokenValiditySeconds(86400)
                .and()
                .sessionManagement()
                .sessionFixation().migrateSession()
                .sessionCreationPolicy(SessionCreationPolicy.IF_REQUIRED)
                .invalidSessionUrl("/login")
                .maximumSessions(2)
                .expiredUrl("/session-expired");
        return http.build();
        */
    }
}
