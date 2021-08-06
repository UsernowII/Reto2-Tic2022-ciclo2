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
}
