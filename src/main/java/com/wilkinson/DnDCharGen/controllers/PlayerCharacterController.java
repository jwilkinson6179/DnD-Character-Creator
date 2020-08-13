package com.wilkinson.DnDCharGen.controllers;

import com.wilkinson.DnDCharGen.models.PlayerCharacter;
import com.wilkinson.DnDCharGen.services.PlayerCharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@RestController
@RequestMapping("/api/player_character")
public class PlayerCharacterController
{
    private final PlayerCharacterService service;

    @Autowired
    public PlayerCharacterController(PlayerCharacterService service)
    {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<?> createPlayerCharacter(@Valid @RequestBody PlayerCharacter playerCharacter)
    {
        return new ResponseEntity<>(service.create(playerCharacter), HttpStatus.CREATED);
    }

    @GetMapping()
    public ResponseEntity<Iterable<PlayerCharacter>> findAll()
    {
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findPlayerCharacterById(@PathVariable Long id)
    {
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }
}
