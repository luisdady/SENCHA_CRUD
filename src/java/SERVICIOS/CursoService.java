/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SERVICIOS;
import java.util.ArrayList;
import INTERFACES.ICursoDAO;
import MODELO_DAO.CursosDAO;
import MODELO_DTO.Cursos_DTO;

/**
 *
 * @author USUARIO1
 */
public class CursoService implements ICursoService {
    private ICursoDAO cursoDAO= new CursosDAO();
 
    public ArrayList<Cursos_DTO> listarCursos() throws Exception {

        

        return cursoDAO.listarCursos();

    }
}
