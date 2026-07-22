package dev.java10x.Fridge.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.java10x.Fridge.model.Food;

public interface Foodrepository extends JpaRepository<Food, Long> {

}
