package concert;

import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Configuration
@EnableAspectJAutoProxy
public class Concertconfig {
    @Bean
    public Audience audience(){
        return new Audience();
    }
    @Bean
    public PerformanceImpl PerformanceImpl(){
        return new PerformanceImpl();
    }
}
