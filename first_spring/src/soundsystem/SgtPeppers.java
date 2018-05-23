package soundsystem;

import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisc {
    private String content="515646";
    public void play() {
        System.out.println(content);
    }

    @Override
    public void playTrack(int pos) {

    }
}
