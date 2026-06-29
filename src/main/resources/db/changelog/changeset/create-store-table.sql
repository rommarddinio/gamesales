CREATE TABLE store(
    store_id BIGSERIAL PRIMARY KEY,
    name VARCHAR(128),
    created_at TIMESTAMPTZ,
    updated_at TIMESTAMPTZ
)