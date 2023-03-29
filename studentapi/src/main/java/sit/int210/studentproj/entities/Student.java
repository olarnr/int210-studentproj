package sit.int210.studentproj.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "student")
public class Student {
    @Id
    @Column(name = "STDID", unique = true, length = 11)
    private String id;

    @Column(name = "FIRSTNAME", length = 50)
    private String firstname;
    
    @Column(name = "LASTNAME", length = 50)
    private String lastname;
    
    @Column(name = "MAJOR", length = 50)
    private String major;
}
