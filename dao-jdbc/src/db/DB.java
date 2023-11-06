package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DB {

    //Cria um objeto do Tipo Connection da JDBC e instancia ele Null
    private static Connection conn = null;

    //Cria um metodo que retorna um objeto Connection, vai estar com uma conexão
    public static Connection getConnection() {
        //Testa se o objeto está vazio, se já tem uma conexão
        if (conn == null) {
            //Se estiver vazio, vai tentar os seguintes comandos
            try {
                //Cria Um objeto do tipo Properties e carrega ele com o retorno do metodo loadProperty()
                Properties props = loadProperties();
                // Armazena a propriedade dburl em uma string pra facilitar o entendimento
                String url = props.getProperty("dburl");
                //O DriverManager usa o metodo recebendo a url e os dados de entrada para acessar o banco de dados
                //e armazena no objeto conn e o retorna
                conn = DriverManager.getConnection(url, props);
            }
            catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
        return conn;
    }

    //Testa se existe uma conexão, se sim, a fecha.
    public static void closeConnection() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }

    //Cria um metodo que retorna um objeto Properties
    private static Properties loadProperties() {
        // Cria Um objeto FileInputStrem que vai receber o db.properties e armazenar seus valores em forma de bytes
        try (FileInputStream fs = new FileInputStream("db.properties")) {
            Properties props = new Properties();
            //O objeto props do tipo Properties carrega o objeto com os valores em bytes e os armazena
            props.load(fs);
            return props;
        }
        catch (IOException e) {
            throw new DbException(e.getMessage());
        }
    }
}