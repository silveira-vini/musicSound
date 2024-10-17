package ribeiro.silveira.vinicius.musicSound.main;

import java.util.Scanner;

public class Main {

    private final Scanner input = new Scanner(System.in);

    public void showMenu() {
        var menu = """
                
                *** MUSIC SOUND ***
                =====  MENU  =====
                1 - Register artists
                2 - Register musics
                3 - List musics
                4 - Find musics from artists
                5 - Search data from an artist
                
                0 - Exit
                """;

        var option = -1;

        while (option != 0) {

            System.out.println(menu);
            option = input.nextInt();
            input.nextLine();

            switch (option) {
                case 1:
                    registerArtist();
                    break;
                case 2:
                    registerMusic();
                    break;
                case 3:
                    listMusic();
                    break;
                case 4:
                    findMusicFromArtist();
                    break;
                case 5:
                    searchDataArtist();
                    break;
                case 0:
                    System.out.println("Exiting program");
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }

    private void searchDataArtist() {
    }

    private void findMusicFromArtist() {
    }

    private void listMusic() {
    }

    private void registerMusic() {
    }

    private void registerArtist() {
    }
}
