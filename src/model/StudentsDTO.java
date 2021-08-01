package model;

import java.util.ArrayList;
//Contiene el arreglo de objetos ( Archivo persistente )
//Contiene el objeto DAO
public class StudentsDTO {


    private ArrayList<Students> studentList;
    private StudentsDAO studentDao;

    /**constructor*/
    public StudentsDTO() {
        studentList = new ArrayList<Students>();
        studentDao = new StudentsDAO();

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
