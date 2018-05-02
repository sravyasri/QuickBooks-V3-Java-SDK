//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.10 at 09:11:14 PM PDT 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.intuit.sb.cdm.util.v3.DateAdapter;
import org.jvnet.jaxb2_commons.lang.Equals2;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy2;
import org.jvnet.jaxb2_commons.lang.HashCode2;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy2;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 *  Describes the Party as a Employee Role view 
 * 
 * <p>Java class for Employee complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Employee">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.intuit.com/finance/v3}NameBase">
 *       &lt;sequence>
 *         &lt;element name="EmployeeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmployeeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SSN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryAddr" type="{http://schema.intuit.com/finance/v3}PhysicalAddress" minOccurs="0"/>
 *         &lt;element name="OtherAddr" type="{http://schema.intuit.com/finance/v3}PhysicalAddress" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BillableTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BillRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="BirthDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Gender" type="{http://schema.intuit.com/finance/v3}gender" minOccurs="0"/>
 *         &lt;element name="HiredDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ReleasedDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="UseTimeEntry" type="{http://schema.intuit.com/finance/v3}TimeEntryUsedForPaychecksEnum" minOccurs="0"/>
 *         &lt;element name="EmployeeEx" type="{http://schema.intuit.com/finance/v3}IntuitAnyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Employee", propOrder = {
    "employeeType",
    "employeeNumber",
    "ssn",
    "primaryAddr",
    "otherAddr",
    "billableTime",
    "billRate",
    "birthDate",
    "gender",
    "hiredDate",
    "releasedDate",
    "useTimeEntry",
    "employeeEx"
})
public class Employee
    extends NameBase
    implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "EmployeeType")
    protected String employeeType;
    @XmlElement(name = "EmployeeNumber")
    protected String employeeNumber;
    @XmlElement(name = "SSN")
    protected String ssn;
    @XmlElement(name = "PrimaryAddr")
    protected PhysicalAddress primaryAddr;
    @XmlElement(name = "OtherAddr")
    protected List<PhysicalAddress> otherAddr;
    @XmlElement(name = "BillableTime")
    protected Boolean billableTime;
    @XmlElement(name = "BillRate")
    protected BigDecimal billRate;
    @XmlElement(name = "BirthDate", type = String.class)
    @XmlJavaTypeAdapter(DateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date birthDate;
    @XmlElement(name = "Gender")
    protected Gender gender;
    @XmlElement(name = "HiredDate", type = String.class)
    @XmlJavaTypeAdapter(DateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date hiredDate;
    @XmlElement(name = "ReleasedDate", type = String.class)
    @XmlJavaTypeAdapter(DateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date releasedDate;
    @XmlElement(name = "UseTimeEntry")
    protected TimeEntryUsedForPaychecksEnum useTimeEntry;
    @XmlElement(name = "EmployeeEx")
    protected IntuitAnyType employeeEx;

    /**
     * Gets the value of the employeeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeType() {
        return employeeType;
    }

    /**
     * Sets the value of the employeeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeType(String value) {
        this.employeeType = value;
    }

    /**
     * Gets the value of the employeeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeNumber() {
        return employeeNumber;
    }

    /**
     * Sets the value of the employeeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeNumber(String value) {
        this.employeeNumber = value;
    }

    /**
     * Gets the value of the ssn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSN() {
        return ssn;
    }

    /**
     * Sets the value of the ssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSN(String value) {
        this.ssn = value;
    }

    /**
     * Gets the value of the primaryAddr property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalAddress }
     *     
     */
    public PhysicalAddress getPrimaryAddr() {
        return primaryAddr;
    }

    /**
     * Sets the value of the primaryAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalAddress }
     *     
     */
    public void setPrimaryAddr(PhysicalAddress value) {
        this.primaryAddr = value;
    }

    /**
     * Gets the value of the otherAddr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherAddr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherAddr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhysicalAddress }
     * 
     * 
     */
    public List<PhysicalAddress> getOtherAddr() {
        if (otherAddr == null) {
            otherAddr = new ArrayList<PhysicalAddress>();
        }
        return this.otherAddr;
    }

    /**
     * Gets the value of the billableTime property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBillableTime() {
        return billableTime;
    }

    /**
     * Sets the value of the billableTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBillableTime(Boolean value) {
        this.billableTime = value;
    }

    /**
     * Gets the value of the billRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBillRate() {
        return billRate;
    }

    /**
     * Sets the value of the billRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBillRate(BigDecimal value) {
        this.billRate = value;
    }

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthDate(Date value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link Gender }
     *     
     */
    public Gender getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link Gender }
     *     
     */
    public void setGender(Gender value) {
        this.gender = value;
    }

    /**
     * Gets the value of the hiredDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getHiredDate() {
        return hiredDate;
    }

    /**
     * Sets the value of the hiredDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHiredDate(Date value) {
        this.hiredDate = value;
    }

    /**
     * Gets the value of the releasedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getReleasedDate() {
        return releasedDate;
    }

    /**
     * Sets the value of the releasedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReleasedDate(Date value) {
        this.releasedDate = value;
    }

    /**
     * Gets the value of the useTimeEntry property.
     * 
     * @return
     *     possible object is
     *     {@link TimeEntryUsedForPaychecksEnum }
     *     
     */
    public TimeEntryUsedForPaychecksEnum getUseTimeEntry() {
        return useTimeEntry;
    }

    /**
     * Sets the value of the useTimeEntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeEntryUsedForPaychecksEnum }
     *     
     */
    public void setUseTimeEntry(TimeEntryUsedForPaychecksEnum value) {
        this.useTimeEntry = value;
    }

    /**
     * Gets the value of the employeeEx property.
     * 
     * @return
     *     possible object is
     *     {@link IntuitAnyType }
     *     
     */
    public IntuitAnyType getEmployeeEx() {
        return employeeEx;
    }

    /**
     * Sets the value of the employeeEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntuitAnyType }
     *     
     */
    public void setEmployeeEx(IntuitAnyType value) {
        this.employeeEx = value;
    }

    /**
     * Sets the value of the otherAddr property.
     * 
     * @param otherAddr
     *     allowed object is
     *     {@link PhysicalAddress }
     *     
     */
    public void setOtherAddr(List<PhysicalAddress> otherAddr) {
        this.otherAddr = otherAddr;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final Employee that = ((Employee) object);
        {
            String lhsEmployeeType;
            lhsEmployeeType = this.getEmployeeType();
            String rhsEmployeeType;
            rhsEmployeeType = that.getEmployeeType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "employeeType", lhsEmployeeType), LocatorUtils.property(thatLocator, "employeeType", rhsEmployeeType), lhsEmployeeType, rhsEmployeeType, (this.employeeType!= null), (that.employeeType!= null))) {
                return false;
            }
        }
        {
            String lhsEmployeeNumber;
            lhsEmployeeNumber = this.getEmployeeNumber();
            String rhsEmployeeNumber;
            rhsEmployeeNumber = that.getEmployeeNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "employeeNumber", lhsEmployeeNumber), LocatorUtils.property(thatLocator, "employeeNumber", rhsEmployeeNumber), lhsEmployeeNumber, rhsEmployeeNumber, (this.employeeNumber!= null), (that.employeeNumber!= null))) {
                return false;
            }
        }
        {
            String lhsSSN;
            lhsSSN = this.getSSN();
            String rhsSSN;
            rhsSSN = that.getSSN();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ssn", lhsSSN), LocatorUtils.property(thatLocator, "ssn", rhsSSN), lhsSSN, rhsSSN, (this.ssn!= null), (that.ssn!= null))) {
                return false;
            }
        }
        {
            PhysicalAddress lhsPrimaryAddr;
            lhsPrimaryAddr = this.getPrimaryAddr();
            PhysicalAddress rhsPrimaryAddr;
            rhsPrimaryAddr = that.getPrimaryAddr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "primaryAddr", lhsPrimaryAddr), LocatorUtils.property(thatLocator, "primaryAddr", rhsPrimaryAddr), lhsPrimaryAddr, rhsPrimaryAddr, (this.primaryAddr!= null), (that.primaryAddr!= null))) {
                return false;
            }
        }
        {
            List<PhysicalAddress> lhsOtherAddr;
            lhsOtherAddr = (((this.otherAddr!= null)&&(!this.otherAddr.isEmpty()))?this.getOtherAddr():null);
            List<PhysicalAddress> rhsOtherAddr;
            rhsOtherAddr = (((that.otherAddr!= null)&&(!that.otherAddr.isEmpty()))?that.getOtherAddr():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "otherAddr", lhsOtherAddr), LocatorUtils.property(thatLocator, "otherAddr", rhsOtherAddr), lhsOtherAddr, rhsOtherAddr, ((this.otherAddr!= null)&&(!this.otherAddr.isEmpty())), ((that.otherAddr!= null)&&(!that.otherAddr.isEmpty())))) {
                return false;
            }
        }
        {
            Boolean lhsBillableTime;
            lhsBillableTime = this.isBillableTime();
            Boolean rhsBillableTime;
            rhsBillableTime = that.isBillableTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "billableTime", lhsBillableTime), LocatorUtils.property(thatLocator, "billableTime", rhsBillableTime), lhsBillableTime, rhsBillableTime, (this.billableTime!= null), (that.billableTime!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsBillRate;
            lhsBillRate = this.getBillRate();
            BigDecimal rhsBillRate;
            rhsBillRate = that.getBillRate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "billRate", lhsBillRate), LocatorUtils.property(thatLocator, "billRate", rhsBillRate), lhsBillRate, rhsBillRate, (this.billRate!= null), (that.billRate!= null))) {
                return false;
            }
        }
        {
            Date lhsBirthDate;
            lhsBirthDate = this.getBirthDate();
            Date rhsBirthDate;
            rhsBirthDate = that.getBirthDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "birthDate", lhsBirthDate), LocatorUtils.property(thatLocator, "birthDate", rhsBirthDate), lhsBirthDate, rhsBirthDate, (this.birthDate!= null), (that.birthDate!= null))) {
                return false;
            }
        }
        {
            Gender lhsGender;
            lhsGender = this.getGender();
            Gender rhsGender;
            rhsGender = that.getGender();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gender", lhsGender), LocatorUtils.property(thatLocator, "gender", rhsGender), lhsGender, rhsGender, (this.gender!= null), (that.gender!= null))) {
                return false;
            }
        }
        {
            Date lhsHiredDate;
            lhsHiredDate = this.getHiredDate();
            Date rhsHiredDate;
            rhsHiredDate = that.getHiredDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hiredDate", lhsHiredDate), LocatorUtils.property(thatLocator, "hiredDate", rhsHiredDate), lhsHiredDate, rhsHiredDate, (this.hiredDate!= null), (that.hiredDate!= null))) {
                return false;
            }
        }
        {
            Date lhsReleasedDate;
            lhsReleasedDate = this.getReleasedDate();
            Date rhsReleasedDate;
            rhsReleasedDate = that.getReleasedDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "releasedDate", lhsReleasedDate), LocatorUtils.property(thatLocator, "releasedDate", rhsReleasedDate), lhsReleasedDate, rhsReleasedDate, (this.releasedDate!= null), (that.releasedDate!= null))) {
                return false;
            }
        }
        {
            TimeEntryUsedForPaychecksEnum lhsUseTimeEntry;
            lhsUseTimeEntry = this.getUseTimeEntry();
            TimeEntryUsedForPaychecksEnum rhsUseTimeEntry;
            rhsUseTimeEntry = that.getUseTimeEntry();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "useTimeEntry", lhsUseTimeEntry), LocatorUtils.property(thatLocator, "useTimeEntry", rhsUseTimeEntry), lhsUseTimeEntry, rhsUseTimeEntry, (this.useTimeEntry!= null), (that.useTimeEntry!= null))) {
                return false;
            }
        }
        {
            IntuitAnyType lhsEmployeeEx;
            lhsEmployeeEx = this.getEmployeeEx();
            IntuitAnyType rhsEmployeeEx;
            rhsEmployeeEx = that.getEmployeeEx();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "employeeEx", lhsEmployeeEx), LocatorUtils.property(thatLocator, "employeeEx", rhsEmployeeEx), lhsEmployeeEx, rhsEmployeeEx, (this.employeeEx!= null), (that.employeeEx!= null))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            String theEmployeeType;
            theEmployeeType = this.getEmployeeType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "employeeType", theEmployeeType), currentHashCode, theEmployeeType, (this.employeeType!= null));
        }
        {
            String theEmployeeNumber;
            theEmployeeNumber = this.getEmployeeNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "employeeNumber", theEmployeeNumber), currentHashCode, theEmployeeNumber, (this.employeeNumber!= null));
        }
        {
            String theSSN;
            theSSN = this.getSSN();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ssn", theSSN), currentHashCode, theSSN, (this.ssn!= null));
        }
        {
            PhysicalAddress thePrimaryAddr;
            thePrimaryAddr = this.getPrimaryAddr();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "primaryAddr", thePrimaryAddr), currentHashCode, thePrimaryAddr, (this.primaryAddr!= null));
        }
        {
            List<PhysicalAddress> theOtherAddr;
            theOtherAddr = (((this.otherAddr!= null)&&(!this.otherAddr.isEmpty()))?this.getOtherAddr():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "otherAddr", theOtherAddr), currentHashCode, theOtherAddr, ((this.otherAddr!= null)&&(!this.otherAddr.isEmpty())));
        }
        {
            Boolean theBillableTime;
            theBillableTime = this.isBillableTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "billableTime", theBillableTime), currentHashCode, theBillableTime, (this.billableTime!= null));
        }
        {
            BigDecimal theBillRate;
            theBillRate = this.getBillRate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "billRate", theBillRate), currentHashCode, theBillRate, (this.billRate!= null));
        }
        {
            Date theBirthDate;
            theBirthDate = this.getBirthDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "birthDate", theBirthDate), currentHashCode, theBirthDate, (this.birthDate!= null));
        }
        {
            Gender theGender;
            theGender = this.getGender();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "gender", theGender), currentHashCode, theGender, (this.gender!= null));
        }
        {
            Date theHiredDate;
            theHiredDate = this.getHiredDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "hiredDate", theHiredDate), currentHashCode, theHiredDate, (this.hiredDate!= null));
        }
        {
            Date theReleasedDate;
            theReleasedDate = this.getReleasedDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "releasedDate", theReleasedDate), currentHashCode, theReleasedDate, (this.releasedDate!= null));
        }
        {
            TimeEntryUsedForPaychecksEnum theUseTimeEntry;
            theUseTimeEntry = this.getUseTimeEntry();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "useTimeEntry", theUseTimeEntry), currentHashCode, theUseTimeEntry, (this.useTimeEntry!= null));
        }
        {
            IntuitAnyType theEmployeeEx;
            theEmployeeEx = this.getEmployeeEx();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "employeeEx", theEmployeeEx), currentHashCode, theEmployeeEx, (this.employeeEx!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
