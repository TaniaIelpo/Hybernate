package co.develhope.Hybernate.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.NotFound;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "students")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idStudent;
    @Column (nullable = false, name="Name")
    private String firstName;

    @Column (nullable = false, name="Surname")
    private String lastName;

    @Column(unique = true, name = "StudentEmail", nullable = false)
    private String email;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "student")
    private List<Enrollement> enrollements;

}
