import java.util.*;

//XML packages
import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;
//

class Word{
    private String WORD;
    private String MEAN;
    public Word(String word, String mean) {
        this.WORD = word;
        this.MEAN = mean;
    }
    public String getWORD() {
        return this.WORD;
    }
    public String getMEAN() {
        return this.MEAN;
    }
    

}

//Dictionary class
public class Dictionary {
    private int MODE; //0: En-Vi , 1: Vi-En
    private String DICT_PATH;

    //Constructor
    public Dictionary(){
    }

    //Function to set a mode which is En-Vi or Vi-En
    public void setMode(int mode) {
        this.MODE = mode;
        if (mode == 0){
            DICT_PATH = "Anh_Viet.xml";
        }
        else if (mode == 1){
            DICT_PATH = "Viet_Anh.xml";
        }
    }

    //Function to find a word with meaning given a word in the dictionary
    public Word findWord(String word) {
        return null;
    }

    //Function to add a new word to the dictionary
    public void addWordToDictionary(String dict){}

}//end class
