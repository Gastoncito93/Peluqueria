package peluqueriamanu;

import java.time.LocalDate;

class Cliente implements Comparable<Cliente>{
    
    private String lastname;
    private String name;
    private int edad;
    private LocalDate fechaNacimiento;
    private Long telefono;

    public Cliente(String lastname, String name, int edad, LocalDate fechaNacimiento, Long telefono) {
        this.lastname = lastname;
        this.name = name;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
    }
    
    
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public LocalDate getFechaCumpleaños() {
        return fechaNacimiento;
    }
    public void fechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public Long getTelefono() {
        return telefono;
    }
    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" +
            "lastname='" + lastname + '\'' +
            ", name='" + name + '\'' +
            ", edad=" + edad +
            ", fechaCumpleaños='" + fechaNacimiento + '\'' +
            ", telefono=" + telefono +
            '}';
    }

    
    @Override
public int compareTo(Cliente otroCliente) {
    int result = this.lastname.compareTo(otroCliente.lastname);
    if (result != 0) {
        return result;
    }
    return this.name.compareTo(otroCliente.name);
}

@Override
public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Cliente cliente = (Cliente) obj;
    return lastname.equals(cliente.lastname) &&
           name.equals(cliente.name);
}

    
    
}
