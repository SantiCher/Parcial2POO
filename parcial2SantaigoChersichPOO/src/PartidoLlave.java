public class PartidoLlave extends Partido {
    private Equipo ganador;

    public PartidoLlave(Equipo equipo1, Equipo equipo2) {
        super(equipo1, equipo2);
    }

    @Override
    public void jugarPartido(int goles1, int goles2) {
        this.golesEquipo1 = goles1;
        this.golesEquipo2 = goles2;
        this.ganador = (goles1 > goles2) ? equipo1 : equipo2;
    }

    public Equipo getGanador() {
        return ganador;
    }
}