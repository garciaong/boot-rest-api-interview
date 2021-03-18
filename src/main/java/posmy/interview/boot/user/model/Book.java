package posmy.interview.boot.user.model;

import lombok.Data;
import posmy.interview.boot.enums.BookStatusEnum;

@Data
public class Book {
	private Long id;
	private String name;
	private String author;
	private BookStatusEnum status;
}
