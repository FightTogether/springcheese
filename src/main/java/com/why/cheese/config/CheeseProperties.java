package com.why.cheese.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @author wenghy
 */
@Configuration
public class CheeseProperties {
    @Value("${com.why.cheese.title}")
    private String title;
    @Value("${com.why.cheese.description}")
    private String description;
}
