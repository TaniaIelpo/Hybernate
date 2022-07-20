package co.develhope.Hybernate.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="enrollements")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Enrollement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idEnrollement;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="idStudent", nullable = false)
    private Student student;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="idClass",nullable = false)
    private Classes classes;


}
