package com.arims.model;


import javax.persistence.*;
import java.util.Arrays;

@Entity
@Table(name = "artifact")
public class Artifact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(
            nullable = false
    )
    private String artifactName;
    @Lob
    @Column(length = Integer.MAX_VALUE,
            nullable = true)
    private byte[] artifact;

    public Artifact() {
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getArtifactName() {
        return this.artifactName;
    }

    public void setArtifactName(String artifactName) {
        this.artifactName = artifactName;
    }

    public byte[] getArtifact() {
        return this.artifact;
    }

    public void setArtifact(byte[] artifact) {
        this.artifact = artifact;
    }

    public String toString() {
        long var10000 = this.id;
        return "Artifact{id=" + var10000 + ", artifactName='" + this.artifactName + "', artifact=" + Arrays.toString(this.artifact) + "}";
    }





}
