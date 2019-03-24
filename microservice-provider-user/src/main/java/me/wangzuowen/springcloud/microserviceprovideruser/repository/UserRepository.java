package me.wangzuowen.springcloud.microserviceprovideruser.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import me.wangzuowen.springcloud.microserviceprovideruser.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
