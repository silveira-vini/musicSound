package ribeiro.silveira.vinicius.musicSound.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ribeiro.silveira.vinicius.musicSound.models.Artist;

public interface Repository extends JpaRepository<Artist, Long> {

   Artist findByName(String artistName);
}