package entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
@Table(name = "creators")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Creator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "name")
    String name;
    @Column(name = "email")
    String email;
    @OneToMany(mappedBy = "creator")
    public List<Video> videos;
}
