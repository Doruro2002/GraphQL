package entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Videos")
public class Video {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long Id;
    @Column(name = "nom")
    String name;
    @Column(name = "url")
    String url;
    @Column(name = "description")
    String description;
    @Column(name = "date_published")
    String datePublished;
    @ManyToOne
    @JoinColumn(name = "creator_id")
    private Creator creator;
}
