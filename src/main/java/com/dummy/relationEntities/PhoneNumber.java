package com.dummy.relationEntities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class PhoneNumber {
    
    @Id
    @Column(name="ID_PHONE_NUMBER")
    private long id;
    
    @Column(name="number")
    private String number;
    
    @ManyToOne(fetch=FetchType.LAZY)
    private AddressBookEntry addressBookEntry;
}
