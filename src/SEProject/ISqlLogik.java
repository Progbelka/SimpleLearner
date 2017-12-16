/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEProject;

import java.sql.SQLException;

/**
 *
 * @author Marcel
 */
public interface ISqlLogik {
    
    public boolean checkAntwort(String blockBez, String aSchueler, String aFrage, String aAntwort) throws SQLException;
    
    public boolean[] checkLogin(String user, String password) throws SQLException;
    
    public void loadLehrer(String lid) throws SQLException;
    
    public void loadSchueler(String sid) throws SQLException;
    
    public void loadBloecke() throws SQLException;
    
    public void loadFragen(String block) throws SQLException;
    
    public void loadAntworten(String block, String frage) throws SQLException;
}
