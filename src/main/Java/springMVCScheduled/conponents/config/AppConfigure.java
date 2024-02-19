package springMVCScheduled.conponents.config;


import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.*;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


@Configuration
@ComponentScan(basePackages = "springMVCScheduled.conponents")
@EnableWebMvc
@PropertySource("classpath:application.properties")
@Slf4j
//@EnableScheduling
public class AppConfigure {
    public AppConfigure() {
        var s = "AppConfigure bean created";
        log.info(s);
        System.out.println(s);
    }

    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
        internalResourceViewResolver.setPrefix("/WEB-INF/view/");
        internalResourceViewResolver.setSuffix(".jsp");
        return internalResourceViewResolver;
    }
}
