package ribeiro.silveira.vinicius.musicSound;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ribeiro.silveira.vinicius.musicSound.main.Main;

@SpringBootApplication
public class MusicSoundApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(MusicSoundApplication.class, args);
    }


    @Override
    public void run(String... args) {

        try {
            Main main = new Main();
            main.showMenu();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
