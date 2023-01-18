package com.example.demo.Service;

import com.example.demo.Entity.Team;
import com.example.demo.Repository.TeamRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class Teamservice implements ITeamService {
    private  TeamRepository teamRepository;
    public Teamservice(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }





    @Override

    public List<Team> getAll() {

        System.out.println(teamRepository.findAll());
        return teamRepository.findAll();
    }



    public Team getById(Long id) {


        return teamRepository.findById(id).orElseThrow();
    }

    @Override
    public void add(Team team) {
        teamRepository.save(team);

    }

    @Override
    public void update(Team team) {
        Team existingTeam = teamRepository.findById(team.getId()).orElseThrow();
        existingTeam.setName(team.getName());
        existingTeam.setSlogan(team.getSlogan());
        teamRepository.save(existingTeam);
    }

    @Override
    public void deletById(Long id) {
        teamRepository.deleteById(id);

    }
}


