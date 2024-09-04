package application.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "pessoas")
public class Pessoa {
    private long id;
    private String nome; 
    private int idade;
}
