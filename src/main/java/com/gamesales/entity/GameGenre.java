package com.gamesales.entity;

import com.gamesales.entity.pk.GameGenrePK;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "game_genre")
@Getter
@Setter
public class GameGenre {

    @EmbeddedId
    private GameGenrePK pk;

}
