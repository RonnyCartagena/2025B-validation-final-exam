package com.bezkoder.spring.jpa.h2.model;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tutorials")
public class Tutorial implements Serializable {

  // Es buena práctica añadir un serialVersionUID para evitar advertencias [cite: 10108]
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @Column(name = "title")
  private String title;

  @Column(name = "description")
  private String description;

  @Column(name = "published")
  private boolean published;

  public Tutorial() {
    // Constructor vacío por defecto para JPA [cite: 10039]
  }

  // ... (Resto de getters y setters están bien, pero asegúrate de que no haya lógica compleja aquí)
}