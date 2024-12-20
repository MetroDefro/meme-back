package study.memeback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class MemeBackApplication {

  public static void main(String[] args) {
    SpringApplication.run(MemeBackApplication.class, args);
  }

}
