package ribeiro.silveira.vinicius.musicSound.models;

public enum Genre {

    ROCK("rock"),
    FORRO("forró"),
    SERTANEJO("sertanejo"),
    FUNK("funk"),
    PAGODE("pagode"),
    MPG("mpb"),
    REGGAE("reggae");

    private String musicGenre;

    Genre(String musicGenre) {
        this.musicGenre = musicGenre;
    }

    public static Genre fromString(String text) {
        for (Genre genre : Genre.values()) {
            if (genre.musicGenre.equalsIgnoreCase(text)) {
                return genre;
            }
        }
        throw new IllegalArgumentException("No genre found for the inputted string: " + text);
    }

}
