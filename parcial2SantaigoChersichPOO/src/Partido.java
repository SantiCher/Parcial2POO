public abstract class Partido {
    protected Equipo equipo1;
    protected Equipo equipo2;
    protected int golesEquipo1;
    protected int golesEquipo2;

    public Partido(Equipo equipo1, Equipo equipo2) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
    }

    public abstract void jugarPartido(int goles1, int goles2);
}