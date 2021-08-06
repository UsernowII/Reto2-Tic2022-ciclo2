package model;

import persistence.Archive;
import persistence.StudentsDAO;

import java.io.File;
import java.util.ArrayList;
//Contiene el arreglo de objetos ( Archivo persistente )
//Contiene el objeto DAO
public class StudentsDTO {


    private ArrayList<Students> studentList;
    private StudentsDAO studentDao;
    private File file = new File("data/datos_estudiantes.dat");
    //private File file = new File("C:\\Users\\Usernow\\Documents\\G46_Archivos\\newfile.dat");
    private Archive archive;


    /**constructor*/
    public StudentsDTO() {
        studentList = new ArrayList<Students>();
        archive = new Archive(file);
        studentDao = new StudentsDAO(archive);
        studentList = archive.readFile(file);


    }

    // Getter and Setters
    public ArrayList<Students> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Students> studentList) {
        this.studentList = studentList;
    }

    public StudentsDAO getStudentDao() {
        return studentDao;
    }

    public void setStudentDao(StudentsDAO studentDao) {
        this.studentDao = studentDao;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public Archive getArchive() {
        return archive;
    }

    public void setArchive(Archive archive) {
        this.archive = archive;
    }
}
