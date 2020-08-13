package com.wilkinson.DnDCharGen.services;

import com.wilkinson.DnDCharGen.models.PlayerCharacter;
import com.wilkinson.DnDCharGen.repositories.PlayerCharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PlayerCharacterService
{
    private PlayerCharacterRepository repository;

    @Autowired
    public PlayerCharacterService(PlayerCharacterRepository repository)
    {
        this.repository = repository;
    }

    public PlayerCharacter create(PlayerCharacter newPlayerCharacter)
    {
        return repository.save(newPlayerCharacter);
    }

    public Optional<PlayerCharacter> findById(Long id)
    {
        return repository.findById(id);
    }

    public Iterable<PlayerCharacter> findAll()
    {
        return repository.findAll();
    }
}
