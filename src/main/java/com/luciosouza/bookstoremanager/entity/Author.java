package com.luciosouza.bookstoremanager.entity;
import javax.persistence.Entity;
import javax.persistence.GenerationValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @Column(nullable = false, unique = true)
    private  String name;

    @Column(nullable = false)
    private  Integer age;
}