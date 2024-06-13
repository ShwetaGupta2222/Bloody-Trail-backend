package com.first_full.baby.repository;
import com.first_full.baby.model.Users;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users,String> {
//    @Transactional
//    long deleteByEmailNotNull();
}
