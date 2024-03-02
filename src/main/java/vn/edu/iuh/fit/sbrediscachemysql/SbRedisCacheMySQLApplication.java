package vn.edu.iuh.fit.sbrediscachemysql;

import net.datafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;

import vn.edu.iuh.fit.sbrediscachemysql.models.User;
import vn.edu.iuh.fit.sbrediscachemysql.repositories.UserRepository;

@SpringBootApplication
@EnableCaching
public class SbRedisCacheMySQLApplication {
    @Autowired
    private UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(SbRedisCacheMySQLApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(){
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                Faker faker = new Faker();
                for (int i = 0; i<10; i++){
                    userRepository.save(new User(i+1, faker.name().fullName()));
                }
            }
        };
    }
}
