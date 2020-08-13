package com.wilkinson.DnDCharGen.repositories;

import com.wilkinson.DnDCharGen.models.PlayerCharacter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerCharacterRepository extends JpaRepository<PlayerCharacter, Long>
{
}
