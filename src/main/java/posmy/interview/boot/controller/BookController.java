package posmy.interview.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import posmy.interview.boot.enums.BookStatusEnum;
import posmy.interview.boot.user.model.Book;

@RestController
@RequestMapping("/book")
public class BookController {

	@GetMapping("/")
	public String testPage() {
		return "Test Page";
	}
	
//	@PutMapping(path= "/borrow", consumes = "application/json", produces = "application/json")
//	public @ResponseBody Book borrowBook(@RequestBody Book book) {
//		book.setStatus(BookStatusEnum.BORROWED);
//		return book;
//	}
	
	@PostMapping("/borrow")
	public Book borrowBook2(Book book) {
		book.setStatus(BookStatusEnum.BORROWED);
		return book;
	}
	
}
