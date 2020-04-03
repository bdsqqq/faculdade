package dao;
import java.sql.*;

import classes.Funcionario;

public class FuncionarioDAO {
    
    public String insereFuncionario(Funcionario funcionario){
        String resp = "";
        try {
            Connection con = Conecta.getConexao();
            String sql = "INSERT INTO funcionarios(cpf, nome, salario, sexo)";
            sql += "VALUES(?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, funcionario.getCpf());
            ps.setString(2, funcionario.getNome());
            ps.setFloat(3, funcionario.getSalario());
            ps.setString(4, funcionario.getSexo() + "");
            ps.execute();
            resp = "OK";
            
            ps.close();
            con.close();
        } catch(Exception e){
            resp = "ERRO: " + e.toString();
        }
        
        return resp;
    }
    
    public String alterarFuncionario(Funcionario funcionario){
        String resp = "";
        try {
            Connection con = Conecta.getConexao();
            String sql = "UPDATE funcionarios SET nome=?, salario=?, sexo=? WHERE cpf=?";
            sql += "VALUES(?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, funcionario.getNome());
            ps.setFloat(2, funcionario.getSalario());
            ps.setString(3, funcionario.getSexo() + "");
            ps.setString(4, funcionario.getCpf());
            ps.execute();
            resp = "OK";
            
            ps.close();
            con.close();
        } catch(Exception e){
            resp = "ERRO: " + e.toString();
        }
        
        return resp;
    }
    
    public String excluirFuncionario(Funcionario funcionario){
        String resp = "";
        try {
            Connection con = Conecta.getConexao();
            String sql = "DELETE FROM funcionarios WHERE cpf=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, funcionario.getCpf());
            ps.execute();
            resp = "OK";
            
            ps.close();
            con.close();
        } catch(Exception e){
            resp = "ERRO: " + e.toString();
        }
        
        return resp;
    }
    
     public Funcionario buscaFuncionario(String cpf){
        Funcionario funcionario = new Funcionario();
        
        try {
            Connection con = Conecta.getConexao();
            String sql = "SELECT * FROM funcionarios WHERE cpf=?";
            sql += "VALUES(?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, cpf);
            ps.execute();
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                funcionario.setCpf(rs.getString("cpf"));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setSalario(rs.getFloat("salario"));
                funcionario.setSexo(rs.getString("sexo").charAt(0));
            } else {
                funcionario = null;
            }
            
            rs.close();
            ps.close();
            con.close();
            
        } catch(Exception e){
            funcionario = null;
        }
        
        return funcionario;
    }
}
