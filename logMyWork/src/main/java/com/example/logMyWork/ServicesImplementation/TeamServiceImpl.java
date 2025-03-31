package com.example.logMyWork.ServicesImplementation;

import com.example.logMyWork.Entities.Team;
import com.example.logMyWork.Repositories.TeamRepo;
import com.example.logMyWork.Services.TeamService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeamServiceImpl implements TeamService {

    private final TeamRepo teamRepo;

    public TeamServiceImpl(TeamRepo teamRepo) {
        this.teamRepo = teamRepo;
    }

    @Override
    public Team saveTeam(Team team) {
        return teamRepo.save(team);
    }

    @Override
    public Optional<Team> updateTeam(Team team) {
        if (team.getTeamId() != null && teamRepo.existsById(team.getTeamId())) {
            return Optional.of(teamRepo.save(team));
        }
        return Optional.empty();
    }

    @Override
    public void deleteTeam(Integer teamId) {
        teamRepo.deleteById(teamId);
    }

    @Override
    public List<Team> getAllTeams() {
        return teamRepo.findAll();
    }

    @Override
    public Optional<Team> getTeamById(Integer teamId) {
        return teamRepo.findById(teamId);
    }

    @Override
    public List<Team> getTeamsByProjectId(Integer projectId) {
        return teamRepo.findByProjectProjectId(projectId);
    }

    @Override
    public List<Team> getTeamsByManagerId(Integer managerId) {
        return teamRepo.findByManagerEmpId(managerId);
    }
}