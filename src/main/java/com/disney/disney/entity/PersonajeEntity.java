package com.disney.disney.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "personaje")
@Getter
@Setter
public class PersonajeEntity {
private Long id;
private String imagen;
private String nombre;
private Integer edad;
private Integer peso;
private String historia;

    @ManyToMany(
            mappedBy = "personaje",
            cascade = CascadeType.ALL,
            fetch  = FetchType.LAZY
    )
    private List<PeliculaEntity> peliculaEntityList = new ArrayList<>();

}
