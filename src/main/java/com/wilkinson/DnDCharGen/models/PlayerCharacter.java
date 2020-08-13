package com.wilkinson.DnDCharGen.models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "player_character")
public class PlayerCharacter
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotBlank
    @Size(min = 3, max = 64, message = "Character name must be between 2 and 64 characters")
    private String name;

    private Integer strength;
    private Integer dexterity;
    private Integer constitution;
    private Integer intelligence;
    private Integer wisdom;
    private Integer charisma;

    public PlayerCharacter() { }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Integer getStrength()
    {
        return strength;
    }

    public void setStrength(Integer strength)
    {
        this.strength = strength;
    }

    public Integer getDexterity()
    {
        return dexterity;
    }

    public void setDexterity(Integer dexterity)
    {
        this.dexterity = dexterity;
    }

    public Integer getConstitution()
    {
        return constitution;
    }

    public void setConstitution(Integer constitution)
    {
        this.constitution = constitution;
    }

    public Integer getIntelligence()
    {
        return intelligence;
    }

    public void setIntelligence(Integer intelligence)
    {
        this.intelligence = intelligence;
    }

    public Integer getWisdom()
    {
        return wisdom;
    }

    public void setWisdom(Integer wisdom)
    {
        this.wisdom = wisdom;
    }

    public Integer getCharisma()
    {
        return charisma;
    }

    public void setCharisma(Integer charisma)
    {
        this.charisma = charisma;
    }
}
