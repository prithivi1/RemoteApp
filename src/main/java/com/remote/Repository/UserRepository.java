package com.remote.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.remote.model.UserModel;

@Repository
public interface UserRepository extends JpaRepository<UserModel,Long>{

}
