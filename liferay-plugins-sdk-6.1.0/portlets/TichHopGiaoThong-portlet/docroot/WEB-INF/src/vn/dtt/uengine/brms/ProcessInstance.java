/**
 * ProcessInstance.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package vn.dtt.uengine.brms;

public class ProcessInstance  implements java.io.Serializable {
    private java.lang.String approvedFileUrl;

    private java.lang.String currep;

    private int dayLeft;

    private java.util.Calendar dayReturn;

    private long defid;

    private java.lang.String defname;

    private java.lang.String instName;

    private java.lang.String instid;

    private java.lang.String status;

    public ProcessInstance() {
    }

    public ProcessInstance(
           java.lang.String approvedFileUrl,
           java.lang.String currep,
           int dayLeft,
           java.util.Calendar dayReturn,
           long defid,
           java.lang.String defname,
           java.lang.String instName,
           java.lang.String instid,
           java.lang.String status) {
           this.approvedFileUrl = approvedFileUrl;
           this.currep = currep;
           this.dayLeft = dayLeft;
           this.dayReturn = dayReturn;
           this.defid = defid;
           this.defname = defname;
           this.instName = instName;
           this.instid = instid;
           this.status = status;
    }


    /**
     * Gets the approvedFileUrl value for this ProcessInstance.
     * 
     * @return approvedFileUrl
     */
    public java.lang.String getApprovedFileUrl() {
        return approvedFileUrl;
    }


    /**
     * Sets the approvedFileUrl value for this ProcessInstance.
     * 
     * @param approvedFileUrl
     */
    public void setApprovedFileUrl(java.lang.String approvedFileUrl) {
        this.approvedFileUrl = approvedFileUrl;
    }


    /**
     * Gets the currep value for this ProcessInstance.
     * 
     * @return currep
     */
    public java.lang.String getCurrep() {
        return currep;
    }


    /**
     * Sets the currep value for this ProcessInstance.
     * 
     * @param currep
     */
    public void setCurrep(java.lang.String currep) {
        this.currep = currep;
    }


    /**
     * Gets the dayLeft value for this ProcessInstance.
     * 
     * @return dayLeft
     */
    public int getDayLeft() {
        return dayLeft;
    }


    /**
     * Sets the dayLeft value for this ProcessInstance.
     * 
     * @param dayLeft
     */
    public void setDayLeft(int dayLeft) {
        this.dayLeft = dayLeft;
    }


    /**
     * Gets the dayReturn value for this ProcessInstance.
     * 
     * @return dayReturn
     */
    public java.util.Calendar getDayReturn() {
        return dayReturn;
    }


    /**
     * Sets the dayReturn value for this ProcessInstance.
     * 
     * @param dayReturn
     */
    public void setDayReturn(java.util.Calendar dayReturn) {
        this.dayReturn = dayReturn;
    }


    /**
     * Gets the defid value for this ProcessInstance.
     * 
     * @return defid
     */
    public long getDefid() {
        return defid;
    }


    /**
     * Sets the defid value for this ProcessInstance.
     * 
     * @param defid
     */
    public void setDefid(long defid) {
        this.defid = defid;
    }


    /**
     * Gets the defname value for this ProcessInstance.
     * 
     * @return defname
     */
    public java.lang.String getDefname() {
        return defname;
    }


    /**
     * Sets the defname value for this ProcessInstance.
     * 
     * @param defname
     */
    public void setDefname(java.lang.String defname) {
        this.defname = defname;
    }


    /**
     * Gets the instName value for this ProcessInstance.
     * 
     * @return instName
     */
    public java.lang.String getInstName() {
        return instName;
    }


    /**
     * Sets the instName value for this ProcessInstance.
     * 
     * @param instName
     */
    public void setInstName(java.lang.String instName) {
        this.instName = instName;
    }


    /**
     * Gets the instid value for this ProcessInstance.
     * 
     * @return instid
     */
    public java.lang.String getInstid() {
        return instid;
    }


    /**
     * Sets the instid value for this ProcessInstance.
     * 
     * @param instid
     */
    public void setInstid(java.lang.String instid) {
        this.instid = instid;
    }


    /**
     * Gets the status value for this ProcessInstance.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ProcessInstance.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProcessInstance)) return false;
        ProcessInstance other = (ProcessInstance) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.approvedFileUrl==null && other.getApprovedFileUrl()==null) || 
             (this.approvedFileUrl!=null &&
              this.approvedFileUrl.equals(other.getApprovedFileUrl()))) &&
            ((this.currep==null && other.getCurrep()==null) || 
             (this.currep!=null &&
              this.currep.equals(other.getCurrep()))) &&
            this.dayLeft == other.getDayLeft() &&
            ((this.dayReturn==null && other.getDayReturn()==null) || 
             (this.dayReturn!=null &&
              this.dayReturn.equals(other.getDayReturn()))) &&
            this.defid == other.getDefid() &&
            ((this.defname==null && other.getDefname()==null) || 
             (this.defname!=null &&
              this.defname.equals(other.getDefname()))) &&
            ((this.instName==null && other.getInstName()==null) || 
             (this.instName!=null &&
              this.instName.equals(other.getInstName()))) &&
            ((this.instid==null && other.getInstid()==null) || 
             (this.instid!=null &&
              this.instid.equals(other.getInstid()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getApprovedFileUrl() != null) {
            _hashCode += getApprovedFileUrl().hashCode();
        }
        if (getCurrep() != null) {
            _hashCode += getCurrep().hashCode();
        }
        _hashCode += getDayLeft();
        if (getDayReturn() != null) {
            _hashCode += getDayReturn().hashCode();
        }
        _hashCode += new Long(getDefid()).hashCode();
        if (getDefname() != null) {
            _hashCode += getDefname().hashCode();
        }
        if (getInstName() != null) {
            _hashCode += getInstName().hashCode();
        }
        if (getInstid() != null) {
            _hashCode += getInstid().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProcessInstance.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://brms.uengine.dtt.vn/", "processInstance"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approvedFileUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "approvedFileUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currep");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currep"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dayLeft");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dayLeft"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dayReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dayReturn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "instName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "instid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
