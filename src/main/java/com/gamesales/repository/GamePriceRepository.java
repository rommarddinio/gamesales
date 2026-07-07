package com.gamesales.repository;

import com.gamesales.entity.GamePrice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GamePriceRepository extends JpaRepository<GamePrice, Long> {
}
