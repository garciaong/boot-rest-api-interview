package posmy.interview.boot.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import posmy.interview.boot.enums.BookStatusEnum;
import posmy.interview.boot.user.entity.Book;

@SpringBootTest
public class BookControllerTest {
	
	TestRestTemplate restTemplate; 
	String url;
	
	@BeforeEach
	void setup() {
		this.url = "http://localhost:8080";
		this.restTemplate = new TestRestTemplate("admin","pass123");
	}
	
	@Test
	void testPage() {
		ResponseEntity<String> response = restTemplate.getForEntity(url+"/book/", String.class);
		assertNotNull(response);
        assertEquals(HttpStatus.OK, response.getStatusCode());
		assertEquals("Test Page", response.getBody());
	}
	
	@Test
	void borrowBook() {
		Book book = new Book();
		book.setId(1L);
		book.setAuthor("Superman");
		book.setName("How to land a new job");
		HttpEntity<Book> request = new HttpEntity<>(book);
		ResponseEntity<Book> response = restTemplate.exchange(url+"/book/borrow", HttpMethod.PUT, request, Book.class);
		assertNotNull(response);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals("How to land a new job",response.getBody().getName());
        assertEquals(BookStatusEnum.BORROWED,response.getBody().getStatus());
	}
}
