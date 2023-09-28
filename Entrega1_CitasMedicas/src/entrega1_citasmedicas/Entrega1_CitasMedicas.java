package entrega1_citasmedicas;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class Entrega1_CitasMedicas {

    public static void main(String[] args) {
        Scanner input = new Scanner((System.in));

    //Login Doctor
    JOptionPane.showMessageDialog(null, "Bienvenido al agendamiento de citas médicas");
    String usuarioDoc = JOptionPane.showInputDialog(null, "Ingresar Usuario");
    String contrasenaDoc =JOptionPane.showInputDialog(null, "Ingresar Contraseña");
    
    if (usuarioDoc.equals("drod46303") && contrasenaDoc.equals("1234")){
        JOptionPane.showMessageDialog(null, "Bienvenido al sistema. Doctor(a) David Rodríguez");
    }else if (usuarioDoc.equals("avela89620") && contrasenaDoc.equals("5678")){
        JOptionPane.showMessageDialog(null, "Bienvenido al sistema. Doctor(a) Alejandra Velasquez");
    } else{
        JOptionPane.showMessageDialog(null, "Usuario o Contraseña incorrecta. Intentar de nuevo");
        return;
    }
    
    //Datos del paciente
    JOptionPane.showMessageDialog(null, "Por favor, ingresar los datos del paciente a asignar cita");
    String nombresPaciente = JOptionPane.showInputDialog(null, "Nombres: ");
    String apellidosPaciente = JOptionPane.showInputDialog(null, "Apellidos: ");
    int edadPaciente = Integer.parseInt(JOptionPane.showInputDialog(null, "Edad: "));
    String dirPaciente = JOptionPane.showInputDialog(null, "Dirección: ");
    String telPaciente = JOptionPane.showInputDialog(null, "Numero de télefono: ");
    String correoPaciente = JOptionPane.showInputDialog(null, "Correo: ");
    
    //Mostrar la cita ya asignada, y con cual doctor
    if (usuarioDoc.equals("drod46303")){
        JOptionPane.showMessageDialog(null, "La cita para el paciente " + nombresPaciente + apellidosPaciente + "ha sido programada con el doctor(a) David Rodríguez");    
    }else if (usuarioDoc.equals("avela89620")){
        JOptionPane.showMessageDialog(null, "La cita para el paciente " + nombresPaciente + apellidosPaciente +"ha sido programada con el doctor(a) Alejandra Velasquez");    
    }
    }
    
}