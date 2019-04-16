//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.06.22 at 05:43:08 AM ICT 
//


package vn.nsw.model.inland;

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
 *         &lt;element name="DocumentName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DocumentYear" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UserCreated" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NameOfShip" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ShipTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CallSign" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NameOfMaster" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PortOfArrivalCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PortHarbourCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PortRegionCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PortWharfCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TimeOfArrival" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LastPortOfCallCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ClearanceHeight" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ClearanceHeightUnit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ShownDraftxF" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UnitShownDraftxF" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ShownDraftxA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UnitShownDraftxA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TaxCodeOfShipownersAgents" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NameOfShipownersAgents" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ShipAgencyAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ShipAgencyPhone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ShipAgencyFax" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ShipAgencyEmail" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PurposeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="QuantityOfCargo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UnitQuantityofCargo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TypeOfCargo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NumberOfCrew" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NumberOfPassengers" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OtherPersons" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Remarks" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SignPlace" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SignDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MasterSigned" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CargoList" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Category" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Unit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "documentName",
    "documentYear",
    "userCreated",
    "nameOfShip",
    "shipTypeCode",
    "callSign",
    "nameOfMaster",
    "portOfArrivalCode",
    "portHarbourCode",
    "portRegionCode",
    "portWharfCode",
    "timeOfArrival",
    "lastPortOfCallCode",
    "clearanceHeight",
    "clearanceHeightUnit",
    "shownDraftxF",
    "unitShownDraftxF",
    "shownDraftxA",
    "unitShownDraftxA",
    "taxCodeOfShipownersAgents",
    "nameOfShipownersAgents",
    "shipAgencyAddress",
    "shipAgencyPhone",
    "shipAgencyFax",
    "shipAgencyEmail",
    "purposeCode",
    "quantityOfCargo",
    "unitQuantityofCargo",
    "typeOfCargo",
    "numberOfCrew",
    "numberOfPassengers",
    "otherPersons",
    "remarks",
    "signPlace",
    "signDate",
    "masterSigned",
    "cargoList"
})
@XmlRootElement(name = "InlandNoticeOfArrival")
public class InlandNoticeOfArrival {

    @XmlElement(name = "DocumentName", required = true)
    protected String documentName;
    @XmlElement(name = "DocumentYear", required = true)
    protected String documentYear;
    @XmlElement(name = "UserCreated", required = true)
    protected String userCreated;
    @XmlElement(name = "NameOfShip", required = true)
    protected String nameOfShip;
    @XmlElement(name = "ShipTypeCode", required = true)
    protected String shipTypeCode;
    @XmlElement(name = "CallSign", required = true)
    protected String callSign;
    @XmlElement(name = "NameOfMaster", required = true)
    protected String nameOfMaster;
    @XmlElement(name = "PortOfArrivalCode", required = true)
    protected String portOfArrivalCode;
    @XmlElement(name = "PortHarbourCode", required = true)
    protected String portHarbourCode;
    @XmlElement(name = "PortRegionCode", required = true)
    protected String portRegionCode;
    @XmlElement(name = "PortWharfCode", required = true)
    protected String portWharfCode;
    @XmlElement(name = "TimeOfArrival", required = true)
    protected String timeOfArrival;
    @XmlElement(name = "LastPortOfCallCode", required = true)
    protected String lastPortOfCallCode;
    @XmlElement(name = "ClearanceHeight", required = true)
    protected String clearanceHeight;
    @XmlElement(name = "ClearanceHeightUnit", required = true)
    protected String clearanceHeightUnit;
    @XmlElement(name = "ShownDraftxF", required = true)
    protected String shownDraftxF;
    @XmlElement(name = "UnitShownDraftxF", required = true)
    protected String unitShownDraftxF;
    @XmlElement(name = "ShownDraftxA", required = true)
    protected String shownDraftxA;
    @XmlElement(name = "UnitShownDraftxA", required = true)
    protected String unitShownDraftxA;
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
    @XmlElement(name = "PurposeCode", required = true)
    protected String purposeCode;
    @XmlElement(name = "QuantityOfCargo", required = true)
    protected String quantityOfCargo;
    @XmlElement(name = "UnitQuantityofCargo", required = true)
    protected String unitQuantityofCargo;
    @XmlElement(name = "TypeOfCargo", required = true)
    protected String typeOfCargo;
    @XmlElement(name = "NumberOfCrew", required = true)
    protected String numberOfCrew;
    @XmlElement(name = "NumberOfPassengers", required = true)
    protected String numberOfPassengers;
    @XmlElement(name = "OtherPersons", required = true)
    protected String otherPersons;
    @XmlElement(name = "Remarks", required = true)
    protected String remarks;
    @XmlElement(name = "SignPlace", required = true)
    protected String signPlace;
    @XmlElement(name = "SignDate", required = true)
    protected String signDate;
    @XmlElement(name = "MasterSigned", required = true)
    protected String masterSigned;
    @XmlElement(name = "CargoList", required = true)
    protected List<InlandNoticeOfArrival.CargoList> cargoList;

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
     * Gets the value of the userCreated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserCreated() {
        return userCreated;
    }

    /**
     * Sets the value of the userCreated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserCreated(String value) {
        this.userCreated = value;
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
     * Gets the value of the shipTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipTypeCode() {
        return shipTypeCode;
    }

    /**
     * Sets the value of the shipTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipTypeCode(String value) {
        this.shipTypeCode = value;
    }

    /**
     * Gets the value of the callSign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallSign() {
        return callSign;
    }

    /**
     * Sets the value of the callSign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallSign(String value) {
        this.callSign = value;
    }

    /**
     * Gets the value of the nameOfMaster property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameOfMaster() {
        return nameOfMaster;
    }

    /**
     * Sets the value of the nameOfMaster property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameOfMaster(String value) {
        this.nameOfMaster = value;
    }

    /**
     * Gets the value of the portOfArrivalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortOfArrivalCode() {
        return portOfArrivalCode;
    }

    /**
     * Sets the value of the portOfArrivalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortOfArrivalCode(String value) {
        this.portOfArrivalCode = value;
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
     * Gets the value of the portRegionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortRegionCode() {
        return portRegionCode;
    }

    /**
     * Sets the value of the portRegionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortRegionCode(String value) {
        this.portRegionCode = value;
    }

    /**
     * Gets the value of the portWharfCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortWharfCode() {
        return portWharfCode;
    }

    /**
     * Sets the value of the portWharfCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortWharfCode(String value) {
        this.portWharfCode = value;
    }

    /**
     * Gets the value of the timeOfArrival property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeOfArrival() {
        return timeOfArrival;
    }

    /**
     * Sets the value of the timeOfArrival property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeOfArrival(String value) {
        this.timeOfArrival = value;
    }

    /**
     * Gets the value of the lastPortOfCallCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastPortOfCallCode() {
        return lastPortOfCallCode;
    }

    /**
     * Sets the value of the lastPortOfCallCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastPortOfCallCode(String value) {
        this.lastPortOfCallCode = value;
    }

    /**
     * Gets the value of the clearanceHeight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClearanceHeight() {
        return clearanceHeight;
    }

    /**
     * Sets the value of the clearanceHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClearanceHeight(String value) {
        this.clearanceHeight = value;
    }

    /**
     * Gets the value of the clearanceHeightUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClearanceHeightUnit() {
        return clearanceHeightUnit;
    }

    /**
     * Sets the value of the clearanceHeightUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClearanceHeightUnit(String value) {
        this.clearanceHeightUnit = value;
    }

    /**
     * Gets the value of the shownDraftxF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShownDraftxF() {
        return shownDraftxF;
    }

    /**
     * Sets the value of the shownDraftxF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShownDraftxF(String value) {
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
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShownDraftxA() {
        return shownDraftxA;
    }

    /**
     * Sets the value of the shownDraftxA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShownDraftxA(String value) {
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
     * Gets the value of the purposeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurposeCode() {
        return purposeCode;
    }

    /**
     * Sets the value of the purposeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurposeCode(String value) {
        this.purposeCode = value;
    }

    /**
     * Gets the value of the quantityOfCargo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantityOfCargo() {
        return quantityOfCargo;
    }

    /**
     * Sets the value of the quantityOfCargo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantityOfCargo(String value) {
        this.quantityOfCargo = value;
    }

    /**
     * Gets the value of the unitQuantityofCargo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitQuantityofCargo() {
        return unitQuantityofCargo;
    }

    /**
     * Sets the value of the unitQuantityofCargo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitQuantityofCargo(String value) {
        this.unitQuantityofCargo = value;
    }

    /**
     * Gets the value of the typeOfCargo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeOfCargo() {
        return typeOfCargo;
    }

    /**
     * Sets the value of the typeOfCargo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeOfCargo(String value) {
        this.typeOfCargo = value;
    }

    /**
     * Gets the value of the numberOfCrew property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberOfCrew() {
        return numberOfCrew;
    }

    /**
     * Sets the value of the numberOfCrew property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfCrew(String value) {
        this.numberOfCrew = value;
    }

    /**
     * Gets the value of the numberOfPassengers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberOfPassengers() {
        return numberOfPassengers;
    }

    /**
     * Sets the value of the numberOfPassengers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfPassengers(String value) {
        this.numberOfPassengers = value;
    }

    /**
     * Gets the value of the otherPersons property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherPersons() {
        return otherPersons;
    }

    /**
     * Sets the value of the otherPersons property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherPersons(String value) {
        this.otherPersons = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarks(String value) {
        this.remarks = value;
    }

    /**
     * Gets the value of the signPlace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignPlace() {
        return signPlace;
    }

    /**
     * Sets the value of the signPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignPlace(String value) {
        this.signPlace = value;
    }

    /**
     * Gets the value of the signDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignDate() {
        return signDate;
    }

    /**
     * Sets the value of the signDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignDate(String value) {
        this.signDate = value;
    }

    /**
     * Gets the value of the masterSigned property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMasterSigned() {
        return masterSigned;
    }

    /**
     * Sets the value of the masterSigned property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMasterSigned(String value) {
        this.masterSigned = value;
    }

    /**
     * Gets the value of the cargoList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cargoList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCargoList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InlandNoticeOfArrival.CargoList }
     * 
     * 
     */
    public List<InlandNoticeOfArrival.CargoList> getCargoList() {
        if (cargoList == null) {
            cargoList = new ArrayList<InlandNoticeOfArrival.CargoList>();
        }
        return this.cargoList;
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
     *         &lt;element name="Category" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Unit" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "category",
        "type",
        "name",
        "description",
        "quantity",
        "unit"
    })
    public static class CargoList {

        @XmlElement(name = "Category", required = true)
        protected String category;
        @XmlElement(name = "Type", required = true)
        protected String type;
        @XmlElement(name = "Name", required = true)
        protected String name;
        @XmlElement(name = "Description", required = true)
        protected String description;
        @XmlElement(name = "Quantity", required = true)
        protected String quantity;
        @XmlElement(name = "Unit", required = true)
        protected String unit;

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
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the description property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescription() {
            return description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescription(String value) {
            this.description = value;
        }

        /**
         * Gets the value of the quantity property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQuantity() {
            return quantity;
        }

        /**
         * Sets the value of the quantity property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQuantity(String value) {
            this.quantity = value;
        }

        /**
         * Gets the value of the unit property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnit() {
            return unit;
        }

        /**
         * Sets the value of the unit property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnit(String value) {
            this.unit = value;
        }

    }

}
