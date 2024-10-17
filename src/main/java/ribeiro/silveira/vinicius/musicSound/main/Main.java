package ribeiro.silveira.vinicius.musicSound.main;

import ribeiro.silveira.vinicius.musicSound.models.Artist;
import ribeiro.silveira.vinicius.musicSound.models.ArtistType;
import ribeiro.silveira.vinicius.musicSound.repository.Repository;

import java.util.Scanner;

public class Main {

    private final Scanner input = new Scanner(System.in);
    private final Repository repository;

    public Main(Repository repository) {
        this.repository = repository;
    }

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

    private void registerArtist() {

        System.out.println("Enter the Artist's name: ");
        var artistName = input.nextLine();
        System.out.println("Enter the Artist's genre: ");
        var artistGenre = input.nextLine();
        System.out.println("Typo 's' for Solo, 'd' for Duo or 'b' for Band:");
        var artistType = ArtistType.fromString(input.nextLine());

        Artist artist = new Artist(artistName, artistGenre, artistType);
        repository.save(artist);
        System.out.println(artist);

    }

    private void registerMusic() {
    }

    private void listMusic() {
    }

    private void findMusicFromArtist() {
    }

    private void searchDataArtist() {
    }




}
