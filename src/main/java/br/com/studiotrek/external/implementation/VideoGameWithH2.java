package br.com.studiotrek.external.implementation;

import br.com.studiotrek.entity.VideoGame;
import br.com.studiotrek.external.VideoGameExternal;
import br.com.studiotrek.repository.VideoGameRepository;
import br.com.studiotrek.specification.VideoGameSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoGameWithH2 implements VideoGameExternal {

    @Autowired
    private VideoGameRepository repository;

    @Override
    public VideoGame save(VideoGame videoGame) {
        return repository.save(videoGame);
    }

    @Override
    public List<VideoGame> findAll() {
        return repository.findAll();
    }

    @Override
    public List<VideoGame> findDynamic(VideoGame videoGame) {
        return repository.findAll(
                Specification.where(VideoGameSpecification.name(videoGame.getName()))
                .or(VideoGameSpecification.country(videoGame.getCountry()))
                .or(VideoGameSpecification.release(videoGame.getRelease())));
    }
}
