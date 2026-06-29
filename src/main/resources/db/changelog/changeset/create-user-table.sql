CREATE TABLE users(
    user_id BIGSERIAL PRIMARY KEY,
    username VARCHAR(128) NOT NULL,
    github_id BIGINT UNIQUE NOT NULL,
    created_at TIMESTAMPTZ,
    updated_at TIMESTAMPTZ
)