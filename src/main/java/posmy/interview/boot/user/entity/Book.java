package posmy.interview.boot.user.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import posmy.interview.boot.enums.BookStatusEnum;

@Entity
@Table(name = "books")
@Data
public class Book {

	@Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	
	private String name;
	private String author;
	private BookStatusEnum status;
}
