package zzy.esvp.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"zzy.esvp.service", "zzy.esvp.dao"})
public class SpringConfig {
}
