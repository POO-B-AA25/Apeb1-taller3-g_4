public class Problema3_InstitucionesEducativas_Clase {
    public String nombre;
    public String tipoInstitucion;
    public int numeroAlumnos;
    public int numeroDocentes;
    public int numeroSedes;
    public double gastoPorEstudiante;
    public double presupuesto;

    // Constructor vacío
    public Problema3_InstitucionesEducativas_Clase() {
    }

    // Constructor con parámetros
    public Problema3_InstitucionesEducativas_Clase(String nombre, String tipoInstitucion, int numeroAlumnos, int numeroDocentes, int numeroSedes, double gastoPorEstudiante) {
        this.nombre = nombre;
        this.tipoInstitucion = tipoInstitucion;
        this.numeroAlumnos = numeroAlumnos;
        this.numeroDocentes = numeroDocentes;
        this.numeroSedes = numeroSedes;
        this.gastoPorEstudiante = gastoPorEstudiante;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipoInstitucion(String tipoInstitucion) {
        this.tipoInstitucion = tipoInstitucion;
    }

    public void setNumeroAlumnos(int numeroAlumnos) {
        this.numeroAlumnos = numeroAlumnos;
    }

    public void setNumeroDocentes(int numeroDocentes) {
        this.numeroDocentes = numeroDocentes;
    }

    public void setNumeroSedes(int numeroSedes) {
        this.numeroSedes = numeroSedes;
    }

    public void setGastoPorEstudiante(double gastoPorEstudiante) {
        this.gastoPorEstudiante = gastoPorEstudiante;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getTipoInstitucion() {
        return tipoInstitucion;
    }

    public int getNumeroAlumnos() {
        return numeroAlumnos;
    }

    public int getNumeroDocentes() {
        return numeroDocentes;
    }

    public int getNumeroSedes() {
        return numeroSedes;
    }

    public double getGastoPorEstudiante() {
        return gastoPorEstudiante;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    // Método para calcular presupuesto
    public void calcularPresupuesto() {
        presupuesto = numeroAlumnos * gastoPorEstudiante;
    }

    // Método toString para imprimir todos los datos
    @Override
    public String toString() {
        return "Nombre de la Institución: " + nombre +
               "\nTipo de Institución: " + tipoInstitucion +
               "\nNúmero de Alumnos: " + numeroAlumnos +
               "\nNúmero de Docentes: " + numeroDocentes +
               "\nNúmero de Sedes: " + numeroSedes +
               "\nGasto Proyectado por Estudiante: $" + gastoPorEstudiante +
               "\nPresupuesto Total: $" + presupuesto;
    }
}
