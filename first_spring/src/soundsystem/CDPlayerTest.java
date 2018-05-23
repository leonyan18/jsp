package soundsystem;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {
//    @Rule
    public final StandardOutputStreamLog log=new StandardOutputStreamLog();
//    @Autowired
    private CompactDisc compactDisc;
//    @Autowired
    private CDPlayer player;
//    @Test
    public void CdShouldNotBeNull(){
        assertNotNull(compactDisc);
    }
//    @Test
    public void play(){
        player.play();
        assertEquals("515646\r\n",log.getLog());
    }
}
