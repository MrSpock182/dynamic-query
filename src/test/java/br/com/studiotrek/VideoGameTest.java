package br.com.studiotrek;

import br.com.studiotrek.entity.VideoGame;
import br.com.studiotrek.entity.builder.VideoGameBuilder;
import br.com.studiotrek.external.VideoGameExternal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class VideoGameTest {

    @Autowired
    private VideoGameExternal external;

    @Test
    public void findDynamic() {
        external.save(VideoGameBuilder.builder().name("Super Nintendo").country("Japan").release("1990").build());
        external.save(VideoGameBuilder.builder().name("Play Station").country("Japan").release("1994").build());
        external.save(VideoGameBuilder.builder().name("Mega Driver").country("Japan").release("1988").build());
        external.save(VideoGameBuilder.builder().name("Neo Geo").country("Japan").release("1990").build());

        VideoGame videoGame = VideoGameBuilder.builder().release("1990").build();
        List<VideoGame> videoGames = external.findDynamic(videoGame);

        assertEquals(2, videoGames.size());
    }

}
