package posmy.interview.boot.user.entity;

import java.util.*;

import javax.persistence.*;

import lombok.Data;
 
@Entity
@Table(name = "users")
@Data
public class User {
 
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
 
    private String username;
    private String password;
    private boolean enabled;
     
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(
            name = "users_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
            )
    private Set<Role> roles = new HashSet<>();
}
