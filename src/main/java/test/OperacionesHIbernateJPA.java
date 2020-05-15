package test;

import mx.com.gm.dao.PersonaDAO;
import mx.com.gm.domain.Persona;

public class OperacionesHIbernateJPA {

    public static void main(String[] args) {
        PersonaDAO personaDao = new PersonaDAO();
        personaDao.listar();

        Persona persona = new Persona();
        persona.setNombre("Carlos");
        persona.setApellido("Lara");
        persona.setEmail("clara@mail.com");
        persona.setTelefono("65654658");

        personaDao.insertar(persona);

    }

}
