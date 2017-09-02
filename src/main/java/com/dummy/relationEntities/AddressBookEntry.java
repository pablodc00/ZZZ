package com.dummy.relationEntities;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class AddressBookEntry {
    @Id
    @Column(name="ID_ADDRESS_BOOK_ENTRY")
    private long id;
    @Column(name="name")
    private String name;
    @OneToMany(mappedBy="phoneNumbers")
    private List<PhoneNumber> phoneNumbers;
}
