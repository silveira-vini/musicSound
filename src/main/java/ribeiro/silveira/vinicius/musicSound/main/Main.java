package ribeiro.silveira.vinicius.musicSound.main;

import ribeiro.silveira.vinicius.musicSound.models.Artist;
import ribeiro.silveira.vinicius.musicSound.models.ArtistType;
import ribeiro.silveira.vinicius.musicSound.models.Music;
import ribeiro.silveira.vinicius.musicSound.repository.Repository;

import java.util.List;
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
        Artist existingArtist = repository.findByNameIgnoreCase(artistName);
        if (existingArtist != null) {
            System.out.println("\nArtist with this name already exists!");
            return;
        }

        System.out.println("Enter the Artist's genre: ");
        var artistGenre = input.nextLine();
        System.out.println("Typo 's' for Solo, 'd' for Duo or 'b' for Band:");
        var artistType = ArtistType.fromString(input.nextLine());

        Artist artist = new Artist(artistName, artistGenre, artistType);
        repository.save(artist);
        System.out.println(artist);

    }

    private void registerMusic() {
        System.out.println("Enter the Artist's name: ");
        var artistName = input.nextLine();
        System.out.println("Enter the Song's name: ");
        var songName = input.nextLine();

        Artist artist = repository.findByNameIgnoreCase(artistName);

        if (artist == null) {
            System.out.println("Enter the Artist's genre: ");
            var artistGenre = input.nextLine();
            System.out.println("Typo 's' for Solo, 'd' for Duo or 'b' for Band:");
            var artistType = ArtistType.fromString(input.nextLine());

            artist = new Artist(artistName, artistGenre, artistType);
            repository.save(artist);
            System.out.println("\nArtist registered successfully!!");
        }

        Music music = new Music(songName, artist);
        artist.getMusics().add(music);
        repository.save(artist);
        System.out.println("\nMusic registered successfully!!");

    }

    private void listMusic() {

        List<Artist> artists = repository.findAll();

        if(artists.isEmpty()) {
            System.out.println("No musics found!");
        }

        System.out.println("\n");
        artists.forEach(a -> a.getMusics().forEach(m ->
                System.out.println("Artist: " + m.getArtist().getName() + " - Music: " + m.getName())));
    }

    private void findMusicFromArtist() {
    }

    private void searchDataArtist() {
    }

}
