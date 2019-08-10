package br.com.studiotrek.entity;

import javax.persistence.*;

@Table
@Entity
public class VideoGame {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String release;
    private String country;

    public VideoGame() {
    }

    public VideoGame(Integer id, String name, String release, String country) {
        this.id = id;
        this.name = name;
        this.release = release;
        this.country = country;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRelease() {
        return release;
    }

    public void setRelease(String release) {
        this.release = release;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
