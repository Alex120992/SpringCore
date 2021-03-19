package ru.zateev.springcore10;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ru.zateev.springcore10") // автоматически сканирует бины в пакете
@PropertySource("classpath:musicPlayerSpringCore9")
public class SpringConfig {

}
