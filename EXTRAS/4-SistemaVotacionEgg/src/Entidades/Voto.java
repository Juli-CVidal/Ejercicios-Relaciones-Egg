/*
// Curso Egg FullStack
 */

package Entidades;

// @author JulianCVidal

import java.util.Set;


public class Voto {
    private final Alumno votante;
    private final Set<Alumno> alumnosVotados; //así evito obtener dos veces el mismo alumno

    public Voto(Alumno votante, Set<Alumno> alumnosVotados) {
        this.votante = votante;
        this.alumnosVotados = alumnosVotados;
    }

    public Alumno getVotante() {
        return votante;
    }

    public Set<Alumno> getAlumnosVotados() {
        return alumnosVotados;
    }
    
    
}
