package com.cr.bms.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;
import javax.validation.constraints.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * 图书
 */
@ApiModel(description = "图书")
@Entity
@Table(name = "book")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Book implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id")
    private Long id;

    /**
     * 书名
     */
    @ApiModelProperty(value = "书名", required = true)
    @NotNull
    @Column(name = "name", nullable = false)
    private String name;

    /**
     * 作者
     */
    @ApiModelProperty(value = "作者", required = true)
    @NotNull
    @Column(name = "author", nullable = false)
    private String author;

    /**
     * 出版社
     */
    @ApiModelProperty(value = "出版社", required = true)
    @NotNull
    @Column(name = "publisher", nullable = false)
    private String publisher;

    /**
     * 版次
     */
    @ApiModelProperty(value = "版次", required = true)
    @NotNull
    @Column(name = "publish_verion", nullable = false)
    private String publishVerion;

    /**
     * 价格
     */
    @ApiModelProperty(value = "价格", required = true)
    @NotNull
    @Column(name = "price", precision = 21, scale = 2, nullable = false)
    private BigDecimal price;

    /**
     * 商品编码
     */
    @ApiModelProperty(value = "商品编码", required = true)
    @NotNull
    @Column(name = "isbn", nullable = false)
    private String isbn;

    /**
     * 备注
     */
    @ApiModelProperty(value = "备注")
    @Column(name = "remark")
    private String remark;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public Book id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public Book name(String name) {
        this.setName(name);
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return this.author;
    }

    public Book author(String author) {
        this.setAuthor(author);
        return this;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return this.publisher;
    }

    public Book publisher(String publisher) {
        this.setPublisher(publisher);
        return this;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublishVerion() {
        return this.publishVerion;
    }

    public Book publishVerion(String publishVerion) {
        this.setPublishVerion(publishVerion);
        return this;
    }

    public void setPublishVerion(String publishVerion) {
        this.publishVerion = publishVerion;
    }

    public BigDecimal getPrice() {
        return this.price;
    }

    public Book price(BigDecimal price) {
        this.setPrice(price);
        return this;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public Book isbn(String isbn) {
        this.setIsbn(isbn);
        return this;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getRemark() {
        return this.remark;
    }

    public Book remark(String remark) {
        this.setRemark(remark);
        return this;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Book)) {
            return false;
        }
        return id != null && id.equals(((Book) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Book{" +
            "id=" + getId() +
            ", name='" + getName() + "'" +
            ", author='" + getAuthor() + "'" +
            ", publisher='" + getPublisher() + "'" +
            ", publishVerion='" + getPublishVerion() + "'" +
            ", price=" + getPrice() +
            ", isbn='" + getIsbn() + "'" +
            ", remark='" + getRemark() + "'" +
            "}";
    }
}
