package com.example.carritocompras.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "pedidos")
public class pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Integer id;

    @Column(name = "cantidad")
    private int cantidad;

    @Column(name = "precio")
    private double precio;

    @Column(name = "total")
    private double total;

    @ManyToOne(fetch = FetchType.LAZY)
    private Cliente cliente;


    public pedido() {
    }

    public pedido(Integer id, int cantidad, double precio, double total, com.example.carritocompras.entity.Cliente cliente, product product) {
        this.id = id;
        this.cantidad = cantidad;
        this.precio = precio;
        this.total = total;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    @Override
    public String toString() {
        return "pedido{" +
                "id=" + id +
                ", cantidad=" + cantidad +
                ", precio=" + precio +
                ", total=" + total +
                '}';
    }
}

