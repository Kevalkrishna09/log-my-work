package com.example.logMyWork.Services;

import com.example.logMyWork.Entities.Team;

import java.util.List;
import java.util.Optional;

public interface TeamService {

    Team saveTeam(Team team);

    Optional<Team> updateTeam(Team team);

    void deleteTeam(Integer teamId);

    List<Team> getAllTeams();

    Optional<Team> getTeamById(Integer teamId);

    List<Team> getTeamsByProjectId(Integer projectId);

    List<Team> getTeamsByManagerId(Integer managerId);
}