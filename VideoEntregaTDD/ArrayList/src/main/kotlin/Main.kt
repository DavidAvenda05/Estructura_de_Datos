fun main(args: Array<String>) {
    val doctor1 = doctor("Dr. Smith")
    val paciente1 = Paciente("Juan")
    val paciente2 = Paciente("Maria")

    doctor1.agregarPaciente(paciente1)
    doctor1.agregarPaciente(paciente2)

    paciente1.solicitarCita(doctor1, "2023-10-25")
    paciente2.solicitarCita(doctor1, "2023-10-26")

    paciente1.mirarCitas()
    paciente2.mirarCitas()

    paciente1.asignarMedicamento(doctor1, "Ibuprofeno")
    paciente2.asignarMedicamento(doctor1, "Amoxicilina")

    println("Medicamentos de $paciente1:")
    for (medicamento in paciente1.listaMedicamentos) {
        print(medicamento)
    }

    println("Medicamentos de $paciente2:")
    for (medicamento in paciente2.listaMedicamentos) {
        print(medicamento)
    }

}