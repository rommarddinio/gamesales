CREATE TABLE wishlist(
    user_id BIGINT REFERENCES users(user_id),
    game_id BIGINT REFERENCES game(game_id),
    target_price NUMERIC(10, 2),
    currency VARCHAR(3),
    created_at TIMESTAMPTZ,
    updated_at TIMESTAMPTZ,
    PRIMARY KEY (user_id, game_id)
)