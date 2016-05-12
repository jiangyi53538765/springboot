package springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;




//组件扫描 @ComponentScan
@Controller
@EnableAutoConfiguration //启用自动配置
@Configuration //配置控制
@EnableWebMvc
@RequestMapping("/SpringBootApplication")
public class Application extends WebMvcConfigurerAdapter{

	
	@RequestMapping("/springbootMethod/{username}")
	@ResponseBody
	public String springboot(@PathVariable("username") String username){
		return "Hello World mi,Url = /SpringBootApplication/springboot/username="+username;
	}
	
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication();
		app.run(Application.class,args);
	}
	
}
