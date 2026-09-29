package com.lab.jpa.gestaoufc.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "evento")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String nomeEvento; //Exemplo: UFC 331

    @Column(nullable = false)
    private LocalDate data;

    @Column(nullable = false)
    private String localEvento; //Exemplo: Arena Madison Square Garden

    @OneToMany(mappedBy = "evento", cascade = CascadeType.PERSIST)
    private List<Luta> lutas;
}
