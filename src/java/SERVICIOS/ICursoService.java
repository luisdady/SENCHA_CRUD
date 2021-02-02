/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SERVICIOS;

/**
 *
 * @author USUARIO1
 */
import MODELO_DTO.Cursos_DTO;
import java.util.ArrayList;
public interface ICursoService {
    ArrayList<Cursos_DTO> listarCursos() throws Exception;
}
