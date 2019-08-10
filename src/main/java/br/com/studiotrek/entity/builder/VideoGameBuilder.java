package br.com.studiotrek.entity.builder;

import br.com.studiotrek.entity.VideoGame;

public final class VideoGameBuilder {
    private String name;
    private String release;
    private String country;

    private VideoGameBuilder() {
    }

    public static VideoGameBuilder builder() {
        return new VideoGameBuilder();
    }

    public VideoGameBuilder name(String name) {
        this.name = name;
        return this;
    }

    public VideoGameBuilder release(String release) {
        this.release = release;
        return this;
    }

    public VideoGameBuilder country(String country) {
        this.country = country;
        return this;
    }

    public VideoGame build() {
        VideoGame videoGame = new VideoGame();
        videoGame.setName(name);
        videoGame.setRelease(release);
        videoGame.setCountry(country);
        return videoGame;
    }
}
