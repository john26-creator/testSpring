package com.automata.testing.framework.post.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDTO {

	 /**
     * The user Id.
     */
    private Integer userId;

    private String firstName;
    
    private String lastName;
    
    private String emailAddress;
}
