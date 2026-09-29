package com.lab.jpa.gestaoufc.model;

import com.lab.jpa.gestaoufc.model.enums.CategoriaPeso;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "lutador")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Lutador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 200)
    private String nome;

    @Column(nullable = true, length = 150)
    private String apelido;

    @Enumerated(EnumType.STRING)
    @Column(name = "categoria", nullable = false, length = 20)
    private CategoriaPeso categoriaPeso;

    @Column(nullable = false)
    private Integer vitorias = 0;

    @Column(nullable = false)
    private Integer derrotas = 0;

    @Column(nullable = false)
    private Integer empates = 0;

    @Column(nullable = false, length = 250)
    private String paisOrigem;


}
