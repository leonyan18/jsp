package soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableAspectJAutoProxy
public class TrackCountConfig {
    @Bean
    public  CompactDisc sgtPeppers(){
        BlankDisc cd=new BlankDisc();
        cd.setTitle("title");
        cd.setArtist("artist");
        List<String> tracks=new ArrayList<String>();
        tracks.add("1");
        tracks.add("2");
        tracks.add("3");
        tracks.add("4");
        cd.setTracks(tracks);
        return cd;
    }
    @Bean
    public TrackCounter trackCounter(){
        return new TrackCounter();
    }
}
