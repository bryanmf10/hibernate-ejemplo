package test;

import mx.com.gm.dao.PersonaDAO;
import mx.com.gm.domain.Persona;

public class OperacionesHIbernateJPA {

    public static void main(String[] args) {
        PersonaDAO personaDao = new PersonaDAO();
        personaDao.listar();

        Persona persona = new Persona();
        persona.setIdPersona(4);
        
        persona = personaDao.buscarPersonaPorId(persona);//
        System.out.println("persona encontrada =" + persona);
        persona.setNombre("Juana");
        persona.setApellido("Robles");
        persona.setEmail("jrobles@mail.com");
        //persona.setTelefono("65654658");

        //personaDao.insertar(persona);
        personaDao.modificar(persona);
        personaDao.listar();

    }

}
