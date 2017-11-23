/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diegosampaio.dal;
// importa java sql para dentro da class
import java.sql.*;
/**
 *
 * @author Diego Sampaio
 */
public class ModuloConexao {
    // método respnsável por estabelecer a conexão com o banco
    // Connection = extensão da class java.sql
    // conector = nome do método
    public static Connection conector(){
        
        // criando variavel para estabelecer conexão com o BD
        java.sql.Connection conexao = null;
        // chama o driver mysql
        String driver = "com.mysql.jdbc.Driver";
        
        // Armazenando informações referente ao BD
        String url = "jdbc:mysql://localhost:3306/cursos_java_sisos"; // host + nome do banco
        String user = "root"; // usuário do BD
        String password = ""; // senha do BD
        
        // Estabelecendo a conexão com o BD
        try {
            Class.forName(driver); // executa o arquivo do driver
            conexao = DriverManager.getConnection(url, user,password); // executa a conexao com o BD
            
            return conexao;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
        
    }
}
