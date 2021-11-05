package org.generation.jpamysqlsample.service;

import org.generation.jpamysqlsample.model.User;
import org.generation.jpamysqlsample.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;


@Service
public class UserServiceImpl
    implements UserService
{

    private final UserRepository userRepository;

    public UserServiceImpl( UserRepository userRepository )
    {
        this.userRepository = userRepository;
    }

    @Override
    public User getUser( Integer id )
    {
        Optional<User> user = userRepository.findById( id );
        return user.orElse( null );
    }

    @Override
    public User save( User user )
    {
        return userRepository.save( user );
    }

    @Override
    public void delete( Integer id )
    {
        userRepository.deleteById( id );
    }

    // implementamos el metodo creado en el repositorio con el cual obtendremos el usuario por nombre
    @Override
    public ArrayList<User> findByName(String name) {
        return userRepository.findByName(name);
    }
}
