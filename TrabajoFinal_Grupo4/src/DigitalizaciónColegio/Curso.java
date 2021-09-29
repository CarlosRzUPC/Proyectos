package DigitalizaciónColegio;

    public abstract class Curso {

        private String codigo;
        private String nombre;
        private String seccion;
        private String coordinador;

        public Curso(String codigo, String nombre, String seccion, String coordinador) {
            this.codigo = codigo;
            this.nombre = nombre;
            this.seccion = seccion;
            this.coordinador = coordinador;
        }




    }
