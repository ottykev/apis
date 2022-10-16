package com.arims.repository;

import com.arims.model.Artifact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ArtifactRepository extends JpaRepository<Artifact,Long> {

    void deleteArtifactById(Long id);

    Optional<Artifact> findArtifactById(Long id);
}
