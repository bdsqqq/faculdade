/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import classes.Paciente;
import java.sql.*;
import java.util.ArrayList;
import util.Util;

/**
 *
 * @author igor
 */
public class PacienteDAO {

    public String gravarPaciente(Paciente pac) {
        String resp = "";
        try {
            Connection con = Conecta.getConexao();
            String sql = "INSERT INTO pacientes(paciente, nascimento, sexo) ";
            sql += "VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, pac.getPaciente());
            ps.setString(2, Util.formataDataInvertida(pac.getNascimento()));
            ps.setString(3, pac.getSexo());
            ps.execute();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                pac.setCodigo(rs.getInt(1));
            }
            rs.close();
            ps.close();
            con.close();
            resp = "OK";
        } catch (Exception e) {
            resp = "ERRO: " + e.toString();
        }
        return resp;
    }

    public ArrayList<Paciente> listaPacientes() {
        ArrayList<Paciente> lista = new ArrayList<Paciente>();
        try {
            Connection con = Conecta.getConexao();
            String sql = "SELECT * FROM pacientes ORDER BY paciente";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Paciente pac = new Paciente();
                pac.setCodigo(rs.getInt("codigo"));
                pac.setPaciente(rs.getString("paciente"));
                pac.setNascimento(Util.formataData(rs.getString("nascimento")));
                pac.setSexo(rs.getString("sexo"));
                lista.add(pac);
            }
            rs.close();
            ps.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }
}
