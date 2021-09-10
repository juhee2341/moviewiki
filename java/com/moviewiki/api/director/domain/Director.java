package com.moviewiki.api.director.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

@SequenceGenerator(
        name = "DIRECTOR_SEQ_GENERATOR",
        sequenceName = "DIRECTOR_SEQ",
        initialValue = 1,
        allocationSize = 1)

@Table(name="directors")
public class Director {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE
                    , generator = "DIRECTOR_SEQ_GENERATOR")
    private @Column(name = "director_id") Long directorId;

    private @Column(name = "director_name") String directorName;
    private @Column(name = "director_profile") String directorProfile;
}