package dao;

import classes.Eleitor;
import com.mysql.cj.xdevapi.Result;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EleitorDAO {

    public String insereEleitor(Eleitor eleitor) {
        String resp = "";

        try {
            Connection con = Conecta.getConexao();
            String sql = "INSERT INTO eleitor(titulo, nome)";
            sql += "VALUES(?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, eleitor.getTitulo());
            ps.setString(2, eleitor.getNome());
            ps.execute();

            ps.close();

            con.close();

            resp = "OK";

        } catch (Exception e) {
            resp = "ERROR " + e.toString();
        }

        return resp;
    }

    public int analisaEleitor(String titulo) {
        int resp = 0;
        try {

            Connection con = Conecta.getConexao();
            String sql = "SELECT * FROM eleitor WHERE titulo=?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, titulo);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                if (rs.getString("votou").equals("S")) {
                    resp = 1;
                } else {
                    resp = 2;
                }
            } else {
                resp = 3;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return resp;
    }
    
    public String updateEleitor(Eleitor eleitor){
        String resp = "";
        try {
            Connection con = Conecta.getConexao();
            String sql = "UPDATE eleitor SET votou = 'S' WHERE titulo = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, eleitor.getTitulo());
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
