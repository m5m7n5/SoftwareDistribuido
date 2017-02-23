import java.net.*;
import java.io.*;
import java.util.Locale;

public class Server{
  
  private static int port;
  private static int option;
  
  private int clientChips;
  private int serverChips;
  
  private ArrayList<String> clientHand;
  private ArrayList<String> serverHand;
  
  private enum RecivedActions{
    STRT,
    ANOK,
    QUIT,
    BET_,
    PASS,
    CALL,
    FOLD,
    RISE,
    DRAW;
  }
  
  
  public static void main(String[] args) {
    
    //Check if args exist
    if( args == null || args.length==0 ){
      port=1234;
    
    }else{
      int i;
      //Switch para tratar los argumentos pasados por parametro
      for(i=0;i<args.length;i+=2){
      switch(args[i]){
	case "-p":
	  port=Integer.parseInt(args[i+1]);
	case "-i":
	  option=Integer.parseInt(args[i+1]);
	}
      }
    
    } 
    System.out.println(port);
    System.out.println(option);
  }

}