public class Sala {
    private int numero;
    private Pelicula pelicula;
    private boolean[][] butacas;

    Scanner entrada = new Scanner(System.in);

    public Sala(int numero, Pelicula pelicula, int filas, int columnas) {
        this.numero = numero;
        this.pelicula = pelicula;
        this.butacas = new boolean[filas][columnas];
    }


    public boolean reservarButacas(int fila, int columna, String email) {
        if (!butacas[fila][columna]) {
            butacas[fila][columna] = true;
            System.out.println("Asiento reservado para " + email);
            return true;
        }
        System.out.println("El asiento seleccionado está ocupado.");
        return false;
    }


    public int getNumero() {
        return numero;
    }


    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean[][] getButacas() {
        return butacas;
    }


    public void setButacas(boolean[][] butacas) {
        this.butacas = butacas;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }
}
