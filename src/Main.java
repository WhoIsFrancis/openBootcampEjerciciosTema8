public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setEdad(19);
        persona.setNombre("Francisco");
        persona.setTelefono("3515151511");

        System.out.println("Edad: " + persona.getEdad() + "\nNombre: " + persona.getNombre() +
                "\nTelefono: " + persona.getTelefono());
    }
}

class Persona{
    private int edad;
    private String nombre;
    private String telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }
}