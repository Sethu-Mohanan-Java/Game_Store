package com.gamestore.repository;

import org.springframework.data.repository.CrudRepository;

import org.springframework.transaction.annotation.Transactional;

import com.gamestore.domain.GameToCartItem;
import com.gamestore.domain.CartItem;

@Transactional
public interface GameToCartItemRepository extends CrudRepository<GameToCartItem, Long> {
	void deleteByCartItem(CartItem cartItem);
}
