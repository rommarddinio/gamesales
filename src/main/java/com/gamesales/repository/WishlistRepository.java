package com.gamesales.repository;

import com.gamesales.entity.Wishlist;
import com.gamesales.entity.pk.WishlistPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WishlistRepository extends JpaRepository<Wishlist, WishlistPK> {
}
