package org.example.sms.repository;

import org.example.sms.model.StudentModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository <StudentModel , String>{



}
