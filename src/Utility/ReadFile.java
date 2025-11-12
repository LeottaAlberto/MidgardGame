package Utility;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;


/**
 *
 * @author alber_ptfreyg
 */
public class ReadFile {

    private static int sizeVet;
    private static ArrayList<String> paroleList;
    private static ArrayList<String> txt;
    private static String testo = "";
    
    public static String getTesto(){
        return testo;
    }
    
    public static String[] readFromFile(int numChar){     
        System.out.println("Entrato");
        
        ArrayList<String> app = new ArrayList<String>();
        paroleList  = new ArrayList<String>();
         
        //File f = new File("/Resource/how_to_play.txt");
//        JFrame fff=new JFrame();
//        fff.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        JFileChooser fd= new JFileChooser("src/Resource");
//        int n=fd.showOpenDialog(fff);
//        if(n!= JFileChooser.APPROVE_OPTION) return null;
            
        File f= new File("src/Resource/how_to_play.txt");
        
        try{
            int numCharNow = 0, cont = 0;
            String line;
            FileReader fr = new FileReader(f);
            BufferedReader in = new BufferedReader(fr);
            
            txt = new ArrayList<String>();

            fr = new FileReader(f);
            in = new BufferedReader(fr);
            sizeVet=0;

            while((line = in.readLine())!=null){
                txt.add(line);
                sizeVet++;  
            }
            
           
            
            while(cont < txt.size()){
                if(txt.get(cont).length() > numChar){
                    int contChar = 0;
                    if(contChar < numChar) contChar++;{
                        String[] help = new String[(int)txt.get(cont).length()/numChar];
                        help = txt.get(cont).split(" ", 2);
                    
                        for(int i = 0; i < help.length; i++) if(help[i] != null)app.add(help[i] + "");
                    }
                    
                }else{
                    app.add(txt.get(cont)+"\n");
                }
                cont++;
            }
        }catch(Exception ex){
            System.out.println("File inesistente oppure non leggibile");
        }
        
        sezionaArrayList(numChar);
        createText(numChar);
        writeToFile(app);

        return null;
    }
    
    public static void writeToFile(ArrayList<String> s){
        try{    
            FileWriter fw =new FileWriter("src/Resource/ris.txt");
            PrintWriter pw=new PrintWriter(fw);
            for(String riga:s){
                pw.println(riga);
            }
            fw.close();
        }catch(Exception ex){
            System.out.println("Errore nella scrittura del file");
        }
            return;
    }
    public static void writeToFile(String s){
        try{    
            FileWriter fw =new FileWriter("src/Resource/ris.txt");
            PrintWriter pw=new PrintWriter(fw);
            pw.println(s);

            fw.close();
        }catch(Exception ex){
            System.out.println("Errore nella scrittura del file");
        }
            return;
    }

    private static void loadTesto(ArrayList<String> arrL){
        for(int i = 0; i < arrL.size(); i++){  
            if(!arrL.get(i).equals("\n"))testo += arrL.get(i) + "\n";
        }        
        writeToFile(testo);
        }
    private static void sezionaArrayList(int numChar){
        
        String app = "";
        for(int i = 0; i < txt.size(); i++){
            if(app.length() < numChar){
                for(int j = 0; j < txt.get(i).length(); j++) {
                    if(txt.get(i).charAt(j) != ' ') app += txt.get(i).charAt(j);
                    else {
                        if(app.length() > numChar - 10) {
                            paroleList.add(app);
                            app = "";
                            break;
                        }
                    }
                }
            }
        }
    }
    private static void createText(int numChar){
        String app = "";

        for(int i = 0; i < txt.size(); i++){
            for(int j = 0; j < txt.get(i).length(); j++){
                if(app.length() < numChar-5){
                    if(txt.get(i).charAt(j) == '|') {
                        app += "\n";
                        testo += app + "\n";
                        app = "";
                    }
                    else if(txt.get(i).charAt(j) != ' ') app += txt.get(i).charAt(j);
                    else{
                        if(app.length() > numChar - 15){
                            testo += app + "\n";
                            app = "";
                        }
                        app += " ";
                    }
                }
            }
        }
    }
}


