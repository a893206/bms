package com.cr.bms.service.criteria;

import java.io.Serializable;
import java.util.Objects;
import tech.jhipster.service.Criteria;
import tech.jhipster.service.filter.BigDecimalFilter;
import tech.jhipster.service.filter.BooleanFilter;
import tech.jhipster.service.filter.DoubleFilter;
import tech.jhipster.service.filter.Filter;
import tech.jhipster.service.filter.FloatFilter;
import tech.jhipster.service.filter.IntegerFilter;
import tech.jhipster.service.filter.LongFilter;
import tech.jhipster.service.filter.StringFilter;

/**
 * Criteria class for the {@link com.cr.bms.domain.Book} entity. This class is used
 * in {@link com.cr.bms.web.rest.BookResource} to receive all the possible filtering options from
 * the Http GET request parameters.
 * For example the following could be a valid request:
 * {@code /books?id.greaterThan=5&attr1.contains=something&attr2.specified=false}
 * As Spring is unable to properly convert the types, unless specific {@link Filter} class are used, we need to use
 * fix type specific filters.
 */
public class BookCriteria implements Serializable, Criteria {

    private static final long serialVersionUID = 1L;

    private LongFilter id;

    private StringFilter name;

    private StringFilter author;

    private StringFilter publisher;

    private StringFilter publishVerion;

    private BigDecimalFilter price;

    private StringFilter isbn;

    private StringFilter remark;

    private Boolean distinct;

    public BookCriteria() {}

    public BookCriteria(BookCriteria other) {
        this.id = other.id == null ? null : other.id.copy();
        this.name = other.name == null ? null : other.name.copy();
        this.author = other.author == null ? null : other.author.copy();
        this.publisher = other.publisher == null ? null : other.publisher.copy();
        this.publishVerion = other.publishVerion == null ? null : other.publishVerion.copy();
        this.price = other.price == null ? null : other.price.copy();
        this.isbn = other.isbn == null ? null : other.isbn.copy();
        this.remark = other.remark == null ? null : other.remark.copy();
        this.distinct = other.distinct;
    }

    @Override
    public BookCriteria copy() {
        return new BookCriteria(this);
    }

    public LongFilter getId() {
        return id;
    }

    public LongFilter id() {
        if (id == null) {
            id = new LongFilter();
        }
        return id;
    }

    public void setId(LongFilter id) {
        this.id = id;
    }

    public StringFilter getName() {
        return name;
    }

    public StringFilter name() {
        if (name == null) {
            name = new StringFilter();
        }
        return name;
    }

    public void setName(StringFilter name) {
        this.name = name;
    }

    public StringFilter getAuthor() {
        return author;
    }

    public StringFilter author() {
        if (author == null) {
            author = new StringFilter();
        }
        return author;
    }

    public void setAuthor(StringFilter author) {
        this.author = author;
    }

    public StringFilter getPublisher() {
        return publisher;
    }

    public StringFilter publisher() {
        if (publisher == null) {
            publisher = new StringFilter();
        }
        return publisher;
    }

    public void setPublisher(StringFilter publisher) {
        this.publisher = publisher;
    }

    public StringFilter getPublishVerion() {
        return publishVerion;
    }

    public StringFilter publishVerion() {
        if (publishVerion == null) {
            publishVerion = new StringFilter();
        }
        return publishVerion;
    }

    public void setPublishVerion(StringFilter publishVerion) {
        this.publishVerion = publishVerion;
    }

    public BigDecimalFilter getPrice() {
        return price;
    }

    public BigDecimalFilter price() {
        if (price == null) {
            price = new BigDecimalFilter();
        }
        return price;
    }

    public void setPrice(BigDecimalFilter price) {
        this.price = price;
    }

    public StringFilter getIsbn() {
        return isbn;
    }

    public StringFilter isbn() {
        if (isbn == null) {
            isbn = new StringFilter();
        }
        return isbn;
    }

    public void setIsbn(StringFilter isbn) {
        this.isbn = isbn;
    }

    public StringFilter getRemark() {
        return remark;
    }

    public StringFilter remark() {
        if (remark == null) {
            remark = new StringFilter();
        }
        return remark;
    }

    public void setRemark(StringFilter remark) {
        this.remark = remark;
    }

    public Boolean getDistinct() {
        return distinct;
    }

    public void setDistinct(Boolean distinct) {
        this.distinct = distinct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final BookCriteria that = (BookCriteria) o;
        return (
            Objects.equals(id, that.id) &&
            Objects.equals(name, that.name) &&
            Objects.equals(author, that.author) &&
            Objects.equals(publisher, that.publisher) &&
            Objects.equals(publishVerion, that.publishVerion) &&
            Objects.equals(price, that.price) &&
            Objects.equals(isbn, that.isbn) &&
            Objects.equals(remark, that.remark) &&
            Objects.equals(distinct, that.distinct)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, author, publisher, publishVerion, price, isbn, remark, distinct);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "BookCriteria{" +
            (id != null ? "id=" + id + ", " : "") +
            (name != null ? "name=" + name + ", " : "") +
            (author != null ? "author=" + author + ", " : "") +
            (publisher != null ? "publisher=" + publisher + ", " : "") +
            (publishVerion != null ? "publishVerion=" + publishVerion + ", " : "") +
            (price != null ? "price=" + price + ", " : "") +
            (isbn != null ? "isbn=" + isbn + ", " : "") +
            (remark != null ? "remark=" + remark + ", " : "") +
            (distinct != null ? "distinct=" + distinct + ", " : "") +
            "}";
    }
}
