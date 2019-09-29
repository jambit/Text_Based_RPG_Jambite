package rooms;

import com.jambit.*;

import java.util.Scanner;

public class Roof {

    public static void startRoof() throws Exception {

        Music.sequencer.stop();
        //TODO add music!
        Music roofMusic = new Music();
        roofMusic.run("roofMusic");

        boolean inRoom = true;
        Cherry cherry = new Cherry();
        cherry.summonCherry();
        while (inRoom) {
            GameState.whereAmI = Constants.ROOF;
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            switch (input) {

                case "umsehen":
                    System.out.println("\n in der Mitte des Daches steht ein Hubschrauber [get to the choppa]");
                    break;

                case "springen":
                    System.out.println("du siehst wie die Stockwerke und dein Leben an dir vorbeirauschen und " +
                            "bereitest dich geistig auf den Aufprall vor");
                    Thread.sleep(500);
                    GameState.liveCount=0;
                    Leben.showLives(0);
                    break;

                case "links gehen":
                    Stairs.startStairs();
                    break;

                case "get to the choppa":
                    System.out.println("\n" +
                            "▬▬▬.◙.▬▬▬\n" +
                            "═▂▄▄▓▄▄▂\n" +
                            "◢◤ █▀▀████▄▄▄▄◢◤      \n" +
                            "█▄ █ーJ ███▀▀▀▀▀▀▀╬ ");
                    System.out.println("du steigst in den Hubschrauber ein und entkommst dem Albtraum");
                    System.out.println();



                default:
                    RoomsOptions.normalRoomOptions(input);
                    break;
            }
        }
    }
}