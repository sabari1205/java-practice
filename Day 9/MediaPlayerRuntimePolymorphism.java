public class MediaPlayerRuntimePolymorphism {
    public static void main(String[] args) {
        System.out.println("=== Media Player Runtime Polymorphism Demo ===");
        
        MediaFile[] playlist = {
            new AudioFile("Bohemian Rhapsody.mp3", 354, 320),
            new VideoFile("Inception Trailer.mp4", 150, "1080p"),
            new PodcastFile("Tech Talk Ep 42.rss", 2700, "Lex Fridman")
        };

        for (MediaFile media : playlist) {
            media.play(); // Runtime polymorphism resolves to specific media type
            media.pause();
            System.out.println("----------------------------------------");
        }
    }
}

abstract class MediaFile {
    protected String fileName;
    protected int durationSeconds;

    public MediaFile(String fileName, int durationSeconds) {
        this.fileName = fileName;
        this.durationSeconds = durationSeconds;
    }

    public abstract void play();
    
    public void pause() {
        System.out.println("[Media] Paused playback of: " + fileName);
    }
}

class AudioFile extends MediaFile {
    private int bitrateKbps;

    public AudioFile(String fileName, int durationSeconds, int bitrateKbps) {
        super(fileName, durationSeconds);
        this.bitrateKbps = bitrateKbps;
    }

    @Override
    public void play() {
        System.out.printf("[Audio Player] Playing MP3: %s (%d sec) at %d kbps high-res audio.%n", fileName, durationSeconds, bitrateKbps);
    }
}

class VideoFile extends MediaFile {
    private String resolution;

    public VideoFile(String fileName, int durationSeconds, String resolution) {
        super(fileName, durationSeconds);
        this.resolution = resolution;
    }

    @Override
    public void play() {
        System.out.printf("[Video Player] Rendering Video: %s (%d sec) in crisp %s resolution.%n", fileName, durationSeconds, resolution);
    }
}

class PodcastFile extends MediaFile {
    private String host;

    public PodcastFile(String fileName, int durationSeconds, String host) {
        super(fileName, durationSeconds);
        this.host = host;
    }

    @Override
    public void play() {
        System.out.printf("[Podcast Player] Streaming Podcast: %s hosted by %s (%d sec).%n", fileName, host, durationSeconds);
    }
}
