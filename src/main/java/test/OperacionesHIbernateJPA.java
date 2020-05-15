package test;

import mx.com.gm.dao.PersonaDAO;

public class OperacionesHIbernateJPA {
    public static void main(String[] args) {
        PersonaDAO personaDao = new PersonaDAO();
        personaDao.listar();
    }
           
}
