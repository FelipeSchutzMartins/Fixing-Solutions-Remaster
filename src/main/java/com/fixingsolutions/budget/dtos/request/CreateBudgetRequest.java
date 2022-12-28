package com.fixingsolutions.budget.dtos.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CreateBudgetRequest {
    private BigDecimal value;
    private Integer expectedHours;
    private Boolean approved;
    private Integer createdById;
    private Integer customerId;
    private List<Integer> serviceTypeIds;
}
