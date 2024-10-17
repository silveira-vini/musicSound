package ribeiro.silveira.vinicius.musicSound.models;

public enum ArtistType {
    SOLO("s"),
    DUO("d"),
    BAND("b");

    private final String typeArtist;

    ArtistType(String typeArtist) {
        this.typeArtist = typeArtist;
    }

    public static ArtistType fromString(String text) throws IllegalArgumentException {
        for(ArtistType typeArtist1 : ArtistType.values()) {
            if (typeArtist1.typeArtist.equalsIgnoreCase(text)) {
                return typeArtist1;
            }
        }
        throw new IllegalArgumentException("None type of artist founded");
    }
}
