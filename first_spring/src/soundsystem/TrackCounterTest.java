package soundsystem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static junit.framework.TestCase.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TrackCountConfig.class)
public class TrackCounterTest {
    @Autowired
    private CompactDisc cd;
//    @Autowired
//    private TrackCounter counter;

    @Test
    public void testTrackCounter(){
        cd.playTrack(1);
    }
}
