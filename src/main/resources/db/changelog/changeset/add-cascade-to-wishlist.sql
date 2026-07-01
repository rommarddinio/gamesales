ALTER TABLE wishlist
DROP CONSTRAINT wishlist_game_id_fkey,
DROP CONSTRAINT wishlist_user_id_fkey;

ALTER TABLE wishlist
ADD CONSTRAINT wishlist_game_id_fkey
FOREIGN KEY (game_id)
REFERENCES game(game_id) ON DELETE CASCADE,

ADD CONSTRAINT wishlist_user_id_fkey
FOREIGN KEY (user_id)
REFERENCES users(user_id) ON DELETE CASCADE;