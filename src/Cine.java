public class Cine {
    private String nombre;
    private int aforo;
    private ArrayList<Sala> salas;


    public Cine(String nombre, int aforo) {
        this.nombre = nombre;
        this.aforo = aforo;
        this.salas = new ArrayList<>();
    }

    public void agregarSala(Sala sala) {
        salas.add(sala);
    }

    public void mostrarSalas() {
        System.out.println("Salas del cine " + nombre + ":");
        for (int i = 0; i< salas.size() ; i++) {
            System.out.println("Sala: " + salas.get(i).getNumero() + " Pelicula: " + salas.get(i).getPelicula().getTitulo());
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAforo() {
        return aforo;
    }

    public void setAforo(int aforo) {
        this.aforo = aforo;
    }

    public ArrayList<Sala> getSalas() {
        return salas;
    }

    public void setSalas(ArrayList<Sala> salas) {
        this.salas = salas;
    }
}