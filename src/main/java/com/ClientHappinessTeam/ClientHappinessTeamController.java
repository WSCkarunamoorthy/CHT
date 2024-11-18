package com.ClientHappinessTeam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/client-happiness-team")
public class ClientHappinessTeamController {

    @Autowired
    private ClientHappinessTeamService service;

    // Get all records
    @GetMapping
    public List<ClientHappinessTeam> getAll() {
        return service.getAll();
    }

    // Get a specific record by ID
    @GetMapping("/{id}")
    public ResponseEntity<ClientHappinessTeam> getById(@PathVariable String id) {
        Optional<ClientHappinessTeam> record = service.getById(id);
        return record.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Create a new record
    @PostMapping
    public ClientHappinessTeam create(@RequestBody ClientHappinessTeam clientHappinessTeam) {
        return service.create(clientHappinessTeam);
    }

    // Update an existing record
    @PutMapping("/{id}")
    public ResponseEntity<ClientHappinessTeam> update(@PathVariable String id, @RequestBody ClientHappinessTeam clientHappinessTeam) {
        ClientHappinessTeam updated = service.update(id, clientHappinessTeam);
        if (updated != null) {
            return ResponseEntity.ok(updated);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Delete a record by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        boolean deleted = service.delete(id);
        if (deleted) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
