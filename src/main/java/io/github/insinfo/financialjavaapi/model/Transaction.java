package io.github.insinfo.financialjavaapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Transaction {

    private Long id;
    private String nsu;
    private String autorizationNumber;
    private LocalDateTime transactionDate;
    private BigDecimal amount;
    private TransactionTypeEnum type;
    private List<Link> links;

    public Transaction(TransactionTypeEnum type){
        this.type = type;
    }

    public void addLink(Link link) {
        if(links == null) links = new ArrayList<>();
        links.add(link);
    }
}