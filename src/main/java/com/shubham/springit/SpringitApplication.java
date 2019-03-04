package com.shubham.springit;

import com.shubham.springit.domain.Comment;
import com.shubham.springit.domain.Link;
import com.shubham.springit.repository.CommentRepository;
import com.shubham.springit.repository.LinkRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringitApplication {

    private static final Logger log = LoggerFactory.getLogger(SpringitApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringitApplication.class, args);
        System.out.println("Welcome to Springit");
    }
    @Bean
    CommandLineRunner runner(LinkRepository linkRepository, CommentRepository commentRepository){
        return args -> {
            Link link = new Link("Getting Started with Spring Boot 2", "www.someurl.com");
            linkRepository.save(link);
            Comment comment = new Comment("This is a dope ass link", link);
            commentRepository.save(comment);
            link.addComment(comment);

        };
    }
}