class Usuario {
    String nombre;
    Perfil perfil; // Campo de referencia
}

class Perfil {
    String rol;
}

public class DiagnosticoNPE {
    public static void main(String[] args) {
        Usuario usr = new Usuario();
        usr.nombre = "Elena";

        //usr.perfil = new Perfil();
        //usr.perfil.rol = "jefe";

        if (usr.perfil != null && usr.perfil.rol != null ) {
            // ¿Qué ocurrirá en la siguiente línea?
            System.out.println("Rol del usuario: " + usr.perfil.rol.toUpperCase());
        } else {
            System.out.println("El usuario no tinen perfil o rol");
        }
        // ¿Qué ocurrirá en la siguiente línea?
    }
}

