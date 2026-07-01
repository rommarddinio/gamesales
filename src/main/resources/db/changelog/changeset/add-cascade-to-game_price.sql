ALTER TABLE game_price
DROP CONSTRAINT game_price_game_id_fkey,
DROP CONSTRAINT game_price_store_id_fkey;

ALTER TABLE game_price
ADD CONSTRAINT game_price_game_id_fkey
FOREIGN KEY (game_id)
REFERENCES game(game_id) ON DELETE CASCADE,

ADD CONSTRAINT game_price_store_id_fkey
FOREIGN KEY (store_id)
REFERENCES store(store_id) ON DELETE CASCADE;


