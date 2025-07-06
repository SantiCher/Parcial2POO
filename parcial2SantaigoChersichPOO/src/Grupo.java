import java.util.*;

public class Grupo {
    private String nombre;
    private List<Equipo> equipos;
    public List<PartidoGrupo> partidos;

    public Grupo(String nombre, List<Equipo> equipos) {
        this.nombre = nombre;
        this.equipos = equipos;
        this.partidos = new ArrayList<>();
    }

    public void agregarPartido(PartidoGrupo partido) {
        partidos.add(partido);
    }

    public List<Equipo> obtenerClasificados() {
        equipos.sort((e1, e2) -> Integer.compare(e2.getPuntos(), e1.getPuntos()));
        return equipos.subList(0, 2);
    }

    public void mostrarResultados() {
        System.out.println("Resultados del grupo " + nombre + ":");
        for (Equipo e : equipos) {
            System.out.println(e);
        }
    }
}