/*Copyright (c) 2015-2016 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/

package com.test_settings.library;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;


import java.util.Arrays;

import javax.persistence.Transient;
import javax.persistence.CascadeType;
import javax.persistence.UniqueConstraint;




/**
 * Book generated by hbm2java
 */
@Entity
@Table(name="`BOOK`"
    ,schema="LIBRARY"
)
public class Book  implements java.io.Serializable
 {


private Integer id;
private String author;
private String description;
private String imageUrl;
private String isbn;
private String publisher;
private Integer rating;
private Integer readStatus;
private String tenantid;
private String title;

    public Book() {
    }



     @Id @GeneratedValue(strategy=IDENTITY)

    

    @Column(name="`ID`", nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    

    @Column(name="`AUTHOR`")
    public String getAuthor() {
        return this.author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }

    

    @Column(name="`DESCRIPTION`", length=2000)
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    

    @Column(name="`IMAGE_URL`")
    public String getImageUrl() {
        return this.imageUrl;
    }
    
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    

    @Column(name="`ISBN`")
    public String getIsbn() {
        return this.isbn;
    }
    
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    

    @Column(name="`PUBLISHER`")
    public String getPublisher() {
        return this.publisher;
    }
    
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    

    @Column(name="`RATING`")
    public Integer getRating() {
        return this.rating;
    }
    
    public void setRating(Integer rating) {
        this.rating = rating;
    }

    

    @Column(name="`READ_STATUS`")
    public Integer getReadStatus() {
        return this.readStatus;
    }
    
    public void setReadStatus(Integer readStatus) {
        this.readStatus = readStatus;
    }

    

    @Column(name="`TENANTID`")
    public String getTenantid() {
        return this.tenantid;
    }
    
    public void setTenantid(String tenantid) {
        this.tenantid = tenantid;
    }

    

    @Column(name="`TITLE`", nullable=false)
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }



public boolean equals(Object o) {
         if (this == o)
         return true;
		 if ( (o == null ) )
		 return false;
		 if ( !(o instanceof Book) )
		 return false;

		 Book that = ( Book ) o;

		 return ( (this.getId()==that.getId()) || ( this.getId()!=null && that.getId()!=null && this.getId().equals(that.getId()) ) );

   }

   public int hashCode() {
         int result = 17;

         result = 37 * result + ( getId() == null ? 0 : this.getId().hashCode() );

         return result;
     }


}

