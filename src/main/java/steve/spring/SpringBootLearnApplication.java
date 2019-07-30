package steve.spring;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

// 该注解表明以下类为项目运行的主类，项目运行会自动扫描该类同级及其以下的包
@SpringBootApplication
public class SpringBootLearnApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootLearnApplication.class, args);
    }

    @Bean
    public ServerEndpointExporter serverEndpointExporter(){
        return new ServerEndpointExporter();
    }
}
