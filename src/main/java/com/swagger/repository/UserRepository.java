package com.swagger.repository;

import com.swagger.models.UserModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<UserModel,String> {
    void deleteByEmail(String email);
    UserModel findByEmail(String email);
}
