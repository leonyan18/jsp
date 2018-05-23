package concert;
        import java.util.Arrays;

        import org.junit.Test;
        import org.junit.runner.RunWith;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.context.ApplicationContext;
        import org.springframework.core.env.Environment;
        import org.springframework.test.context.ContextConfiguration;
        import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { Concertconfig.class })
public class PerformanceAOPTest {

    @Autowired
    Performance p;

    @Test
    public void run1() {
        p.perform();
        p.perform();
    }
}