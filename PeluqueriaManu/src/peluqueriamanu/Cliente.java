package peluqueriamanu;

import java.time.LocalDate;
import java.util.Objects;

class Cliente implements Comparable<Cliente>{
    
    private int id;
    private String name;
    private String lastname;
    private int edad;
    private LocalDate fechaCumpleaños;
    private Long telefono;

    public Cliente(int id, String name, String lastname, int edad, LocalDate fechaCumpleaños, Long telefono) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.edad = edad;
        this.fechaCumpleaños = fechaCumpleaños;
        this.telefono = telefono;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
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
        return fechaCumpleaños;
    }
    public void setFechaCumpleaños(LocalDate fechaCumpleaños) {
        this.fechaCumpleaños = fechaCumpleaños;
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
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", edad=" + edad +
                ", fechaCumpleaños=" + fechaCumpleaños +
                ", telefono=" + telefono +
                '}';
    }

    
    @Override
    public int compareTo(Cliente otroCliente) {
        int result = this.id - otroCliente.id;
        if (result != 0) {
            return result;
        }
        result = this.name.compareTo(otroCliente.name);
        if (result != 0) {
            return result;
        }
        return this.lastname.compareTo(otroCliente.lastname);
    }

    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Cliente cliente = (Cliente) obj;
        return id == cliente.id &&
               name.equals(cliente.name) &&
               lastname.equals(cliente.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, lastname);
    }

    
    
}
