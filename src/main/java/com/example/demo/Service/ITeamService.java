package com.example.demo.Service;

import com.example.demo.Entity.Team;

import java.util.List;
import java.util.Optional;

public interface ITeamService {

    List<Team > getAll();
 Team getById(Long id);
    void add(Team team);


    void update(Team team);

    void deletById(Long id);

}
