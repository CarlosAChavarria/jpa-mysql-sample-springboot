package org.generation.jpamysqlsample.repository;

import org.generation.jpamysqlsample.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface UserRepository
    extends CrudRepository<User, Integer>
{
    // capa de datos, interfaz que extiende del Crudrepository con la cual conectamos con al BD
    // creando metodo para buscar usuarios por nombre
    // este es el lugar donde se hacen todas las conversiones.
    ArrayList<User> findByName(String name);
}
