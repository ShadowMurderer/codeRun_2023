package ro.cognizant.coderun2023.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@Entity
@AllArgsConstructor
@ToString
public class BookAuth implements Serializable {

    @Getter
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    @Column(nullable = false,updatable = false,name="id")
    private Long id;

    @Getter
    @Setter
    private String bookName;
    @Getter
    @Setter
    private String author;
    @Getter
    @Setter
    private String publisher;

}
