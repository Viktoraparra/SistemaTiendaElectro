package ar.org.centro8.curso.java.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author viksdrago
 */
@Entity
@Table(name = "Almacen")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Almacen.findAll", query = "SELECT a FROM Almacen a"),
    @NamedQuery(name = "Almacen.findByCodigo", query = "SELECT a FROM Almacen a WHERE a.codigo = :codigo"),
    @NamedQuery(name = "Almacen.findByMarca", query = "SELECT a FROM Almacen a WHERE a.marca = :marca"),
    @NamedQuery(name = "Almacen.findByCategoriaId", query = "SELECT a FROM Almacen a WHERE a.categoriaId = :categoriaId"),
    @NamedQuery(name = "Almacen.findByDescripcion", query = "SELECT a FROM Almacen a WHERE a.descripcion = :descripcion"),
    @NamedQuery(name = "Almacen.findByStock", query = "SELECT a FROM Almacen a WHERE a.stock = :stock")})
public class Almacen implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Codigo")
    private Integer codigo;
    @Basic(optional = false)
    @Column(name = "Marca")
    private String marca;
    @Column(name = "CategoriaId")
    private String categoriaId;
    @Basic(optional = false)
    @Column(name = "Descripcion")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "Stock")
    private int stock;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAlmacen", fetch = FetchType.LAZY)
    private List<Producto> productoList;

    public Almacen() {
    }

    public Almacen(Integer codigo) {
        this.codigo = codigo;
    }

    public Almacen(Integer codigo, String marca, String descripcion, int stock) {
        this.codigo = codigo;
        this.marca = marca;
        this.descripcion = descripcion;
        this.stock = stock;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(String categoriaId) {
        this.categoriaId = categoriaId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @XmlTransient
    public List<Producto> getProductoList() {
        return productoList;
    }

    public void setProductoList(List<Producto> productoList) {
        this.productoList = productoList;
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
        if (!(object instanceof Almacen)) {
            return false;
        }
        Almacen other = (Almacen) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return codigo + ", " + marca + ", " + categoriaId + ", " + descripcion + ", " + stock + ", " + productoList;
    }

        
}
