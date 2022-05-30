package com.example.jpa.demo;

import org.springframework.data.jpa.repository.JpaRepository;
                                            // Va a trabajar con la entidad Usuario y el indice es tipo string @Id
public interface UsuarioRepositorio extends JpaRepository<Usuario,String> {


}


