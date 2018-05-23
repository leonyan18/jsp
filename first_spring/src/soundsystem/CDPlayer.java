package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class CDPlayer   {
    private CompactDisc compactDisc;
//    @Autowired
    public  CDPlayer(CompactDisc compactDisc){
        this.compactDisc=compactDisc;
    }
    public void play(){
        compactDisc.play();
    }
}
