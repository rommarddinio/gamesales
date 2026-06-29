CREATE TABLE game_price(
    game_price_id BIGSERIAL PRIMARY KEY,
    price NUMERIC(10, 2) NOT NULL,
    currency VARCHAR(3) NOT NULL,
    game_id BIGINT REFERENCES game(game_id),
    store_id BIGINT REFERENCES store(store_id),
    created_at TIMESTAMPTZ,
    updated_at TIMESTAMPTZ
)