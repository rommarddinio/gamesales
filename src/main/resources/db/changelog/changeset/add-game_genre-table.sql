CREATE TABLE game_genre(
    game_id BIGINT REFERENCES game(game_id) ON DELETE CASCADE,
    genre_id BIGINT REFERENCES genre(genre_id) ON DELETE CASCADE,
    PRIMARY KEY(game_id, genre_id)
)