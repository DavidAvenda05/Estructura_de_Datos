class Paciente (val nombre: String) {
    private var listaCitas: MutableList<String> = mutableListOf()
    private var listaMedicamentos: MutableList<String> = mutableListOf()

    fun solicitarCita(doctor: Doctor, fecha: String) {
        doctor.asignarCita(this, fecha)
    }

    fun cancelarCita(doctor: Doctor, fecha: String) {
        doctor.cancelarCita(this, fecha)
    }

    fun mirarCitas() {
        println("$nombre tiene las siguientes citas:")
        for (cita in listaCitas) {
            println(cita)
        }
    }

    fun asignarMedicamento(doctor: Doctor, medicamento: String) {
        doctor.asignarMedicamento(this, medicamento)
    }

    fun agregarCita(fecha: String) {
        listaCitas.add(fecha)
    }

    fun quitarCita(fecha: String) {
        listaCitas.remove(fecha)
    }

    fun agregarMedicamento(medicamento: String) {
        listaMedicamentos.add(medicamento)
    }
}

