package com.automata.testing.framework.post.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity implements Serializable{
	 /**
     * Serial Version Id.
     */
    private static final long serialVersionUID = -592959605537059071L;

    // -------------------------------------- private attributes

    /**
     * The post Id.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    private String firstName;
    
    private String lastName;
    
    private String emailAddress;
}
