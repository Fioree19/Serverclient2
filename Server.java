import java.io.*;
import java.net.*;

public class Client {
  public static void main(String[] args) {
  
    int port= 2000;
    String ip= "127.0.0.1";
    BufferedReader in= null;
    PrintStream out= null;
    
    try{
        //apriamo un socket specificando indirizzo IP e numero di porta del server

      //All’indirizzo e numero di porta specificati è importante checi sia in ascolto un processo server
      Socket socket= new Socket(ip, port);
      
      socket.close();
      //chiudiamo la connessione
    }catch(IOException ioe){
        System.err.println("Eccezione IO");
    }
  }
}