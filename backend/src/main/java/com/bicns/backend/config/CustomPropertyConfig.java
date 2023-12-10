package com.bicns.backend.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("env")
@Getter
@Setter
public class CustomPropertyConfig {
    public static String frontend;

    public static String backend;
}
