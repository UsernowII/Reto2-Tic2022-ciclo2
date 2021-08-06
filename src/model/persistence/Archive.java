package model.persistence;

import model.Students;

import java.io.*;
import java.util.ArrayList;

/**
 * Clase encargada de definir el archivo y metodos de lectura y escritura
 * @author Jhon Erick Santos
 * @version 1.0
 */
public class Archive {

    private ObjectInputStream input;
    private ObjectOutputStream output;

    /**Metodo Constructor para crear el objeto de clase File <ruta> */
    public Archive(File archive){
        if(!archive.exists()){
            try {
                archive.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Método para escribir datos de una lista en un archivo persistente
     *
     * @param archive ruta del archivo persistente
     * @param studentList  una lista de objetos
     */
    public void writeFile (ArrayList<Students>studentList, File archive){
        try {
            output = new ObjectOutputStream(new FileOutputStream(archive));
            output.writeObject(studentList);
            output.close();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    /**
     * Método para escribir leer datos de archivo persistente y los guarda en una lista
     *
     * @param archive ruta del archivo persistentes
     * @return studentList lectura del archivo
     */
    public ArrayList<Students> readFile (File archive ) {
        ArrayList<Students> studentList = new ArrayList<>();
        if (archive.length() != 0) {
            try {
                input = new ObjectInputStream(new FileInputStream(archive));
                studentList = (ArrayList<Students>) input.readObject();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return studentList;
    }

    // Getter and Setter

    public ObjectInputStream getInput() {
        return input;
    }

    public void setInput(ObjectInputStream input) {
        this.input = input;
    }

    public ObjectOutputStream getOutput() {
        return output;
    }

    public void setOutput(ObjectOutputStream output) {
        this.output = output;
    }
}
