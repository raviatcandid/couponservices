/*
 * An XML document type.
 * Localname: Details
 * Namespace: http://request.issuance.webservice.en.excentus.com/ENWebRewardIssuanceService/RewardIssuanceRequest
 * Java type: com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.DetailsDocument
 *
 * Automatically generated - do not modify.
 */
package com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.impl;
/**
 * A document containing one Details(@http://request.issuance.webservice.en.excentus.com/ENWebRewardIssuanceService/RewardIssuanceRequest) element.
 *
 * This is a complex type.
 */
public class DetailsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.DetailsDocument
{
    private static final long serialVersionUID = 1L;
    
    public DetailsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DETAILS$0 = 
        new javax.xml.namespace.QName("http://request.issuance.webservice.en.excentus.com/ENWebRewardIssuanceService/RewardIssuanceRequest", "Details");
    
    
    /**
     * Gets the "Details" element
     */
    public com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.DetailsDocument.Details getDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.DetailsDocument.Details target = null;
            target = (com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.DetailsDocument.Details)get_store().find_element_user(DETAILS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Details" element
     */
    public void setDetails(com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.DetailsDocument.Details details)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.DetailsDocument.Details target = null;
            target = (com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.DetailsDocument.Details)get_store().find_element_user(DETAILS$0, 0);
            if (target == null)
            {
                target = (com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.DetailsDocument.Details)get_store().add_element_user(DETAILS$0);
            }
            target.set(details);
        }
    }
    
    /**
     * Appends and returns a new empty "Details" element
     */
    public com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.DetailsDocument.Details addNewDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.DetailsDocument.Details target = null;
            target = (com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.DetailsDocument.Details)get_store().add_element_user(DETAILS$0);
            return target;
        }
    }
    /**
     * An XML Details(@http://request.issuance.webservice.en.excentus.com/ENWebRewardIssuanceService/RewardIssuanceRequest).
     *
     * This is a complex type.
     */
    public static class DetailsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.DetailsDocument.Details
    {
        private static final long serialVersionUID = 1L;
        
        public DetailsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ITEMS$0 = 
            new javax.xml.namespace.QName("http://webservice.en.excentus.com/Items", "Items");
        private static final javax.xml.namespace.QName OFFERS$2 = 
            new javax.xml.namespace.QName("http://webservice.en.excentus.com/Offers", "Offers");
        
        
        /**
         * Gets the "Items" element
         */
        public com.excentus.en.webservice.items.ItemsDocument.Items getItems()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.excentus.en.webservice.items.ItemsDocument.Items target = null;
                target = (com.excentus.en.webservice.items.ItemsDocument.Items)get_store().find_element_user(ITEMS$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Items" element
         */
        public boolean isSetItems()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ITEMS$0) != 0;
            }
        }
        
        /**
         * Sets the "Items" element
         */
        public void setItems(com.excentus.en.webservice.items.ItemsDocument.Items items)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.excentus.en.webservice.items.ItemsDocument.Items target = null;
                target = (com.excentus.en.webservice.items.ItemsDocument.Items)get_store().find_element_user(ITEMS$0, 0);
                if (target == null)
                {
                    target = (com.excentus.en.webservice.items.ItemsDocument.Items)get_store().add_element_user(ITEMS$0);
                }
                target.set(items);
            }
        }
        
        /**
         * Appends and returns a new empty "Items" element
         */
        public com.excentus.en.webservice.items.ItemsDocument.Items addNewItems()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.excentus.en.webservice.items.ItemsDocument.Items target = null;
                target = (com.excentus.en.webservice.items.ItemsDocument.Items)get_store().add_element_user(ITEMS$0);
                return target;
            }
        }
        
        /**
         * Unsets the "Items" element
         */
        public void unsetItems()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ITEMS$0, 0);
            }
        }
        
        /**
         * Gets the "Offers" element
         */
        public com.excentus.en.webservice.offers.OffersDocument.Offers getOffers()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.excentus.en.webservice.offers.OffersDocument.Offers target = null;
                target = (com.excentus.en.webservice.offers.OffersDocument.Offers)get_store().find_element_user(OFFERS$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Offers" element
         */
        public boolean isSetOffers()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OFFERS$2) != 0;
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
                target = (com.excentus.en.webservice.offers.OffersDocument.Offers)get_store().find_element_user(OFFERS$2, 0);
                if (target == null)
                {
                    target = (com.excentus.en.webservice.offers.OffersDocument.Offers)get_store().add_element_user(OFFERS$2);
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
                target = (com.excentus.en.webservice.offers.OffersDocument.Offers)get_store().add_element_user(OFFERS$2);
                return target;
            }
        }
        
        /**
         * Unsets the "Offers" element
         */
        public void unsetOffers()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OFFERS$2, 0);
            }
        }
    }
}
