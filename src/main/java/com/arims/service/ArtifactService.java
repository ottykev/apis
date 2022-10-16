package com.arims.service;


import com.arims.exception.UserNotFoundException;
import com.arims.model.Artifact;
import com.arims.repository.ArtifactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtifactService {

    @Autowired
    private ArtifactRepository artifactRepository;

    public ArtifactService() {
    }

    public Artifact newArt(Artifact artifact) {
        return (Artifact)this.artifactRepository.save(artifact);
    }

    public void deleteArtifact(Long id) {
        this.artifactRepository.deleteArtifactById(id);
    }

    public List<Artifact> findAllArtifact() {
        return this.artifactRepository.findAll();
    }

    public Artifact updateArtifact(Artifact artifact) {
        return (Artifact)this.artifactRepository.save(artifact);
    }

    public Artifact findArtifactById(Long id) {
        return (Artifact)this.artifactRepository.findArtifactById(id).orElseThrow(() -> {
            return new UserNotFoundException("Art by id " + id + " was not found");
        });
    }



}
