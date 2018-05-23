package soundsystem;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Aspect
public class TrackCounter {
    private Map<Integer,Integer> trackCounts=new HashMap<Integer, Integer>();
    @Pointcut(
            "execution(* soundsystem.CompactDisc.playTrack(int))"
                    +"&&args(trackNumber)")
    public void trackPlayed(int trackNumber){}

    @Before("trackPlayed(trackNumber)")
    public void countTrack(int trackNumber){
        int currentCount=getPlayCount(trackNumber);
    }

    public int getPlayCount(int trackNumber) {
        return trackCounts.containsKey(trackNumber)?trackCounts.get(trackNumber):0;
    }
}
