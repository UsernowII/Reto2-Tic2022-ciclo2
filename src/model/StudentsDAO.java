package model;

import java.util.ArrayList;

//Acceso al CRUD
public class StudentsDAO {
    /**
     * Método para mostrar datos en la lista
     *
     * @param students  una lista de objetos
     * @return Objeto leído en formato string
     */
    public String showStudent(ArrayList<Students>students){
        String list = "";
        for (int i = 0; i < students.size(); i++) {
            list = list.concat(students.get(i)+ "\n");
        }
        return  list;
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
     * @return True si lo agrega o false en caso contrario.
     */
    public boolean addStudent(String name, String lastName, String dataOfBirth,
                      String institutionalEmail, String personalEmail, long phoneNumberCell,
                              long phoneNumber, String academicProgram, ArrayList<Students>studentsList) {

        Students studentNew = new Students(name, lastName, dataOfBirth, institutionalEmail, personalEmail, phoneNumberCell, phoneNumber, academicProgram);

        if (searchStudent(institutionalEmail, studentsList) == null) {
            studentsList.add(studentNew);
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
    public boolean deleteStudent(String email, ArrayList<Students>studentsList){
        Students delete = searchStudent(email, studentsList);
        if (delete != null){
           studentsList.remove(delete);
           return true;
        }else{
            return false;
        }
    }

}

