CREATE TABLE game(
    game_id BIGSERIAL PRIMARY KEY,
    name VARCHAR(128) NOT NULL,
    genre VARCHAR(128) NOT NULL,
    release_date DATE,
    created_at TIMESTAMPTZ,
    updated_at TIMESTAMPTZ
)