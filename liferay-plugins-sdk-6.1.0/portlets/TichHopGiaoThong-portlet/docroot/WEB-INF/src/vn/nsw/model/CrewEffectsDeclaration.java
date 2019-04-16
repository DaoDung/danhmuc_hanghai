//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.16 at 04:03:14 PM ICT 
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
 *         &lt;element name="DocumentName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DocumentYear" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UserCreated" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NameOfShip" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IMONumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Callsign" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VoyageNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FlagStateOfShip" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NameOfMaster" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ListCrewEffects">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CrewEffectItem" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CrewEffectItemCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="FamilyName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="GivenName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="RankOrRatingCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="EffectsIneligibleForRelief" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SignPlace" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SignDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MasterSigned" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "imoNumber",
    "callsign",
    "voyageNumber",
    "flagStateOfShip",
    "nameOfMaster",
    "listCrewEffects",
    "signPlace",
    "signDate",
    "masterSigned"
})
@XmlRootElement(name = "CrewEffectsDeclaration")
public class CrewEffectsDeclaration {

    @XmlElement(name = "DocumentName", required = true)
    protected String documentName;
    @XmlElement(name = "DocumentYear", required = true)
    protected String documentYear;
    @XmlElement(name = "UserCreated", required = true)
    protected String userCreated;
    @XmlElement(name = "NameOfShip", required = true)
    protected String nameOfShip;
    @XmlElement(name = "IMONumber", required = true)
    protected String imoNumber;
    @XmlElement(name = "Callsign", required = true)
    protected String callsign;
    @XmlElement(name = "VoyageNumber", required = true)
    protected String voyageNumber;
    @XmlElement(name = "FlagStateOfShip", required = true)
    protected String flagStateOfShip;
    @XmlElement(name = "NameOfMaster", required = true)
    protected String nameOfMaster;
    @XmlElement(name = "ListCrewEffects", required = true)
    protected CrewEffectsDeclaration.ListCrewEffects listCrewEffects;
    @XmlElement(name = "SignPlace", required = true)
    protected String signPlace;
    @XmlElement(name = "SignDate", required = true)
    protected String signDate;
    @XmlElement(name = "MasterSigned", required = true)
    protected String masterSigned;

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
     * Gets the value of the imoNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMONumber() {
        return imoNumber;
    }

    /**
     * Sets the value of the imoNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMONumber(String value) {
        this.imoNumber = value;
    }

    /**
     * Gets the value of the callsign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallsign() {
        return callsign;
    }

    /**
     * Sets the value of the callsign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallsign(String value) {
        this.callsign = value;
    }

    /**
     * Gets the value of the voyageNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoyageNumber() {
        return voyageNumber;
    }

    /**
     * Sets the value of the voyageNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoyageNumber(String value) {
        this.voyageNumber = value;
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
     * Gets the value of the listCrewEffects property.
     * 
     * @return
     *     possible object is
     *     {@link CrewEffectsDeclaration.ListCrewEffects }
     *     
     */
    public CrewEffectsDeclaration.ListCrewEffects getListCrewEffects() {
        return listCrewEffects;
    }

    /**
     * Sets the value of the listCrewEffects property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrewEffectsDeclaration.ListCrewEffects }
     *     
     */
    public void setListCrewEffects(CrewEffectsDeclaration.ListCrewEffects value) {
        this.listCrewEffects = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="CrewEffectItem" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CrewEffectItemCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="FamilyName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="GivenName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="RankOrRatingCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="EffectsIneligibleForRelief" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "crewEffectItem"
    })
    public static class ListCrewEffects {

        @XmlElement(name = "CrewEffectItem", required = true)
        protected List<CrewEffectsDeclaration.ListCrewEffects.CrewEffectItem> crewEffectItem;

        /**
         * Gets the value of the crewEffectItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the crewEffectItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCrewEffectItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CrewEffectsDeclaration.ListCrewEffects.CrewEffectItem }
         * 
         * 
         */
        public List<CrewEffectsDeclaration.ListCrewEffects.CrewEffectItem> getCrewEffectItem() {
            if (crewEffectItem == null) {
                crewEffectItem = new ArrayList<CrewEffectsDeclaration.ListCrewEffects.CrewEffectItem>();
            }
            return this.crewEffectItem;
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
         *         &lt;element name="CrewEffectItemCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="FamilyName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="GivenName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="RankOrRatingCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="EffectsIneligibleForRelief" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "crewEffectItemCode",
            "familyName",
            "givenName",
            "rankOrRatingCode",
            "effectsIneligibleForRelief"
        })
        public static class CrewEffectItem {

            @XmlElement(name = "CrewEffectItemCode", required = true)
            protected String crewEffectItemCode;
            @XmlElement(name = "FamilyName", required = true)
            protected String familyName;
            @XmlElement(name = "GivenName", required = true)
            protected String givenName;
            @XmlElement(name = "RankOrRatingCode", required = true)
            protected String rankOrRatingCode;
            @XmlElement(name = "EffectsIneligibleForRelief", required = true)
            protected String effectsIneligibleForRelief;

            /**
             * Gets the value of the crewEffectItemCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCrewEffectItemCode() {
                return crewEffectItemCode;
            }

            /**
             * Sets the value of the crewEffectItemCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCrewEffectItemCode(String value) {
                this.crewEffectItemCode = value;
            }

            /**
             * Gets the value of the familyName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFamilyName() {
                return familyName;
            }

            /**
             * Sets the value of the familyName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFamilyName(String value) {
                this.familyName = value;
            }

            /**
             * Gets the value of the givenName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGivenName() {
                return givenName;
            }

            /**
             * Sets the value of the givenName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGivenName(String value) {
                this.givenName = value;
            }

            /**
             * Gets the value of the rankOrRatingCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRankOrRatingCode() {
                return rankOrRatingCode;
            }

            /**
             * Sets the value of the rankOrRatingCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRankOrRatingCode(String value) {
                this.rankOrRatingCode = value;
            }

            /**
             * Gets the value of the effectsIneligibleForRelief property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEffectsIneligibleForRelief() {
                return effectsIneligibleForRelief;
            }

            /**
             * Sets the value of the effectsIneligibleForRelief property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEffectsIneligibleForRelief(String value) {
                this.effectsIneligibleForRelief = value;
            }

        }

    }

}
