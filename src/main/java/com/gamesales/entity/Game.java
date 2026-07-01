package com.gamesales.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.BatchSize;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "game")
@Getter
@Setter
public class Game extends Auditable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "game_id")
    private Long id;

    @Column
    private String name;

    @Column(name = "release_date")
    private LocalDate releaseDate;

    @OneToMany(mappedBy = "game")
    @BatchSize(size = 5)
    private List<GamePrice> gamePrice;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return Objects.equals(this.getId(), game.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.getId());
    }

}
