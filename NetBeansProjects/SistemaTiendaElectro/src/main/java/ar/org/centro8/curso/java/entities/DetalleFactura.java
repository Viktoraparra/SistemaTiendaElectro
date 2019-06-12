package ar.org.centro8.curso.java.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author viksdrago
 */
@Entity
@Table(name = "DetalleFacturas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DetalleFactura.findAll", query = "SELECT d FROM DetalleFactura d"),
    @NamedQuery(name = "DetalleFactura.findByCodigo", query = "SELECT d FROM DetalleFactura d WHERE d.codigo = :codigo"),
    @NamedQuery(name = "DetalleFactura.findByCantidad", query = "SELECT d FROM DetalleFactura d WHERE d.cantidad = :cantidad"),
    @NamedQuery(name = "DetalleFactura.findByTotal", query = "SELECT d FROM DetalleFactura d WHERE d.total = :total")})
public class DetalleFactura implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Codigo")
    private Integer codigo;
    @Basic(optional = false)
    @Column(name = "Cantidad")
    private int cantidad;
    @Basic(optional = false)
    @Column(name = "Total")
    private double total;
    @JoinColumn(name = "FacturasId", referencedColumnName = "Codigo")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Factura facturasId;
    @JoinColumn(name = "ProductoId", referencedColumnName = "Codigo")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Producto productoId;

    public DetalleFactura() {
    }

    public DetalleFactura(Integer codigo) {
        this.codigo = codigo;
    }

    public DetalleFactura(Integer codigo, int cantidad, double total) {
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.total = total;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Factura getFacturasId() {
        return facturasId;
    }

    public void setFacturasId(Factura facturasId) {
        this.facturasId = facturasId;
    }

    public Producto getProductoId() {
        return productoId;
    }

    public void setProductoId(Producto productoId) {
        this.productoId = productoId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleFactura)) {
            return false;
        }
        DetalleFactura other = (DetalleFactura) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ar.org.centro8.curso.java.entities.DetalleFactura[ codigo=" + codigo + " ]";
    }
    
}
