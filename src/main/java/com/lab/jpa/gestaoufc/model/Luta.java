package com.lab.jpa.gestaoufc.model;
import com.lab.jpa.gestaoufc.model.enums.ResultadoLuta;
import com.lab.jpa.gestaoufc.model.enums.*;
import jakarta.persistence.*;

import lombok.*;

@Entity
@Table(name = "lutas")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Luta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "evento_id", nullable = false)
    private Evento evento;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "lutador1_id")
    private Lutador lutador1;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "lutador2_id")
    private Lutador lutador2;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false,name = "resultado")
    private ResultadoLuta resultado;

}
