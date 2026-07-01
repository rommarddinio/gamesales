package com.gamesales.entity.pk;

import com.gamesales.entity.Game;
import com.gamesales.entity.User;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
@Getter
@Setter
public class WishlistPK implements Serializable {

    @ManyToOne
    @JoinColumn(name = "game_id")
    private Game game;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WishlistPK pk = (WishlistPK) o;
        return Objects.equals(this.getGame(), pk.getGame()) &&
                Objects.equals(this.getUser(), pk.getUser());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getGame(), this.getUser());
    }

}
