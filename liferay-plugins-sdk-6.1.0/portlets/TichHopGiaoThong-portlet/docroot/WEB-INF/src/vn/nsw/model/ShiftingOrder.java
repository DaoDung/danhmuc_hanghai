//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.23 at 02:03:03 PM ICT 
//


package vn.nsw.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumberShiftingOrder" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DocumentName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DocumentYear" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PortofAuthority" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NameOfShip" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ShownDraftxF" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="UnitShownDraftxF" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ShownDraftxA" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="UnitShownDraftxA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LOA" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="LOAUNIT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DWT" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="DWTUNIT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TugBoat" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Chanel" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ChanelCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ChanelName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="From" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="To" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FlagStateOfShip" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AnchoringPortCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PortHarbourCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AnchoringPortWharfCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ShiftingDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ReasonToShift" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IssueDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DirectorOfMaritimeAdministration" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CertificateNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Representative" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AttachedFile">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AttachedTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="AttachedTypeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="AttachedDocName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="AttachedNote" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="FullFileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="SHA1FileContent" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Base64FileContent" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="FileURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TaxCodeOfShipownersAgents" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NameOfShipownersAgents" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ShipAgencyAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ShipAgencyPhone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ShipAgencyFax" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ShipAgencyEmail" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "numberShiftingOrder",
    "documentName",
    "documentYear",
    "portofAuthority",
    "nameOfShip",
    "shownDraftxF",
    "unitShownDraftxF",
    "shownDraftxA",
    "unitShownDraftxA",
    "loa",
    "loaunit",
    "dwt",
    "dwtunit",
    "tugBoat",
    "chanel",
    "from",
    "to",
    "flagStateOfShip",
    "anchoringPortCode",
    "portHarbourCode",
    "anchoringPortWharfCode",
    "shiftingDate",
    "reasonToShift",
    "issueDate",
    "directorOfMaritimeAdministration",
    "certificateNo",
    "representative",
    "attachedFile",
    "taxCodeOfShipownersAgents",
    "nameOfShipownersAgents",
    "shipAgencyAddress",
    "shipAgencyPhone",
    "shipAgencyFax",
    "shipAgencyEmail"
})
@XmlRootElement(name = "ShiftingOrder")
public class ShiftingOrder {

    @XmlElement(name = "NumberShiftingOrder", required = true)
    protected String numberShiftingOrder;
    @XmlElement(name = "DocumentName", required = true)
    protected String documentName;
    @XmlElement(name = "DocumentYear", required = true)
    protected String documentYear;
    @XmlElement(name = "PortofAuthority", required = true)
    protected String portofAuthority;
    @XmlElement(name = "NameOfShip", required = true)
    protected String nameOfShip;
    @XmlElement(name = "ShownDraftxF")
    protected double shownDraftxF;
    @XmlElement(name = "UnitShownDraftxF", required = true)
    protected String unitShownDraftxF;
    @XmlElement(name = "ShownDraftxA")
    protected double shownDraftxA;
    @XmlElement(name = "UnitShownDraftxA", required = true)
    protected String unitShownDraftxA;
    @XmlElement(name = "LOA")
    protected double loa;
    @XmlElement(name = "LOAUNIT", required = true)
    protected String loaunit;
    @XmlElement(name = "DWT")
    protected double dwt;
    @XmlElement(name = "DWTUNIT", required = true)
    protected String dwtunit;
    @XmlElement(name = "TugBoat", required = true)
    protected String tugBoat;
    @XmlElement(name = "Chanel", required = true)
    protected List<ShiftingOrder.Chanel> chanel;
    @XmlElement(name = "From", required = true)
    protected String from;
    @XmlElement(name = "To", required = true)
    protected String to;
    @XmlElement(name = "FlagStateOfShip", required = true)
    protected String flagStateOfShip;
    @XmlElement(name = "AnchoringPortCode", required = true)
    protected String anchoringPortCode;
    @XmlElement(name = "PortHarbourCode", required = true)
    protected String portHarbourCode;
    @XmlElement(name = "AnchoringPortWharfCode", required = true)
    protected String anchoringPortWharfCode;
    @XmlElement(name = "ShiftingDate", required = true)
    protected String shiftingDate;
    @XmlElement(name = "ReasonToShift", required = true)
    protected String reasonToShift;
    @XmlElement(name = "IssueDate", required = true)
    protected String issueDate;
    @XmlElement(name = "DirectorOfMaritimeAdministration", required = true)
    protected String directorOfMaritimeAdministration;
    @XmlElement(name = "CertificateNo", required = true)
    protected String certificateNo;
    @XmlElement(name = "Representative", required = true)
    protected String representative;
    @XmlElement(name = "AttachedFile", required = true)
    protected ShiftingOrder.AttachedFile attachedFile;
    @XmlElement(name = "TaxCodeOfShipownersAgents", required = true)
    protected String taxCodeOfShipownersAgents;
    @XmlElement(name = "NameOfShipownersAgents", required = true)
    protected String nameOfShipownersAgents;
    @XmlElement(name = "ShipAgencyAddress", required = true)
    protected String shipAgencyAddress;
    @XmlElement(name = "ShipAgencyPhone", required = true)
    protected String shipAgencyPhone;
    @XmlElement(name = "ShipAgencyFax", required = true)
    protected String shipAgencyFax;
    @XmlElement(name = "ShipAgencyEmail", required = true)
    protected String shipAgencyEmail;

    /**
     * Gets the value of the numberShiftingOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberShiftingOrder() {
        return numberShiftingOrder;
    }

    /**
     * Sets the value of the numberShiftingOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberShiftingOrder(String value) {
        this.numberShiftingOrder = value;
    }

    /**
     * Gets the value of the documentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentName() {
        return documentName;
    }

    /**
     * Sets the value of the documentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentName(String value) {
        this.documentName = value;
    }

    /**
     * Gets the value of the documentYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentYear() {
        return documentYear;
    }

    /**
     * Sets the value of the documentYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentYear(String value) {
        this.documentYear = value;
    }

    /**
     * Gets the value of the portofAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortofAuthority() {
        return portofAuthority;
    }

    /**
     * Sets the value of the portofAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortofAuthority(String value) {
        this.portofAuthority = value;
    }

    /**
     * Gets the value of the nameOfShip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameOfShip() {
        return nameOfShip;
    }

    /**
     * Sets the value of the nameOfShip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameOfShip(String value) {
        this.nameOfShip = value;
    }

    /**
     * Gets the value of the shownDraftxF property.
     * 
     */
    public double getShownDraftxF() {
        return shownDraftxF;
    }

    /**
     * Sets the value of the shownDraftxF property.
     * 
     */
    public void setShownDraftxF(double value) {
        this.shownDraftxF = value;
    }

    /**
     * Gets the value of the unitShownDraftxF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitShownDraftxF() {
        return unitShownDraftxF;
    }

    /**
     * Sets the value of the unitShownDraftxF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitShownDraftxF(String value) {
        this.unitShownDraftxF = value;
    }

    /**
     * Gets the value of the shownDraftxA property.
     * 
     */
    public double getShownDraftxA() {
        return shownDraftxA;
    }

    /**
     * Sets the value of the shownDraftxA property.
     * 
     */
    public void setShownDraftxA(double value) {
        this.shownDraftxA = value;
    }

    /**
     * Gets the value of the unitShownDraftxA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitShownDraftxA() {
        return unitShownDraftxA;
    }

    /**
     * Sets the value of the unitShownDraftxA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitShownDraftxA(String value) {
        this.unitShownDraftxA = value;
    }

    /**
     * Gets the value of the loa property.
     * 
     */
    public double getLOA() {
        return loa;
    }

    /**
     * Sets the value of the loa property.
     * 
     */
    public void setLOA(double value) {
        this.loa = value;
    }

    /**
     * Gets the value of the loaunit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOAUNIT() {
        return loaunit;
    }

    /**
     * Sets the value of the loaunit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOAUNIT(String value) {
        this.loaunit = value;
    }

    /**
     * Gets the value of the dwt property.
     * 
     */
    public double getDWT() {
        return dwt;
    }

    /**
     * Sets the value of the dwt property.
     * 
     */
    public void setDWT(double value) {
        this.dwt = value;
    }

    /**
     * Gets the value of the dwtunit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDWTUNIT() {
        return dwtunit;
    }

    /**
     * Sets the value of the dwtunit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDWTUNIT(String value) {
        this.dwtunit = value;
    }

    /**
     * Gets the value of the tugBoat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTugBoat() {
        return tugBoat;
    }

    /**
     * Sets the value of the tugBoat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTugBoat(String value) {
        this.tugBoat = value;
    }

    /**
     * Gets the value of the chanel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chanel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChanel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShiftingOrder.Chanel }
     * 
     * 
     */
    public List<ShiftingOrder.Chanel> getChanel() {
        if (chanel == null) {
            chanel = new ArrayList<ShiftingOrder.Chanel>();
        }
        return this.chanel;
    }

    /**
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrom(String value) {
        this.from = value;
    }

    /**
     * Gets the value of the to property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTo() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTo(String value) {
        this.to = value;
    }

    /**
     * Gets the value of the flagStateOfShip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlagStateOfShip() {
        return flagStateOfShip;
    }

    /**
     * Sets the value of the flagStateOfShip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlagStateOfShip(String value) {
        this.flagStateOfShip = value;
    }

    /**
     * Gets the value of the anchoringPortCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnchoringPortCode() {
        return anchoringPortCode;
    }

    /**
     * Sets the value of the anchoringPortCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnchoringPortCode(String value) {
        this.anchoringPortCode = value;
    }

    /**
     * Gets the value of the portHarbourCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortHarbourCode() {
        return portHarbourCode;
    }

    /**
     * Sets the value of the portHarbourCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortHarbourCode(String value) {
        this.portHarbourCode = value;
    }

    /**
     * Gets the value of the anchoringPortWharfCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnchoringPortWharfCode() {
        return anchoringPortWharfCode;
    }

    /**
     * Sets the value of the anchoringPortWharfCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnchoringPortWharfCode(String value) {
        this.anchoringPortWharfCode = value;
    }

    /**
     * Gets the value of the shiftingDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShiftingDate() {
        return shiftingDate;
    }

    /**
     * Sets the value of the shiftingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShiftingDate(String value) {
        this.shiftingDate = value;
    }

    /**
     * Gets the value of the reasonToShift property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonToShift() {
        return reasonToShift;
    }

    /**
     * Sets the value of the reasonToShift property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonToShift(String value) {
        this.reasonToShift = value;
    }

    /**
     * Gets the value of the issueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueDate() {
        return issueDate;
    }

    /**
     * Sets the value of the issueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueDate(String value) {
        this.issueDate = value;
    }

    /**
     * Gets the value of the directorOfMaritimeAdministration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectorOfMaritimeAdministration() {
        return directorOfMaritimeAdministration;
    }

    /**
     * Sets the value of the directorOfMaritimeAdministration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectorOfMaritimeAdministration(String value) {
        this.directorOfMaritimeAdministration = value;
    }

    /**
     * Gets the value of the certificateNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificateNo() {
        return certificateNo;
    }

    /**
     * Sets the value of the certificateNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificateNo(String value) {
        this.certificateNo = value;
    }

    /**
     * Gets the value of the representative property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepresentative() {
        return representative;
    }

    /**
     * Sets the value of the representative property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepresentative(String value) {
        this.representative = value;
    }

    /**
     * Gets the value of the attachedFile property.
     * 
     * @return
     *     possible object is
     *     {@link ShiftingOrder.AttachedFile }
     *     
     */
    public ShiftingOrder.AttachedFile getAttachedFile() {
        return attachedFile;
    }

    /**
     * Sets the value of the attachedFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShiftingOrder.AttachedFile }
     *     
     */
    public void setAttachedFile(ShiftingOrder.AttachedFile value) {
        this.attachedFile = value;
    }

    /**
     * Gets the value of the taxCodeOfShipownersAgents property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxCodeOfShipownersAgents() {
        return taxCodeOfShipownersAgents;
    }

    /**
     * Sets the value of the taxCodeOfShipownersAgents property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxCodeOfShipownersAgents(String value) {
        this.taxCodeOfShipownersAgents = value;
    }

    /**
     * Gets the value of the nameOfShipownersAgents property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameOfShipownersAgents() {
        return nameOfShipownersAgents;
    }

    /**
     * Sets the value of the nameOfShipownersAgents property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameOfShipownersAgents(String value) {
        this.nameOfShipownersAgents = value;
    }

    /**
     * Gets the value of the shipAgencyAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipAgencyAddress() {
        return shipAgencyAddress;
    }

    /**
     * Sets the value of the shipAgencyAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipAgencyAddress(String value) {
        this.shipAgencyAddress = value;
    }

    /**
     * Gets the value of the shipAgencyPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipAgencyPhone() {
        return shipAgencyPhone;
    }

    /**
     * Sets the value of the shipAgencyPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipAgencyPhone(String value) {
        this.shipAgencyPhone = value;
    }

    /**
     * Gets the value of the shipAgencyFax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipAgencyFax() {
        return shipAgencyFax;
    }

    /**
     * Sets the value of the shipAgencyFax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipAgencyFax(String value) {
        this.shipAgencyFax = value;
    }

    /**
     * Gets the value of the shipAgencyEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipAgencyEmail() {
        return shipAgencyEmail;
    }

    /**
     * Sets the value of the shipAgencyEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipAgencyEmail(String value) {
        this.shipAgencyEmail = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="AttachedTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="AttachedTypeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="AttachedDocName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="AttachedNote" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="FullFileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="SHA1FileContent" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Base64FileContent" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="FileURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "attachedTypeCode",
        "attachedTypeName",
        "attachedDocName",
        "attachedNote",
        "fullFileName",
        "sha1FileContent",
        "base64FileContent",
        "fileURL"
    })
    public static class AttachedFile {

        @XmlElement(name = "AttachedTypeCode", required = true)
        protected String attachedTypeCode;
        @XmlElement(name = "AttachedTypeName", required = true)
        protected String attachedTypeName;
        @XmlElement(name = "AttachedDocName", required = true)
        protected String attachedDocName;
        @XmlElement(name = "AttachedNote", required = true)
        protected String attachedNote;
        @XmlElement(name = "FullFileName", required = true)
        protected String fullFileName;
        @XmlElement(name = "SHA1FileContent", required = true)
        protected String sha1FileContent;
        @XmlElement(name = "Base64FileContent", required = true)
        protected String base64FileContent;
        @XmlElement(name = "FileURL", required = true)
        protected String fileURL;

        /**
         * Gets the value of the attachedTypeCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAttachedTypeCode() {
            return attachedTypeCode;
        }

        /**
         * Sets the value of the attachedTypeCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAttachedTypeCode(String value) {
            this.attachedTypeCode = value;
        }

        /**
         * Gets the value of the attachedTypeName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAttachedTypeName() {
            return attachedTypeName;
        }

        /**
         * Sets the value of the attachedTypeName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAttachedTypeName(String value) {
            this.attachedTypeName = value;
        }

        /**
         * Gets the value of the attachedDocName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAttachedDocName() {
            return attachedDocName;
        }

        /**
         * Sets the value of the attachedDocName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAttachedDocName(String value) {
            this.attachedDocName = value;
        }

        /**
         * Gets the value of the attachedNote property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAttachedNote() {
            return attachedNote;
        }

        /**
         * Sets the value of the attachedNote property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAttachedNote(String value) {
            this.attachedNote = value;
        }

        /**
         * Gets the value of the fullFileName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFullFileName() {
            return fullFileName;
        }

        /**
         * Sets the value of the fullFileName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFullFileName(String value) {
            this.fullFileName = value;
        }

        /**
         * Gets the value of the sha1FileContent property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSHA1FileContent() {
            return sha1FileContent;
        }

        /**
         * Sets the value of the sha1FileContent property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSHA1FileContent(String value) {
            this.sha1FileContent = value;
        }

        /**
         * Gets the value of the base64FileContent property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBase64FileContent() {
            return base64FileContent;
        }

        /**
         * Sets the value of the base64FileContent property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBase64FileContent(String value) {
            this.base64FileContent = value;
        }

        /**
         * Gets the value of the fileURL property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFileURL() {
            return fileURL;
        }

        /**
         * Sets the value of the fileURL property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFileURL(String value) {
            this.fileURL = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ChanelCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ChanelName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "chanelCode",
        "chanelName"
    })
    public static class Chanel {

        @XmlElement(name = "ChanelCode", required = true)
        protected String chanelCode;
        @XmlElement(name = "ChanelName", required = true)
        protected String chanelName;

        /**
         * Gets the value of the chanelCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChanelCode() {
            return chanelCode;
        }

        /**
         * Sets the value of the chanelCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChanelCode(String value) {
            this.chanelCode = value;
        }

        /**
         * Gets the value of the chanelName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChanelName() {
            return chanelName;
        }

        /**
         * Sets the value of the chanelName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChanelName(String value) {
            this.chanelName = value;
        }

    }

}
