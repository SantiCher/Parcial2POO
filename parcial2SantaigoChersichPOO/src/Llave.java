import java.util.*;

public class Llave {
    private String nombre;
    private List<PartidoLlave> partidos;

    public Llave(String nombre) {
        this.nombre = nombre;
        this.partidos = new ArrayList<>();
    }

    public void agregarPartido(PartidoLlave partido) {
        partidos.add(partido);
    }

    public List<Equipo> obtenerGanadores() {
        List<Equipo> ganadores = new ArrayList<>();
        for (PartidoLlave p : partidos) {
            ganadores.add(p.getGanador());
        }
        return ganadores;
    }
}