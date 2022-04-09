import java.util.ArrayList;
import lombok.*;

@Data
public class Playlist {
    private String name;
    private ArrayList<String> songs = new ArrayList<>();

    public Playlist(String name){
        this.name = name;
    }
}
