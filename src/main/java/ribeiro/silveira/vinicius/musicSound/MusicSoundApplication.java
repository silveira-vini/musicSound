package ribeiro.silveira.vinicius.musicSound;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ribeiro.silveira.vinicius.musicSound.main.Main;
import ribeiro.silveira.vinicius.musicSound.repository.Repository;

@SpringBootApplication
public class MusicSoundApplication implements CommandLineRunner {

    @Autowired
    private Repository repository;

    public static void main(String[] args) {
        SpringApplication.run(MusicSoundApplication.class, args);
    }

    @Override
    public void run(String... args) {
        try {
            Main main = new Main(repository);
            main.showMenu();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
