package ribeiro.silveira.vinicius.musicSound.models;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import java.util.List;

public class Artist {
    private String name;
    @Enumerated(EnumType.STRING)
    private Genre genre;
    private List<Music> musics;

    public Artist(String name, Genre genre, List<Music> musics) {
        this.name = name;
        this.genre = Genre.valueOf(String.valueOf(Genre.fromString()));
        this.musics = musics;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public List<Music> getMusics() {
        return musics;
    }

    public void setMusics(List<Music> musics) {
        this.musics = musics;
    }
}

