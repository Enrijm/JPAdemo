package com.example.jpa.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity(name="Usuario")
@Data
@AllArgsConstructor // para crear constructor con todas las vbles
@NoArgsConstructor // crear un constructor vacio
public class Usuario {
    @Id // para saber que esta etiqueta va a ser unica, no puede haber dos Ids iguales
    String id;

    String nombreUsuario;
    int edad;
    String ciudad;

}
