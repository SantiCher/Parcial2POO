public class PartidoGrupo extends Partido {
    public PartidoGrupo(Equipo equipo1, Equipo equipo2) {
        super(equipo1, equipo2);
    }

    @Override
    public void jugarPartido(int goles1, int goles2) {
        this.golesEquipo1 = goles1;
        this.golesEquipo2 = goles2;

        if (goles1 > goles2) {
            equipo1.sumarPuntos(3);
        } else if (goles2 > goles1) {
            equipo2.sumarPuntos(3);
        } else {
            equipo1.sumarPuntos(1);
            equipo2.sumarPuntos(1);
        }
    }
}