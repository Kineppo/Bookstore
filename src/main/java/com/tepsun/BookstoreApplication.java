package com.tepsun;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.tepsun.model.Book;
import com.tepsun.model.BookRepository;

@SpringBootApplication
public class BookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(BookRepository repository){
		return (args) ->{
			repository.save(new Book(1, "Harry Potter ja puoliverinen prinssi", "J.K. Rowling", 2006, "9789513135072", 20.90));
			repository.save(new Book(2, "Muumipappa ja meri", "Tove Jansson", 1965, "9789510405741", 8.40));
		};
	}	
}
