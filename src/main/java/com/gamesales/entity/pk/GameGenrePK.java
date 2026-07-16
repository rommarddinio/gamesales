package com.gamesales.entity.pk;

import com.gamesales.entity.Game;
import com.gamesales.entity.Genre;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Embeddable
@Getter
@Setter
public class GameGenrePK {

    @ManyToOne
    @JoinColumn(name = "game_id")
    private Game game;

    @ManyToOne
    @JoinColumn(name = "genre_id")
    private Genre genre;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GameGenrePK pk = (GameGenrePK) o;
        return Objects.equals(this.getGame(), pk.getGame()) &&
                Objects.equals(this.getGenre(), pk.getGenre());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getGame(), this.getGenre());
    }
}
