package Producto;

import java.io.IOException;

public enum Producto {
    LAPIZ("Flex", "Amarillo"){
        @Override
        public String getmostrarUso() {
            return "Lapiz " + getNombre() + ", Color: " + getDescripcion();

        }
    },
    CUADERNO("Scribe", "Azul"){
        @Override
        public String getmostrarUso() {
            return "CUADERNO";
        }
    },
    BORRADOR("Nata", "Rojo"){
        @Override
        public String getmostrarUso() {
            return "BORRADOR";
        }
    },
    SACAPUNTO("Stick", "Gris"){
        @Override
        public String getmostrarUso() {
            return "SACAPUNTA";
        }
    },
    CARTUCHERA("Norma", "Verde"){
        @Override
        public String getmostrarUso() {
            return "CARTUCHERA";
        }
    };

    private String Nombre;
    private String Descripcion;

    Producto(String nombre, String descripcion) {
        Nombre = nombre;
        Descripcion = descripcion;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public abstract String getmostrarUso();

    public void close() throws IOException {
        System.out.println("Close of Enum");
    }

}

class Main {
    public static void main(String[] args) {
        Producto pro = Producto.LAPIZ;
        System.out.println(pro.getmostrarUso());
    }
}
