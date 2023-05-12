package com.example.demo.game.services;

import com.example.demo.game.dto.GameMinDTO;
import com.example.demo.game.entities.Game;
import com.example.demo.game.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll(){
        List<Game> gamesList = gameRepository.findAll();
        return gamesList.stream().map(GameMinDTO::new).collect(Collectors.toList());
    }
}
