package zzy.esvp.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("zzy.esvp.controller")
@EnableWebMvc
public class SpringMvcConfig {
}
