package config;

import entity.Creator;
import entity.Video;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import repository.CreatorRepository;
import repository.VideoRepository;

import java.util.List;
@Configuration
public class DataInitializer {
    @Bean
    CommandLineRunner start(CreatorRepository creatorRepository,
                            VideoRepository videoRepository) {
        return args -> {
            List<Creator> creators = List.of(
                    new Creator(null, "John Doe", "john@example.com", null),
                    new Creator(null, "Jane Smith", "jane@example.com", null)
            );
            for (Creator creator : creators) {
                creatorRepository.saveAll(creators);
            }
//            List<Video> videos = List.of(
//                    new Video(null, "First Video", "http://example.com/video1", "Description of first video", "10-10-2002", creators.get(0)),
//                    new Video(null, "Second Video", "http://example.com/video2", "Description of second video", "16-06-2002", creators.get(1)) );
//            for (Video video : videos) { videoRepository.saveAll(videos); }
        };
    }
}
