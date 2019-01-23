package sgf.pet;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ComponentScan("sgf.pet")
//@MapperScan("sgf.pet.*.dao")
@EnableSwagger2
public class ServiceMain {
	public static void main(String[] args) {
		SpringApplication.run(ServiceMain.class, args);
	}
}
