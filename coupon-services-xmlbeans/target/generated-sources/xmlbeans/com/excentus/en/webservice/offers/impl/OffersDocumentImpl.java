/*
 * An XML document type.
 * Localname: Offers
 * Namespace: http://webservice.en.excentus.com/Offers
 * Java type: com.excentus.en.webservice.offers.OffersDocument
 *
 * Automatically generated - do not modify.
 */
package com.excentus.en.webservice.offers.impl;
/**
 * A document containing one Offers(@http://webservice.en.excentus.com/Offers) element.
 *
 * This is a complex type.
 */
public class OffersDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.excentus.en.webservice.offers.OffersDocument
{
    private static final long serialVersionUID = 1L;
    
    public OffersDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OFFERS$0 = 
        new javax.xml.namespace.QName("http://webservice.en.excentus.com/Offers", "Offers");
    
    
    /**
     * Gets the "Offers" element
     */
    public com.excentus.en.webservice.offers.OffersDocument.Offers getOffers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.excentus.en.webservice.offers.OffersDocument.Offers target = null;
            target = (com.excentus.en.webservice.offers.OffersDocument.Offers)get_store().find_element_user(OFFERS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Offers" element
     */
    public void setOffers(com.excentus.en.webservice.offers.OffersDocument.Offers offers)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.excentus.en.webservice.offers.OffersDocument.Offers target = null;
            target = (com.excentus.en.webservice.offers.OffersDocument.Offers)get_store().find_element_user(OFFERS$0, 0);
            if (target == null)
            {
                target = (com.excentus.en.webservice.offers.OffersDocument.Offers)get_store().add_element_user(OFFERS$0);
            }
            target.set(offers);
        }
    }
    
    /**
     * Appends and returns a new empty "Offers" element
     */
    public com.excentus.en.webservice.offers.OffersDocument.Offers addNewOffers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.excentus.en.webservice.offers.OffersDocument.Offers target = null;
            target = (com.excentus.en.webservice.offers.OffersDocument.Offers)get_store().add_element_user(OFFERS$0);
            return target;
        }
    }
    /**
     * An XML Offers(@http://webservice.en.excentus.com/Offers).
     *
     * This is a complex type.
     */
    public static class OffersImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.excentus.en.webservice.offers.OffersDocument.Offers
    {
        private static final long serialVersionUID = 1L;
        
        public OffersImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName OFFER$0 = 
            new javax.xml.namespace.QName("http://webservice.en.excentus.com/Offers", "Offer");
        private static final javax.xml.namespace.QName BASKETOFFER$2 = 
            new javax.xml.namespace.QName("http://webservice.en.excentus.com/Offers", "BasketOffer");
        private static final javax.xml.namespace.QName MVPOFFER$4 = 
            new javax.xml.namespace.QName("http://webservice.en.excentus.com/Offers", "MVPOffer");
        
        
        /**
         * Gets array of all "Offer" elements
         */
        public com.excentus.en.webservice.offers.OfferDocument.Offer[] getOfferArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(OFFER$0, targetList);
                com.excentus.en.webservice.offers.OfferDocument.Offer[] result = new com.excentus.en.webservice.offers.OfferDocument.Offer[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Offer" element
         */
        public com.excentus.en.webservice.offers.OfferDocument.Offer getOfferArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.excentus.en.webservice.offers.OfferDocument.Offer target = null;
                target = (com.excentus.en.webservice.offers.OfferDocument.Offer)get_store().find_element_user(OFFER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Offer" element
         */
        public int sizeOfOfferArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OFFER$0);
            }
        }
        
        /**
         * Sets array of all "Offer" element
         */
        public void setOfferArray(com.excentus.en.webservice.offers.OfferDocument.Offer[] offerArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(offerArray, OFFER$0);
            }
        }
        
        /**
         * Sets ith "Offer" element
         */
        public void setOfferArray(int i, com.excentus.en.webservice.offers.OfferDocument.Offer offer)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.excentus.en.webservice.offers.OfferDocument.Offer target = null;
                target = (com.excentus.en.webservice.offers.OfferDocument.Offer)get_store().find_element_user(OFFER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(offer);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Offer" element
         */
        public com.excentus.en.webservice.offers.OfferDocument.Offer insertNewOffer(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.excentus.en.webservice.offers.OfferDocument.Offer target = null;
                target = (com.excentus.en.webservice.offers.OfferDocument.Offer)get_store().insert_element_user(OFFER$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Offer" element
         */
        public com.excentus.en.webservice.offers.OfferDocument.Offer addNewOffer()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.excentus.en.webservice.offers.OfferDocument.Offer target = null;
                target = (com.excentus.en.webservice.offers.OfferDocument.Offer)get_store().add_element_user(OFFER$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Offer" element
         */
        public void removeOffer(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OFFER$0, i);
            }
        }
        
        /**
         * Gets array of all "BasketOffer" elements
         */
        public com.excentus.en.webservice.offers.BasketOfferDocument.BasketOffer[] getBasketOfferArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(BASKETOFFER$2, targetList);
                com.excentus.en.webservice.offers.BasketOfferDocument.BasketOffer[] result = new com.excentus.en.webservice.offers.BasketOfferDocument.BasketOffer[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "BasketOffer" element
         */
        public com.excentus.en.webservice.offers.BasketOfferDocument.BasketOffer getBasketOfferArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.excentus.en.webservice.offers.BasketOfferDocument.BasketOffer target = null;
                target = (com.excentus.en.webservice.offers.BasketOfferDocument.BasketOffer)get_store().find_element_user(BASKETOFFER$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "BasketOffer" element
         */
        public int sizeOfBasketOfferArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BASKETOFFER$2);
            }
        }
        
        /**
         * Sets array of all "BasketOffer" element
         */
        public void setBasketOfferArray(com.excentus.en.webservice.offers.BasketOfferDocument.BasketOffer[] basketOfferArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(basketOfferArray, BASKETOFFER$2);
            }
        }
        
        /**
         * Sets ith "BasketOffer" element
         */
        public void setBasketOfferArray(int i, com.excentus.en.webservice.offers.BasketOfferDocument.BasketOffer basketOffer)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.excentus.en.webservice.offers.BasketOfferDocument.BasketOffer target = null;
                target = (com.excentus.en.webservice.offers.BasketOfferDocument.BasketOffer)get_store().find_element_user(BASKETOFFER$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(basketOffer);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "BasketOffer" element
         */
        public com.excentus.en.webservice.offers.BasketOfferDocument.BasketOffer insertNewBasketOffer(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.excentus.en.webservice.offers.BasketOfferDocument.BasketOffer target = null;
                target = (com.excentus.en.webservice.offers.BasketOfferDocument.BasketOffer)get_store().insert_element_user(BASKETOFFER$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "BasketOffer" element
         */
        public com.excentus.en.webservice.offers.BasketOfferDocument.BasketOffer addNewBasketOffer()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.excentus.en.webservice.offers.BasketOfferDocument.BasketOffer target = null;
                target = (com.excentus.en.webservice.offers.BasketOfferDocument.BasketOffer)get_store().add_element_user(BASKETOFFER$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "BasketOffer" element
         */
        public void removeBasketOffer(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BASKETOFFER$2, i);
            }
        }
        
        /**
         * Gets array of all "MVPOffer" elements
         */
        public com.excentus.en.webservice.offers.MVPOfferDocument.MVPOffer[] getMVPOfferArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(MVPOFFER$4, targetList);
                com.excentus.en.webservice.offers.MVPOfferDocument.MVPOffer[] result = new com.excentus.en.webservice.offers.MVPOfferDocument.MVPOffer[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "MVPOffer" element
         */
        public com.excentus.en.webservice.offers.MVPOfferDocument.MVPOffer getMVPOfferArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.excentus.en.webservice.offers.MVPOfferDocument.MVPOffer target = null;
                target = (com.excentus.en.webservice.offers.MVPOfferDocument.MVPOffer)get_store().find_element_user(MVPOFFER$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "MVPOffer" element
         */
        public int sizeOfMVPOfferArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MVPOFFER$4);
            }
        }
        
        /**
         * Sets array of all "MVPOffer" element
         */
        public void setMVPOfferArray(com.excentus.en.webservice.offers.MVPOfferDocument.MVPOffer[] mvpOfferArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(mvpOfferArray, MVPOFFER$4);
            }
        }
        
        /**
         * Sets ith "MVPOffer" element
         */
        public void setMVPOfferArray(int i, com.excentus.en.webservice.offers.MVPOfferDocument.MVPOffer mvpOffer)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.excentus.en.webservice.offers.MVPOfferDocument.MVPOffer target = null;
                target = (com.excentus.en.webservice.offers.MVPOfferDocument.MVPOffer)get_store().find_element_user(MVPOFFER$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(mvpOffer);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "MVPOffer" element
         */
        public com.excentus.en.webservice.offers.MVPOfferDocument.MVPOffer insertNewMVPOffer(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.excentus.en.webservice.offers.MVPOfferDocument.MVPOffer target = null;
                target = (com.excentus.en.webservice.offers.MVPOfferDocument.MVPOffer)get_store().insert_element_user(MVPOFFER$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "MVPOffer" element
         */
        public com.excentus.en.webservice.offers.MVPOfferDocument.MVPOffer addNewMVPOffer()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.excentus.en.webservice.offers.MVPOfferDocument.MVPOffer target = null;
                target = (com.excentus.en.webservice.offers.MVPOfferDocument.MVPOffer)get_store().add_element_user(MVPOFFER$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "MVPOffer" element
         */
        public void removeMVPOffer(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MVPOFFER$4, i);
            }
        }
    }
}
