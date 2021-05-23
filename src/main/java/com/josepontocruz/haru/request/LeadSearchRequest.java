package com.josepontocruz.haru.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LeadSearchRequest {

    /*
     * Search by lead id
     */
    private Long id;

    /*
     * Search by name
     */
    private String name;

    /*
     * Search email
     */
    private String email;

    @Builder.Default
    private int pageNo = 0;

    @Builder.Default
    private int pageSize = 5;
}
