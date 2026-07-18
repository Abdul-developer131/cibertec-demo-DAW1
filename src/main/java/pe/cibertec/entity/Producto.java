package pe.cibertec.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name= "productos")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;
    private Double precio;

    @Version //cuando se cree un objeto con los mismos valores la anotacion version los hace "distintos"
    private Integer version;
}
