package com.gamesales.entity;

import com.gamesales.entity.pk.WishlistPK;
import com.gamesales.enums.Currency;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "wishlist")
@Getter
@Setter
public class Wishlist extends Auditable{

    @EmbeddedId
    private WishlistPK pk;

    @Column(name = "target_price")
    private BigDecimal targetPrice;

    @Column
    @Enumerated(EnumType.STRING)
    private Currency currency;

}
