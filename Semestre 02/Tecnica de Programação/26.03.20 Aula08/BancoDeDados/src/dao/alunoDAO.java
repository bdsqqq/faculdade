package dao;

import classes.Aluno;
import java.sql.*;

public class AlunoDAO {

    public String gravarAluno(Aluno aluno) {
        String resp = "";
        try {
            Connection con = Conecta.getConexao();
            String sql = "INSERT INTO dados(rgm, nome, nota1, nota2) ";
            sql += "VALUES (?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, aluno.getRGM());
            ps.setString(2, aluno.getNome());
            ps.setFloat(3, aluno.getNota1());
            ps.setFloat(4, aluno.getNota2());
            ps.execute();
            ps.close();
            con.close();
            resp = "OK";
        } catch (Exception e) {
            resp = e.toString();
        }
        return resp;
    }
    
    public Aluno getAluno(String rgm) {
        Aluno aluno = new Aluno();
        try {
            Connection con = Conecta.getConexao();
            String sql = "SELECT * FROM dados WHERE rgm=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, rgm);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                aluno.setNome(rs.getString("nome"));
                aluno.setRGM(rs.getString("rgm"));
                aluno.setNota1(rs.getFloat("nota1"));
                aluno.setNota2(rs.getFloat("nota2"));
            } else {
                aluno = null;
            }
            rs.close();
            ps.close();
            con.close();
        } catch (Exception e) {
            aluno = null;
        }
        return aluno;
    }
    
    public String alterarAluno(Aluno aluno){
        String resp = "";
        try {
            Connection con = Conecta.getConexao();
            String sql = "UPDATE dados SET nome=?, nota1=?, nota2=? WHERE rgm=?";
            sql += "VALUES(?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, aluno.getNome());
            ps.setFloat(2, aluno.getNota1());
            ps.setFloat(3, aluno.getNota2());
            ps.setString(4, aluno.getRGM());
            ps.execute();
            resp = "OK";
            
            ps.close();
            con.close();
        } catch(Exception e){
            resp = "ERRO: " + e.toString();
        }
        
        return resp;
    }
    
    public String excluirAluno(Aluno aluno){
        String resp = "";
        try {
            Connection con = Conecta.getConexao();
            String sql = "DELETE FROM dados WHERE rgm=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, aluno.getRGM());
            ps.execute();
            resp = "OK";
            
            ps.close();
            con.close();
        } catch(Exception e){
            resp = "ERRO: " + e.toString();
        }
        
        return resp;
    }
}
