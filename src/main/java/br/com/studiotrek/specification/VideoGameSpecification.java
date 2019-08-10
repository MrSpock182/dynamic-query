package br.com.studiotrek.specification;

import br.com.studiotrek.entity.VideoGame;
import org.springframework.data.jpa.domain.Specification;

public class VideoGameSpecification {

    public static Specification<VideoGame> name(String name) {
        return (root, criteriaQuery, criteriaBuilder) ->
                criteriaBuilder.equal(root.get("name"), name);
    }

    public static Specification<VideoGame> release(String release) {
        return (root, criteriaQuery, criteriaBuilder) ->
                criteriaBuilder.equal(root.get("release"), release);
    }

    public static Specification<VideoGame> country(String country) {
        return (root, criteriaQuery, criteriaBuilder) ->
                criteriaBuilder.equal(root.get("country"), country);
    }

}
