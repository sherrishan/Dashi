package db;

public class DBUtil {
    private static final String HOSTNAME = "localhost";
    private static final String PORT_NUM = "3306";// change it to your mysql port number //amazon aws
    public static final String DB_NAME = "laiproject";
    private static final String USERNAME = "root"; //amazon aws 
    private static final String PASSWORD = "root";//amazon aws
    public static final String URL = "jdbc:mysql://" + HOSTNAME + ":" + PORT_NUM + "/" + DB_NAME
   			 + "?user=" + USERNAME + "&password=" + PASSWORD + "&autoreconnect=true";
}
