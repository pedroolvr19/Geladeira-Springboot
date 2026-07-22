package dev.java10x.Fridge.service;

import java.util.List;

import org.springframework.stereotype.Service;

import dev.java10x.Fridge.model.Food;
import dev.java10x.Fridge.repository.Foodrepository;

@Service
public class FoodService {

    private final Foodrepository foodRepository;

    public FoodService(Foodrepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    // listar
    public List<Food> getAll() {
        return foodRepository.findAll();
    }

    // criar
    public Food save(Food food) {
        return foodRepository.save(food);
    }

    // deletar
    public void delete(Long id) {
        foodRepository.deleteById(id);
    }

}
