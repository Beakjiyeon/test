package sample.samplespring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sample.samplespring.model.User;

import java.util.Optional;

/**
 * 사용자 관리 리포지터리 클래스
 * @author 백지연
 */
@Repository
public interface UserRepository extends JpaRepository<User, String> {
    Optional<User> findByUid(long uid);
    void deleteByUid(long uid);
}
