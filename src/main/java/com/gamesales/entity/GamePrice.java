package com.gamesales.entity;

import com.gamesales.enums.Currency;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "game_price")
@Getter
@Setter
public class GamePrice extends Auditable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "game_price_id")
    private Long id;

    @Column
    private BigDecimal price;

    @Column
    @Enumerated(EnumType.STRING)
    private Currency currency;

    @ManyToOne
    @JoinColumn(name = "game_id")
    private Game game;

    @ManyToOne
    @JoinColumn(name = "store_id")
    private Store store;

}
