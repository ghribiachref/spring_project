package tn.esprit.coco.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.coco.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}