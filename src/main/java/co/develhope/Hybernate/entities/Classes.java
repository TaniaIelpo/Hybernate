package co.develhope.Hybernate.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "classes")

@AllArgsConstructor
@NoArgsConstructor

public class Classes {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idClass;

    @Column (nullable = false)
    private String title;

    @Column (nullable = false)
    private String description;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "classes")
    private List<Enrollement> enrollements;

}
