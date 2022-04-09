import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try{
            Playlist playlist = new Playlist("DS");
            playlist.getSongs().add("src/Songs/01 the main theme of ''Kimetsu no Yaiba''.mp3");
            playlist.getSongs().add("src/Songs/Kamado Tanjirou no Uta (From Demon Slayer Kimetsu no Yaiba).mp3");

            String filename = "";
            Scanner scanner = new Scanner(System.in);
            while(true){
                System.out.println("Enter the track number :");
                String input = scanner.nextLine();
                if("stop".equals(input)){
                    break;
                }
                int trackNo = Integer.parseInt(input);
                if(trackNo > playlist.getSongs().size() || trackNo < 1){
                    System.out.println("Track out of bounds !\n");
                    continue;
                }else{
                    filename = playlist.getSongs().get(trackNo-1);
                    break;
                }
            }

            if(filename == null || filename.equals("")) {
                System.out.println("Program Ending");
            }else{
                MP3Player mp3Player = new MP3Player(filename);
                mp3Player.play();

                Scanner sc = new Scanner(System.in);

                System.out.println("Write stop to stop the music: ");

                if (sc.nextLine().equalsIgnoreCase("stop")) {
                    mp3Player.close();
                }
            }
        }catch(Exception e){
            e.getMessage();
        }

    }
}
