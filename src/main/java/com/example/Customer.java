package com.example;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * This entity class is reverse engineered using NetBeans from Azure's example
 * dataset for SQL Server.
 *
 * @author Matti Tahvonen
 */
@Entity
@Table(name = "Customer", schema = "SalesLT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Customer.findAll", query = "SELECT c FROM Customer c"),
    @NamedQuery(name = "Customer.findByCustomerID", query = "SELECT c FROM Customer c WHERE c.customerID = :customerID"),
    @NamedQuery(name = "Customer.findByNameStyle", query = "SELECT c FROM Customer c WHERE c.nameStyle = :nameStyle"),
    @NamedQuery(name = "Customer.findByTitle", query = "SELECT c FROM Customer c WHERE c.title = :title"),
    @NamedQuery(name = "Customer.findByFirstName", query = "SELECT c FROM Customer c WHERE c.firstName = :firstName"),
    @NamedQuery(name = "Customer.findByMiddleName", query = "SELECT c FROM Customer c WHERE c.middleName = :middleName"),
    @NamedQuery(name = "Customer.findByLastName", query = "SELECT c FROM Customer c WHERE c.lastName = :lastName"),
    @NamedQuery(name = "Customer.findBySuffix", query = "SELECT c FROM Customer c WHERE c.suffix = :suffix"),
    @NamedQuery(name = "Customer.findByCompanyName", query = "SELECT c FROM Customer c WHERE c.companyName = :companyName"),
    @NamedQuery(name = "Customer.findBySalesPerson", query = "SELECT c FROM Customer c WHERE c.salesPerson = :salesPerson"),
    @NamedQuery(name = "Customer.findByEmailAddress", query = "SELECT c FROM Customer c WHERE c.emailAddress = :emailAddress"),
    @NamedQuery(name = "Customer.findByPhone", query = "SELECT c FROM Customer c WHERE c.phone = :phone"),
    @NamedQuery(name = "Customer.findByPasswordHash", query = "SELECT c FROM Customer c WHERE c.passwordHash = :passwordHash"),
    @NamedQuery(name = "Customer.findByPasswordSalt", query = "SELECT c FROM Customer c WHERE c.passwordSalt = :passwordSalt"),
    @NamedQuery(name = "Customer.findByRowguid", query = "SELECT c FROM Customer c WHERE c.rowguid = :rowguid"),
    @NamedQuery(name = "Customer.findByModifiedDate", query = "SELECT c FROM Customer c WHERE c.modifiedDate = :modifiedDate")})
public class Customer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CustomerID")
    private Integer customerID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NameStyle")
    private boolean nameStyle;
    @Size(max = 8)
    @Column(name = "Title")
    private String title;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "FirstName")
    private String firstName;
    @Size(max = 50)
    @Column(name = "MiddleName")
    private String middleName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "LastName")
    private String lastName;
    @Size(max = 10)
    @Column(name = "Suffix")
    private String suffix;
    @Size(max = 128)
    @Column(name = "CompanyName")
    private String companyName;
    @Size(max = 256)
    @Column(name = "SalesPerson")
    private String salesPerson;
    @Size(max = 50)
    @Column(name = "EmailAddress")
    private String emailAddress;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Size(max = 25)
    @Column(name = "Phone")
    private String phone;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "PasswordHash")
    private String passwordHash;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "PasswordSalt")
    private String passwordSalt;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 36)
    @Column(name = "rowguid")
    private String rowguid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ModifiedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;

    public Customer() {
    }

    public Customer(Integer customerID) {
        this.customerID = customerID;
    }

    public Customer(Integer customerID, boolean nameStyle, String firstName,
            String lastName, String passwordHash, String passwordSalt,
            String rowguid, Date modifiedDate) {
        this.customerID = customerID;
        this.nameStyle = nameStyle;
        this.firstName = firstName;
        this.lastName = lastName;
        this.passwordHash = passwordHash;
        this.passwordSalt = passwordSalt;
        this.rowguid = rowguid;
        this.modifiedDate = modifiedDate;
    }

    public Integer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Integer customerID) {
        this.customerID = customerID;
    }

    public boolean getNameStyle() {
        return nameStyle;
    }

    public void setNameStyle(boolean nameStyle) {
        this.nameStyle = nameStyle;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getSalesPerson() {
        return salesPerson;
    }

    public void setSalesPerson(String salesPerson) {
        this.salesPerson = salesPerson;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getPasswordSalt() {
        return passwordSalt;
    }

    public void setPasswordSalt(String passwordSalt) {
        this.passwordSalt = passwordSalt;
    }

    public String getRowguid() {
        return rowguid;
    }

    public void setRowguid(String rowguid) {
        this.rowguid = rowguid;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (customerID != null ? customerID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Customer)) {
            return false;
        }
        Customer other = (Customer) object;
        if ((this.customerID == null && other.customerID != null) || (this.customerID != null && !this.customerID.
                equals(other.customerID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.vaadin.azure.Customer[ customerID=" + customerID + " ]";
    }

}
