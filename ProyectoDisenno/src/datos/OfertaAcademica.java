package datos;

public class OfertaAcademica {
        
    private Curso curso;
    private int numeroGrupo;
    private Docente docente; 
    private Horario horario;
    private Aula aula; 

    public OfertaAcademica(Curso curso, int numeroGrupo, Docente docente, Horario horario, Aula aula) {
        this.curso = curso;
        this.numeroGrupo = numeroGrupo;
        this.docente = docente;
        this.horario = horario;
        this.aula = aula;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public int getNumeroGrupo() {
        return numeroGrupo;
    }

    public void setNumeroGrupo(int numeroGrupo) {
        this.numeroGrupo = numeroGrupo;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    public Aula getAula() {
        return aula;
    }

    public void setAula(Aula aula) {
        this.aula = aula;
    }            
}
