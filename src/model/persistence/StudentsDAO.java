package model.persistence;

import model.Students;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

//Acceso al CRUD
public class StudentsDAO {
    /**Atributos*/
    private Archive archive;

    /**Constructor para inicializar el archivo
     * poder usar las propiedad de la clase archivo
     * @param archive archivo
     **/
    public StudentsDAO(Archive archive){
        this.archive = archive;
    }

    /**
     * Método para leer un archivo , se almacena en un array list
     *
     * @param file  una archivo binario <ruta>
     * @return Objetos leídos en formato string
     */
    public String showStudent(File file){
        ArrayList<Students>studentList = archive.readFile(file);
        String list = "";
        for (Students student:studentList) {
            list = list.concat(student.toString() + "\n");
        }return  list;
    }

    /**
     * Método para buscar un objeto en la lista
     *
     * @param email identificador para hacer la búsqueda dentro de la lista
     * @param studentsList  una lista de objetos
     * @return Objeto si lo encuentra.
     */
    public Students searchStudent(String email, ArrayList<Students>studentsList){
        Students found = null;

        if (!studentsList.isEmpty()){
            for (Students student : studentsList) {
                if (student.getInstitutionalEmail().equals(email)){
                    found = student;
                }
            }
        }
        return found;
    }

    /**
     * Método para agregar un objeto en la lista
     *
     * Todos los atributos de la Clase Students como parámetros
     * @param studentsList Una lista con los objetos de la clase Students
     * @param file archivo persistente
     * @return True si lo agrega o false en caso contrario.
     */
    public boolean addStudent(String name, String lastName, String dataOfBirth,
                      String institutionalEmail, String personalEmail, long phoneNumberCell,
                              long phoneNumber, String academicProgram, ArrayList<Students>studentsList, File file) {

        Students studentNew = new Students(name, lastName, dataOfBirth, institutionalEmail, personalEmail, phoneNumberCell, phoneNumber, academicProgram);

        if (searchStudent(institutionalEmail, studentsList) == null) {
            studentsList.add(studentNew);
            archive.writeFile(studentsList, file);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Método para borrar un objeto en la lista
     *
     * @param email Correo institucional como identificador
     * @param studentsList Una lista con los objetos de la clase Students
     * @return True si lo agrega o false en caso contrario.
     */
    public boolean deleteStudent(String email, ArrayList<Students>studentsList, File file){
        Students delete = searchStudent(email, studentsList);
        try{
            if (delete != null){
                studentsList.remove(delete);
                file.delete();
                file.createNewFile();
                archive.writeFile(studentsList, file);
                return true;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } return false;
    }

    public boolean modifyStudent(String name, String lastName, String dataOfBirth, String institutionalEmail,
                                  String personalEmail, long phoneNumberCell, long phoneNumber, String academicProgram,
                                 ArrayList<Students> studentList, File file) {

        Students found = searchStudent(institutionalEmail, studentList);
        try {
            if (found != null) {
                deleteStudent(institutionalEmail, studentList, file);
                found.setPersonalEmail(personalEmail);
                found.setPhoneNumber(phoneNumber);
                found.setPhoneNumberCell(phoneNumberCell);
                found.setAcademicProgram(academicProgram);
                studentList.add(found);
                file.delete();
                file.createNewFile();
                archive.writeFile(studentList, file);
                return true;
            } else {
                return false;
            }
        } catch (IOException ex) {
            ex.printStackTrace();
            return false;
        }
    }

}

