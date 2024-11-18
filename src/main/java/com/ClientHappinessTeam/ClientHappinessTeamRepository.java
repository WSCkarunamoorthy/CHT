package com.ClientHappinessTeam;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientHappinessTeamRepository extends MongoRepository<ClientHappinessTeam, String> {
    // You can add custom query methods if needed
}
