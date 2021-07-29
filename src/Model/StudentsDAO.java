package Model;

import java.util.ArrayList;

public class StudentsDAO {

    public String verEstudiante(ArrayList<Students>student){
        String texto = "";
        for (int i = 0; i < student.size(); i++) {
            texto = texto.concat(student.get(i)+ "\n");
        }
        return  texto;
    }

    public student buscarEstudiante(String correo, ArrayList<Students>student){
        student encontrado = null;

        if (!student.isEmpty()){
            for (int k = 0; k < student.size(); k++) {
    //            if (student.get(k).getemail);
                    student = student.get(k)
            }
        }
        return encontrado;
    }


}
