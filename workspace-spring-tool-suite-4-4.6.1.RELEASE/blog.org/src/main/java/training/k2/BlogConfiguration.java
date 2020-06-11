package training.k2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = "training.k2")
@EnableWebMvc
public class BlogConfiguration {
	
	public ViewResolver viewResolver() {
		InternalResourceViewResolver view = new InternalResourceViewResolver("/jsp/", ".jsp");
		return view;
	}

}
