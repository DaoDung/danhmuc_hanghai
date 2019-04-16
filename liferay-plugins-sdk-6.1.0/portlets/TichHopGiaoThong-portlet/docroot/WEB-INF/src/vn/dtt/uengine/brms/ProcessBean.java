/**
 * ProcessBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package vn.dtt.uengine.brms;

public class ProcessBean  implements java.io.Serializable {
    private long defId;

    private java.lang.String defName;

    private byte isDeleted;

    private byte isVisibled;

    private long parentFolder;

    private long productionId;

    public ProcessBean() {
    }

    public ProcessBean(
           long defId,
           java.lang.String defName,
           byte isDeleted,
           byte isVisibled,
           long parentFolder,
           long productionId) {
           this.defId = defId;
           this.defName = defName;
           this.isDeleted = isDeleted;
           this.isVisibled = isVisibled;
           this.parentFolder = parentFolder;
           this.productionId = productionId;
    }


    /**
     * Gets the defId value for this ProcessBean.
     * 
     * @return defId
     */
    public long getDefId() {
        return defId;
    }


    /**
     * Sets the defId value for this ProcessBean.
     * 
     * @param defId
     */
    public void setDefId(long defId) {
        this.defId = defId;
    }


    /**
     * Gets the defName value for this ProcessBean.
     * 
     * @return defName
     */
    public java.lang.String getDefName() {
        return defName;
    }


    /**
     * Sets the defName value for this ProcessBean.
     * 
     * @param defName
     */
    public void setDefName(java.lang.String defName) {
        this.defName = defName;
    }


    /**
     * Gets the isDeleted value for this ProcessBean.
     * 
     * @return isDeleted
     */
    public byte getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this ProcessBean.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(byte isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the isVisibled value for this ProcessBean.
     * 
     * @return isVisibled
     */
    public byte getIsVisibled() {
        return isVisibled;
    }


    /**
     * Sets the isVisibled value for this ProcessBean.
     * 
     * @param isVisibled
     */
    public void setIsVisibled(byte isVisibled) {
        this.isVisibled = isVisibled;
    }


    /**
     * Gets the parentFolder value for this ProcessBean.
     * 
     * @return parentFolder
     */
    public long getParentFolder() {
        return parentFolder;
    }


    /**
     * Sets the parentFolder value for this ProcessBean.
     * 
     * @param parentFolder
     */
    public void setParentFolder(long parentFolder) {
        this.parentFolder = parentFolder;
    }


    /**
     * Gets the productionId value for this ProcessBean.
     * 
     * @return productionId
     */
    public long getProductionId() {
        return productionId;
    }


    /**
     * Sets the productionId value for this ProcessBean.
     * 
     * @param productionId
     */
    public void setProductionId(long productionId) {
        this.productionId = productionId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProcessBean)) return false;
        ProcessBean other = (ProcessBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.defId == other.getDefId() &&
            ((this.defName==null && other.getDefName()==null) || 
             (this.defName!=null &&
              this.defName.equals(other.getDefName()))) &&
            this.isDeleted == other.getIsDeleted() &&
            this.isVisibled == other.getIsVisibled() &&
            this.parentFolder == other.getParentFolder() &&
            this.productionId == other.getProductionId();
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
        _hashCode += new Long(getDefId()).hashCode();
        if (getDefName() != null) {
            _hashCode += getDefName().hashCode();
        }
        _hashCode += getIsDeleted();
        _hashCode += getIsVisibled();
        _hashCode += new Long(getParentFolder()).hashCode();
        _hashCode += new Long(getProductionId()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProcessBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://brms.uengine.dtt.vn/", "processBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDeleted");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isDeleted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "byte"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isVisibled");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isVisibled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "byte"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentFolder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parentFolder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
