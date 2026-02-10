package org.example.sms.repository;

import java.util.Optional;

import org.example.sms.model.userModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface userRepository extends MongoRepository<userModel, String> {

    Optional<userModel> findByEmail(String email);

}
