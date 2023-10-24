class Doctor (val nombre: String) {
    private var listaPacientes: MutableList<Paciente> = mutableListOf()

    fun agregarPaciente(paciente: Paciente) {
        listaPacientes.add(paciente)
    }

    fun asignarCita(paciente: Paciente, fecha: String) {
        paciente.agregarCita("$nombre le asignó una cita para el $fecha")
    }

    fun cancelarCita(paciente: Paciente, fecha: String) {
        paciente.quitarCita("$nombre canceló su cita del $fecha")
    }

    fun asignarMedicamento(paciente: Paciente, medicamento: String) {
        paciente.agregarMedicamento("Recetado por $nombre: $medicamento")
    }

}

