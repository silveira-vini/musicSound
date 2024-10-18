package ribeiro.silveira.vinicius.musicSound.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ribeiro.silveira.vinicius.musicSound.models.Artist;
import ribeiro.silveira.vinicius.musicSound.models.Music;

import java.util.List;

public interface Repository extends JpaRepository<Artist, Long> {

   Artist findByNameIgnoreCase(String artistName);


}