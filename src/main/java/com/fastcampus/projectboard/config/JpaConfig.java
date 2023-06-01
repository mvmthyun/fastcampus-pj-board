package com.fastcampus.projectboard.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.Optional;

@EnableJpaAuditing // JpaAuditing의 기능을 활성화 한다.
@Configuration // JpaConfig 빈 등록
public class JpaConfig {

    @Bean
    public AuditorAware<String> auditorAware() {
        return () -> Optional.of("mvmt"); // TODO: 스프링 시큐리티로 인증 기능을 붙이게 될 때, 수정
    }

}
