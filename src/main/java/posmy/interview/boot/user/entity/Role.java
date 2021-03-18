package posmy.interview.boot.user.entity;

import javax.persistence.*;

import lombok.Data;

@Entity
@Table(name = "roles")
@Data
public class Role {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
     
    private String name;
}
