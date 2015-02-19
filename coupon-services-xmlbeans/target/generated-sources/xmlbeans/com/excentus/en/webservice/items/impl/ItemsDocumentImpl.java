/*
 * An XML document type.
 * Localname: Items
 * Namespace: http://webservice.en.excentus.com/Items
 * Java type: com.excentus.en.webservice.items.ItemsDocument
 *
 * Automatically generated - do not modify.
 */
package com.excentus.en.webservice.items.impl;
/**
 * A document containing one Items(@http://webservice.en.excentus.com/Items) element.
 *
 * This is a complex type.
 */
public class ItemsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.excentus.en.webservice.items.ItemsDocument
{
    private static final long serialVersionUID = 1L;
    
    public ItemsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ITEMS$0 = 
        new javax.xml.namespace.QName("http://webservice.en.excentus.com/Items", "Items");
    
    
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
     * An XML Items(@http://webservice.en.excentus.com/Items).
     *
     * This is a complex type.
     */
    public static class ItemsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.excentus.en.webservice.items.ItemsDocument.Items
    {
        private static final long serialVersionUID = 1L;
        
        public ItemsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ITEM$0 = 
            new javax.xml.namespace.QName("http://webservice.en.excentus.com/Items", "Item");
        
        
        /**
         * Gets array of all "Item" elements
         */
        public com.excentus.en.webservice.items.ItemDocument.Item[] getItemArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ITEM$0, targetList);
                com.excentus.en.webservice.items.ItemDocument.Item[] result = new com.excentus.en.webservice.items.ItemDocument.Item[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Item" element
         */
        public com.excentus.en.webservice.items.ItemDocument.Item getItemArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.excentus.en.webservice.items.ItemDocument.Item target = null;
                target = (com.excentus.en.webservice.items.ItemDocument.Item)get_store().find_element_user(ITEM$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Item" element
         */
        public int sizeOfItemArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ITEM$0);
            }
        }
        
        /**
         * Sets array of all "Item" element
         */
        public void setItemArray(com.excentus.en.webservice.items.ItemDocument.Item[] itemArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(itemArray, ITEM$0);
            }
        }
        
        /**
         * Sets ith "Item" element
         */
        public void setItemArray(int i, com.excentus.en.webservice.items.ItemDocument.Item item)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.excentus.en.webservice.items.ItemDocument.Item target = null;
                target = (com.excentus.en.webservice.items.ItemDocument.Item)get_store().find_element_user(ITEM$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(item);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Item" element
         */
        public com.excentus.en.webservice.items.ItemDocument.Item insertNewItem(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.excentus.en.webservice.items.ItemDocument.Item target = null;
                target = (com.excentus.en.webservice.items.ItemDocument.Item)get_store().insert_element_user(ITEM$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Item" element
         */
        public com.excentus.en.webservice.items.ItemDocument.Item addNewItem()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.excentus.en.webservice.items.ItemDocument.Item target = null;
                target = (com.excentus.en.webservice.items.ItemDocument.Item)get_store().add_element_user(ITEM$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Item" element
         */
        public void removeItem(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ITEM$0, i);
            }
        }
    }
}
