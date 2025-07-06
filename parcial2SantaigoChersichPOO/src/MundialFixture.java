import java.util.*;

public class MundialFixture {
    public static void main(String[] args) {
        List<Grupo> grupos = new ArrayList<>();
List<Equipo> GrupoAEquipos = Arrays.asList(
    new Equipo("Argentina"),
    new Equipo("Brasil"),
    new Equipo("Alemania"),
    new Equipo("Francia")
);
Grupo GrupoA = new Grupo("Grupo A", GrupoAEquipos);
grupos.add(GrupoA);

List<Equipo> GrupoBEquipos = Arrays.asList(
    new Equipo("España"),
    new Equipo("Portugal"),
    new Equipo("Suiza"),
    new Equipo("Polonia")
);
Grupo GrupoB = new Grupo("Grupo B", GrupoBEquipos);
grupos.add(GrupoB);

List<Equipo> GrupoCEquipos = Arrays.asList(
    new Equipo("Inglaterra"),
    new Equipo("Gales"),
    new Equipo("Escocia"),
    new Equipo("Irlanda")
);
Grupo GrupoC = new Grupo("Grupo C", GrupoCEquipos);
grupos.add(GrupoC);

List<Equipo> GrupoDEquipos = Arrays.asList(
    new Equipo("Italia"),
    new Equipo("Holanda"),
    new Equipo("Bélgica"),
    new Equipo("Dinamarca")
);
Grupo GrupoD = new Grupo("Grupo D", GrupoDEquipos);
grupos.add(GrupoD);

List<Equipo> GrupoEEquipos = Arrays.asList(
    new Equipo("Croacia"),
    new Equipo("Serbia"),
    new Equipo("Eslovenia"),
    new Equipo("Hungría")
);
Grupo GrupoE = new Grupo("Grupo E", GrupoEEquipos);
grupos.add(GrupoE);

List<Equipo> GrupoFEquipos = Arrays.asList(
    new Equipo("México"),
    new Equipo("EEUU"),
    new Equipo("Canadá"),
    new Equipo("Costa Rica")
);
Grupo GrupoF = new Grupo("Grupo F", GrupoFEquipos);
grupos.add(GrupoF);

List<Equipo> GrupoGEquipos = Arrays.asList(
    new Equipo("Japón"),
    new Equipo("Corea del Sur"),
    new Equipo("China"),
    new Equipo("Australia")
);
Grupo GrupoG = new Grupo("Grupo G", GrupoGEquipos);
grupos.add(GrupoG);

List<Equipo> GrupoHEquipos = Arrays.asList(
    new Equipo("Marruecos"),
    new Equipo("Senegal"),
    new Equipo("Nigeria"),
    new Equipo("Camerún")
);
Grupo GrupoH = new Grupo("Grupo H", GrupoHEquipos);
grupos.add(GrupoH);


        List<Equipo> clasificadosTotales = new ArrayList<>();
GrupoA.agregarPartido(new PartidoGrupo(GrupoAEquipos.get(0), GrupoAEquipos.get(1)));
GrupoA.agregarPartido(new PartidoGrupo(GrupoAEquipos.get(2), GrupoAEquipos.get(3)));
GrupoA.partidos.get(0).jugarPartido(2, 1);
GrupoA.partidos.get(1).jugarPartido(0, 3);
GrupoA.mostrarResultados();
clasificadosTotales.addAll(GrupoA.obtenerClasificados());

GrupoB.agregarPartido(new PartidoGrupo(GrupoBEquipos.get(0), GrupoBEquipos.get(1)));
GrupoB.agregarPartido(new PartidoGrupo(GrupoBEquipos.get(2), GrupoBEquipos.get(3)));
GrupoB.partidos.get(0).jugarPartido(2, 1);
GrupoB.partidos.get(1).jugarPartido(0, 3);
GrupoB.mostrarResultados();
clasificadosTotales.addAll(GrupoB.obtenerClasificados());

GrupoC.agregarPartido(new PartidoGrupo(GrupoCEquipos.get(0), GrupoCEquipos.get(1)));
GrupoC.agregarPartido(new PartidoGrupo(GrupoCEquipos.get(2), GrupoCEquipos.get(3)));
GrupoC.partidos.get(0).jugarPartido(2, 1);
GrupoC.partidos.get(1).jugarPartido(0, 3);
GrupoC.mostrarResultados();
clasificadosTotales.addAll(GrupoC.obtenerClasificados());

GrupoD.agregarPartido(new PartidoGrupo(GrupoDEquipos.get(0), GrupoDEquipos.get(1)));
GrupoD.agregarPartido(new PartidoGrupo(GrupoDEquipos.get(2), GrupoDEquipos.get(3)));
GrupoD.partidos.get(0).jugarPartido(2, 1);
GrupoD.partidos.get(1).jugarPartido(0, 3);
GrupoD.mostrarResultados();
clasificadosTotales.addAll(GrupoD.obtenerClasificados());

GrupoE.agregarPartido(new PartidoGrupo(GrupoEEquipos.get(0), GrupoEEquipos.get(1)));
GrupoE.agregarPartido(new PartidoGrupo(GrupoEEquipos.get(2), GrupoEEquipos.get(3)));
GrupoE.partidos.get(0).jugarPartido(2, 1);
GrupoE.partidos.get(1).jugarPartido(0, 3);
GrupoE.mostrarResultados();
clasificadosTotales.addAll(GrupoE.obtenerClasificados());

GrupoF.agregarPartido(new PartidoGrupo(GrupoFEquipos.get(0), GrupoFEquipos.get(1)));
GrupoF.agregarPartido(new PartidoGrupo(GrupoFEquipos.get(2), GrupoFEquipos.get(3)));
GrupoF.partidos.get(0).jugarPartido(2, 1);
GrupoF.partidos.get(1).jugarPartido(0, 3);
GrupoF.mostrarResultados();
clasificadosTotales.addAll(GrupoF.obtenerClasificados());

GrupoG.agregarPartido(new PartidoGrupo(GrupoGEquipos.get(0), GrupoGEquipos.get(1)));
GrupoG.agregarPartido(new PartidoGrupo(GrupoGEquipos.get(2), GrupoGEquipos.get(3)));
GrupoG.partidos.get(0).jugarPartido(2, 1);
GrupoG.partidos.get(1).jugarPartido(0, 3);
GrupoG.mostrarResultados();
clasificadosTotales.addAll(GrupoG.obtenerClasificados());

GrupoH.agregarPartido(new PartidoGrupo(GrupoHEquipos.get(0), GrupoHEquipos.get(1)));
GrupoH.agregarPartido(new PartidoGrupo(GrupoHEquipos.get(2), GrupoHEquipos.get(3)));
GrupoH.partidos.get(0).jugarPartido(2, 1);
GrupoH.partidos.get(1).jugarPartido(0, 3);
GrupoH.mostrarResultados();
clasificadosTotales.addAll(GrupoH.obtenerClasificados());


        
Llave octavos = new Llave("Octavos de final");
for (int i = 0; i < clasificadosTotales.size(); i += 2) {
    PartidoLlave partido = new PartidoLlave(clasificadosTotales.get(i), clasificadosTotales.get(i + 1));
    partido.jugarPartido(2, 1);
    octavos.agregarPartido(partido);
}

System.out.println("\nPasan a Octavos:");
for (Equipo eq : octavos.obtenerGanadores()) {
    System.out.println(eq);
}

    }
}