//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.10 at 09:11:14 PM PDT 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals2;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy2;
import org.jvnet.jaxb2_commons.lang.HashCode2;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy2;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * 
 * 				Product: ALL
 * 				Description: Describes the details of
 * 				the attachment.
 * 			
 * 
 * <p>Java class for Attachable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Attachable">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.intuit.com/finance/v3}IntuitEntity">
 *       &lt;sequence>
 *         &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FileAccessUri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TempDownloadUri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Size" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ContentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Category" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Lat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Long" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PlaceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Tag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ThumbnailFileAccessUri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ThumbnailTempDownloadUri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AttachableEx" type="{http://schema.intuit.com/finance/v3}IntuitAnyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Attachable", propOrder = {
    "fileName",
    "fileAccessUri",
    "tempDownloadUri",
    "size",
    "contentType",
    "category",
    "lat",
    "_long",
    "placeName",
    "note",
    "tag",
    "thumbnailFileAccessUri",
    "thumbnailTempDownloadUri",
    "attachableEx"
})
public class Attachable
    extends IntuitEntity
    implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "FileName")
    protected String fileName;
    @XmlElement(name = "FileAccessUri")
    protected String fileAccessUri;
    @XmlElement(name = "TempDownloadUri")
    protected String tempDownloadUri;
    @XmlElement(name = "Size")
    protected Long size;
    @XmlElement(name = "ContentType")
    protected String contentType;
    @XmlElement(name = "Category")
    protected String category;
    @XmlElement(name = "Lat")
    protected String lat;
    @XmlElement(name = "Long")
    protected String _long;
    @XmlElement(name = "PlaceName")
    protected String placeName;
    @XmlElement(name = "Note")
    protected String note;
    @XmlElement(name = "Tag")
    protected String tag;
    @XmlElement(name = "ThumbnailFileAccessUri")
    protected String thumbnailFileAccessUri;
    @XmlElement(name = "ThumbnailTempDownloadUri")
    protected String thumbnailTempDownloadUri;
    @XmlElement(name = "AttachableEx")
    protected IntuitAnyType attachableEx;

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the fileAccessUri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileAccessUri() {
        return fileAccessUri;
    }

    /**
     * Sets the value of the fileAccessUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileAccessUri(String value) {
        this.fileAccessUri = value;
    }

    /**
     * Gets the value of the tempDownloadUri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTempDownloadUri() {
        return tempDownloadUri;
    }

    /**
     * Sets the value of the tempDownloadUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTempDownloadUri(String value) {
        this.tempDownloadUri = value;
    }

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSize(Long value) {
        this.size = value;
    }

    /**
     * Gets the value of the contentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * Sets the value of the contentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentType(String value) {
        this.contentType = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the lat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLat() {
        return lat;
    }

    /**
     * Sets the value of the lat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLat(String value) {
        this.lat = value;
    }

    /**
     * Gets the value of the long property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLong() {
        return _long;
    }

    /**
     * Sets the value of the long property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLong(String value) {
        this._long = value;
    }

    /**
     * Gets the value of the placeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceName() {
        return placeName;
    }

    /**
     * Sets the value of the placeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceName(String value) {
        this.placeName = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * Gets the value of the tag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTag() {
        return tag;
    }

    /**
     * Sets the value of the tag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTag(String value) {
        this.tag = value;
    }

    /**
     * Gets the value of the thumbnailFileAccessUri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThumbnailFileAccessUri() {
        return thumbnailFileAccessUri;
    }

    /**
     * Sets the value of the thumbnailFileAccessUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThumbnailFileAccessUri(String value) {
        this.thumbnailFileAccessUri = value;
    }

    /**
     * Gets the value of the thumbnailTempDownloadUri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThumbnailTempDownloadUri() {
        return thumbnailTempDownloadUri;
    }

    /**
     * Sets the value of the thumbnailTempDownloadUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThumbnailTempDownloadUri(String value) {
        this.thumbnailTempDownloadUri = value;
    }

    /**
     * Gets the value of the attachableEx property.
     * 
     * @return
     *     possible object is
     *     {@link IntuitAnyType }
     *     
     */
    public IntuitAnyType getAttachableEx() {
        return attachableEx;
    }

    /**
     * Sets the value of the attachableEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntuitAnyType }
     *     
     */
    public void setAttachableEx(IntuitAnyType value) {
        this.attachableEx = value;
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
        final Attachable that = ((Attachable) object);
        {
            String lhsFileName;
            lhsFileName = this.getFileName();
            String rhsFileName;
            rhsFileName = that.getFileName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fileName", lhsFileName), LocatorUtils.property(thatLocator, "fileName", rhsFileName), lhsFileName, rhsFileName, (this.fileName!= null), (that.fileName!= null))) {
                return false;
            }
        }
        {
            String lhsFileAccessUri;
            lhsFileAccessUri = this.getFileAccessUri();
            String rhsFileAccessUri;
            rhsFileAccessUri = that.getFileAccessUri();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fileAccessUri", lhsFileAccessUri), LocatorUtils.property(thatLocator, "fileAccessUri", rhsFileAccessUri), lhsFileAccessUri, rhsFileAccessUri, (this.fileAccessUri!= null), (that.fileAccessUri!= null))) {
                return false;
            }
        }
        {
            String lhsTempDownloadUri;
            lhsTempDownloadUri = this.getTempDownloadUri();
            String rhsTempDownloadUri;
            rhsTempDownloadUri = that.getTempDownloadUri();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tempDownloadUri", lhsTempDownloadUri), LocatorUtils.property(thatLocator, "tempDownloadUri", rhsTempDownloadUri), lhsTempDownloadUri, rhsTempDownloadUri, (this.tempDownloadUri!= null), (that.tempDownloadUri!= null))) {
                return false;
            }
        }
        {
            Long lhsSize;
            lhsSize = this.getSize();
            Long rhsSize;
            rhsSize = that.getSize();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "size", lhsSize), LocatorUtils.property(thatLocator, "size", rhsSize), lhsSize, rhsSize, (this.size!= null), (that.size!= null))) {
                return false;
            }
        }
        {
            String lhsContentType;
            lhsContentType = this.getContentType();
            String rhsContentType;
            rhsContentType = that.getContentType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contentType", lhsContentType), LocatorUtils.property(thatLocator, "contentType", rhsContentType), lhsContentType, rhsContentType, (this.contentType!= null), (that.contentType!= null))) {
                return false;
            }
        }
        {
            String lhsCategory;
            lhsCategory = this.getCategory();
            String rhsCategory;
            rhsCategory = that.getCategory();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "category", lhsCategory), LocatorUtils.property(thatLocator, "category", rhsCategory), lhsCategory, rhsCategory, (this.category!= null), (that.category!= null))) {
                return false;
            }
        }
        {
            String lhsLat;
            lhsLat = this.getLat();
            String rhsLat;
            rhsLat = that.getLat();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lat", lhsLat), LocatorUtils.property(thatLocator, "lat", rhsLat), lhsLat, rhsLat, (this.lat!= null), (that.lat!= null))) {
                return false;
            }
        }
        {
            String lhsLong;
            lhsLong = this.getLong();
            String rhsLong;
            rhsLong = that.getLong();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "_long", lhsLong), LocatorUtils.property(thatLocator, "_long", rhsLong), lhsLong, rhsLong, (this._long!= null), (that._long!= null))) {
                return false;
            }
        }
        {
            String lhsPlaceName;
            lhsPlaceName = this.getPlaceName();
            String rhsPlaceName;
            rhsPlaceName = that.getPlaceName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "placeName", lhsPlaceName), LocatorUtils.property(thatLocator, "placeName", rhsPlaceName), lhsPlaceName, rhsPlaceName, (this.placeName!= null), (that.placeName!= null))) {
                return false;
            }
        }
        {
            String lhsNote;
            lhsNote = this.getNote();
            String rhsNote;
            rhsNote = that.getNote();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "note", lhsNote), LocatorUtils.property(thatLocator, "note", rhsNote), lhsNote, rhsNote, (this.note!= null), (that.note!= null))) {
                return false;
            }
        }
        {
            String lhsTag;
            lhsTag = this.getTag();
            String rhsTag;
            rhsTag = that.getTag();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tag", lhsTag), LocatorUtils.property(thatLocator, "tag", rhsTag), lhsTag, rhsTag, (this.tag!= null), (that.tag!= null))) {
                return false;
            }
        }
        {
            String lhsThumbnailFileAccessUri;
            lhsThumbnailFileAccessUri = this.getThumbnailFileAccessUri();
            String rhsThumbnailFileAccessUri;
            rhsThumbnailFileAccessUri = that.getThumbnailFileAccessUri();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "thumbnailFileAccessUri", lhsThumbnailFileAccessUri), LocatorUtils.property(thatLocator, "thumbnailFileAccessUri", rhsThumbnailFileAccessUri), lhsThumbnailFileAccessUri, rhsThumbnailFileAccessUri, (this.thumbnailFileAccessUri!= null), (that.thumbnailFileAccessUri!= null))) {
                return false;
            }
        }
        {
            String lhsThumbnailTempDownloadUri;
            lhsThumbnailTempDownloadUri = this.getThumbnailTempDownloadUri();
            String rhsThumbnailTempDownloadUri;
            rhsThumbnailTempDownloadUri = that.getThumbnailTempDownloadUri();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "thumbnailTempDownloadUri", lhsThumbnailTempDownloadUri), LocatorUtils.property(thatLocator, "thumbnailTempDownloadUri", rhsThumbnailTempDownloadUri), lhsThumbnailTempDownloadUri, rhsThumbnailTempDownloadUri, (this.thumbnailTempDownloadUri!= null), (that.thumbnailTempDownloadUri!= null))) {
                return false;
            }
        }
        {
            IntuitAnyType lhsAttachableEx;
            lhsAttachableEx = this.getAttachableEx();
            IntuitAnyType rhsAttachableEx;
            rhsAttachableEx = that.getAttachableEx();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "attachableEx", lhsAttachableEx), LocatorUtils.property(thatLocator, "attachableEx", rhsAttachableEx), lhsAttachableEx, rhsAttachableEx, (this.attachableEx!= null), (that.attachableEx!= null))) {
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
            String theFileName;
            theFileName = this.getFileName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fileName", theFileName), currentHashCode, theFileName, (this.fileName!= null));
        }
        {
            String theFileAccessUri;
            theFileAccessUri = this.getFileAccessUri();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fileAccessUri", theFileAccessUri), currentHashCode, theFileAccessUri, (this.fileAccessUri!= null));
        }
        {
            String theTempDownloadUri;
            theTempDownloadUri = this.getTempDownloadUri();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tempDownloadUri", theTempDownloadUri), currentHashCode, theTempDownloadUri, (this.tempDownloadUri!= null));
        }
        {
            Long theSize;
            theSize = this.getSize();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "size", theSize), currentHashCode, theSize, (this.size!= null));
        }
        {
            String theContentType;
            theContentType = this.getContentType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contentType", theContentType), currentHashCode, theContentType, (this.contentType!= null));
        }
        {
            String theCategory;
            theCategory = this.getCategory();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "category", theCategory), currentHashCode, theCategory, (this.category!= null));
        }
        {
            String theLat;
            theLat = this.getLat();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lat", theLat), currentHashCode, theLat, (this.lat!= null));
        }
        {
            String theLong;
            theLong = this.getLong();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "_long", theLong), currentHashCode, theLong, (this._long!= null));
        }
        {
            String thePlaceName;
            thePlaceName = this.getPlaceName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "placeName", thePlaceName), currentHashCode, thePlaceName, (this.placeName!= null));
        }
        {
            String theNote;
            theNote = this.getNote();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "note", theNote), currentHashCode, theNote, (this.note!= null));
        }
        {
            String theTag;
            theTag = this.getTag();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tag", theTag), currentHashCode, theTag, (this.tag!= null));
        }
        {
            String theThumbnailFileAccessUri;
            theThumbnailFileAccessUri = this.getThumbnailFileAccessUri();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "thumbnailFileAccessUri", theThumbnailFileAccessUri), currentHashCode, theThumbnailFileAccessUri, (this.thumbnailFileAccessUri!= null));
        }
        {
            String theThumbnailTempDownloadUri;
            theThumbnailTempDownloadUri = this.getThumbnailTempDownloadUri();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "thumbnailTempDownloadUri", theThumbnailTempDownloadUri), currentHashCode, theThumbnailTempDownloadUri, (this.thumbnailTempDownloadUri!= null));
        }
        {
            IntuitAnyType theAttachableEx;
            theAttachableEx = this.getAttachableEx();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "attachableEx", theAttachableEx), currentHashCode, theAttachableEx, (this.attachableEx!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
