package com.example.demo.game.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.game.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
}
