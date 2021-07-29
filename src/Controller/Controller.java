package Controller;

import Model.StudentsDTO;
import View.View;

public class Controller {

    private View view;
    private StudentsDTO instituto;

    public Controller(){
        view = new View();
        instituto = new StudentsDTO();
        funcionar();
    }

    public void funcionar(){
        int opcion = 0;
        int c = 0;
        int e = 0;

        String menu ="INSTITUTO LA FLORESTA\n" +
                     "1.Ingresar Estudiante\n" +
                     "2.Ingresar Estudiante\n" +
                     "3.Ingresar Estudiante\n" +
                     "4.Ingresar Estudiante\n" +
                     "5.Ingresar Estudiante\n" +
                     "6.Salir\n" +
                     "Opcion: ";

        do {
            opcion = View.leerDatoEntero(menu);
            switch (opcion){
                case 1:
                    ingresarEstudiante();
                    break;
                case 2:
                    buscarEstudiante();
                    break;
                case 3:
                    modificarEstudiante();
                    break;
                case 4:
                    eliminarEstudiante();
                    break;
                case 5:
                    mostrarDirectorio();
                    break;
                case 6:
                    view.mostrarInformacion("\n Hasta pronto");
                default:
                    view.mostrarInformacion("\n Error: Opcion no valida");
            }
        }while(opcion !=6);
    }

    public void ingresarEstudiante()
}
