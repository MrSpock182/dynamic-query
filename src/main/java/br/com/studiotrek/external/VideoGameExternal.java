package br.com.studiotrek.external;

import br.com.studiotrek.entity.VideoGame;

import java.util.List;

public interface VideoGameExternal {
    VideoGame save(VideoGame videoGame);
    List<VideoGame> findAll();
    List<VideoGame> findDynamic(VideoGame videoGame);
}
