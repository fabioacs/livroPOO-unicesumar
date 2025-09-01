package Tema3.Exemplo;

public class Consulta {
    private String data;
    private String horario;
    private Paciente paciente;
    private Medico medico;

    public Consulta(String data, String horario, Paciente paciente, Medico medico) {
        this.data = data;
        this.horario = horario;
        this.paciente = paciente;
        this.medico = medico;
    }

    public void confirmar() {
        System.out.println("Consulta confirmada com Dr. " + medico.getNome() +
                " para o paciente " + paciente.getNome() +
                " no dia " + data + " às " + horario);
    }
}