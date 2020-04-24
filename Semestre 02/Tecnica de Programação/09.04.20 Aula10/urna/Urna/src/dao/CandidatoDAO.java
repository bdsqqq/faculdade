
package dao;

import classes.Candidato;
import classes.Eleitor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class CandidatoDAO {
    
    public String insereCandidato(Candidato candidato) {
        String resp = "";

        try {
            Connection con = Conecta.getConexao();
            String sql = "INSERT INTO eleicoes(numero, candidato)";
            sql += "VALUES(?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, candidato.getNumero());
            ps.setString(2, candidato.getCandidato());
            ps.execute();

            ps.close();

            con.close();

            resp = "OK";

        } catch (Exception e) {
            resp = "ERROR " + e.toString();
        }

        return resp;
    }
    
    public Candidato procuraCandidato(int numero) {
        Candidato candidato = new Candidato();
        try {
            Connection con = Conecta.getConexao();
            String sql = "SELECT * FROM eleicoes WHERE numero=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, numero);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                candidato.setNumero(rs.getInt("numero"));
                candidato.setCandidato(rs.getString("candidato"));
                
            } else {
                candidato = null;
            }
            rs.close();
            ps.close();
            con.close();
        } catch (Exception e) {
            candidato = null;
        }
        return candidato;
    }
    
    public ArrayList<Candidato> listaVotos() {
        ArrayList<Candidato> lista = new ArrayList<Candidato>();
        try {
            Connection con = Conecta.getConexao();
            String sql = "SELECT * FROM eleicoes ORDER BY votos";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Candidato candidato = new Candidato();
                candidato.setNumero(rs.getInt("numero"));
                candidato.setCandidato(rs.getString("candidato"));
                candidato.setVotos(rs.getInt("votos"));
                lista.add(candidato);
            }
            rs.close();
            ps.close();
            con.close();
        } catch (Exception e) {
            System.out.println("ERRO: " + e.toString());
        }
        return lista;
    }
    public String updateCandidato(Candidato candidato){
        String resp = "";
        try {
            Connection con = Conecta.getConexao();
            String sql = "UPDATE eleicoes SET votos = votos + 1 WHERE numero = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, candidato.getNumero());
            ps.execute();
            ps.close();
            con.close();
            resp = "OK";
        } catch (Exception e) {
            e.printStackTrace();
            resp = e.toString();
        }
        return resp;
    }
    
}
