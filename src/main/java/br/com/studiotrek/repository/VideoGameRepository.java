package br.com.studiotrek.repository;

import br.com.studiotrek.entity.VideoGame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoGameRepository extends JpaRepository<VideoGame, String>, JpaSpecificationExecutor<VideoGame> {
}
