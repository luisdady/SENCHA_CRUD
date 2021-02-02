/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO_DAO;

/**
 *
 * @author USUARIO1
 */
import CONEXION_BD.Conexion;
import INTERFACES.ICursoDAO;
import MODELO_DTO.Cursos_DTO;
import java.sql.Connection;

import java.sql.PreparedStatement;

import java.sql.ResultSet;

import java.util.ArrayList;
public class CursosDAO implements ICursoDAO {
private Connection con;
 Conexion cn=new Conexion();
    private PreparedStatement ps;

    private ResultSet rs;
 
    @Override
    public ArrayList<Cursos_DTO> listarCursos() throws Exception {
    String query = "select *from tb_persona";

        con=cn.getConnection();

        ps = con.prepareStatement(query);

        rs = ps.executeQuery();

        ArrayList<Cursos_DTO> cursos = new ArrayList<Cursos_DTO>();

        while (rs.next()) {

            Cursos_DTO dto = new Cursos_DTO();

            int id = rs.getInt("id");

            int Cedula = Integer.parseInt(rs.getString("Cedula"));

            String Nombre = rs.getString("Nombre");

        
            dto.setId(id);

            dto.setCedula(Cedula);

            dto.setNombre(Nombre);

         

            cursos.add(dto);
 
        }

        return cursos;

    }
    
    
}
