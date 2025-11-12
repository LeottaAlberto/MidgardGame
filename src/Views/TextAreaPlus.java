package Views;

import java.util.ArrayList;

public class TextAreaPlus{
    private int nRowsVisible;
    private ArrayList<String> rows; 
    private String[] visible;
    
    int index=0;
    //Costruttore
    public TextAreaPlus(int nRowsVisible){
        this.nRowsVisible = nRowsVisible;
        this.visible = new String[nRowsVisible];
        this.rows = new ArrayList<String>();
    }    
    //Getter
    public int getnRowsVisible(){
        return this.nRowsVisible;
    }
    public ArrayList getRows(){
        return this.rows;
    }
    //Setter
    public void setRowsVisible(int newNumRows){
        if(newNumRows > 0) this.nRowsVisible = newNumRows;
    }
    
    /**
     * aggiungi del testo al vettore e all'arrayList
     * @param txtAdd string da aggiungere
     */
    public void add(String txtAdd){
        String[] apps;
        if(!this.rows.isEmpty()) {
            apps = new String[this.rows.size()-1];
            this.rows.add(txtAdd);
            for (int i = 0; i < visible.length; i++) {
                if(this.visible[i]==null){
                    this.visible[i] = txtAdd;
                    return;
                }
                else if(this.visible[this.visible.length-1]!=null){

                    for (int j = 1; j < this.visible.length; j++) apps[j-1]=this.visible[j];

                    for (int j = 0; j < this.visible.length; j++) {
                        if(j<this.visible.length-1) this.visible[j]=apps[j];
                        else this.visible[j] = txtAdd;
                    }
                    return;
                }
            }
        }
        this.visible[0] = txtAdd;
        this.rows.add(txtAdd);
    }
    
    public void add(int txtAdd){
        add(String.valueOf(txtAdd));
    }
    
    public void add(double txtAdd){
        add(String.valueOf(txtAdd));
    }
    
    /**
     * riempie una variabile app con il contenuto del vettore
     * @return variabile app
     */
    public String textRows(){

        String app = "";        

        for (var visible1 : this.visible) {
            if (visible1 == null) continue;
            app = app + (visible1 + "\n");
        } 
        return app;
    }
    /**
     * riempie una variabile app con il contenuto dell'arrayList
     * @return variabile app
     */
    public String allCellRows(){
        String app = "";
        for (int i = 0; i < this.rows.size(); i++) {
            app = app.concat(rows.get(i) + "\n");
        }
        return app;
    }
}
