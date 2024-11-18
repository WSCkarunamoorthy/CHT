package com.ClientHappinessTeam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientHappinessTeamService {

    @Autowired
    private ClientHappinessTeamRepository repository;

    // Get all ClientHappinessTeam records
    public List<ClientHappinessTeam> getAll() {
        return repository.findAll();
    }

    // Get a specific ClientHappinessTeam record by ID
    public Optional<ClientHappinessTeam> getById(String id) {
        return repository.findById(id);
    }

    // Create a new ClientHappinessTeam record
    public ClientHappinessTeam create(ClientHappinessTeam clientHappinessTeam) {
        return repository.save(clientHappinessTeam);
    }

    // Update an existing ClientHappinessTeam record
    public ClientHappinessTeam update(String id, ClientHappinessTeam clientHappinessTeam) {
        if (repository.existsById(id)) {
            clientHappinessTeam.setId(id);
            return repository.save(clientHappinessTeam);
        }
        return null; // Handle this case appropriately
    }

    // Delete a ClientHappinessTeam record by ID
    public boolean delete(String id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }
}
