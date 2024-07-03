package com.company;

import java.util.List;
import java.util.concurrent.TimeUnit;
import lombok.Getter;
import lombok.Setter;

public class CrptAPI {
    private final TimeUnit timeUnit;
    private final int requestLimit;
    private final String url;

    public CrptAPI(TimeUnit timeUnit, int requestLimit){
        this.timeUnit = timeUnit;
        this.requestLimit = requestLimit;
        this.url = "https://ismp.crpt.ru/api/v3/lk/documents/create";
    };


    public class Document {
        @Getter
        @Setter
        private Description description;
        @Getter
        @Setter
        private String doc_id;
        @Getter
        @Setter
        private String doc_status;
        @Getter
        @Setter
        private String doc_type;
        @Getter
        @Setter
        private boolean importRequest;
        @Getter
        @Setter
        private String owner_inn;
        @Getter
        @Setter
        private String participant_inn;
        @Getter
        @Setter
        private String producer_inn;
        @Getter
        @Setter
        private String production_date;
        @Getter
        @Setter
        private String production_type;
        @Getter
        @Setter
        private List<Product> products;
        @Getter
        @Setter
        private String reg_date;
        @Getter
        @Setter
        private String reg_number;
    }

    public class Product {
        @Getter
        @Setter
        private String certificate_document;
        @Getter
        @Setter
        private String certificate_document_date;
        @Getter
        @Setter
        private String certificate_document_number;
        @Getter
        @Setter
        private String owner_inn;
        @Getter
        @Setter
        private String producer_inn;
        @Getter
        @Setter
        private String production_date;
        @Getter
        @Setter
        private String tnved_code;
        @Getter
        @Setter
        private String uit_code;
        @Getter
        @Setter
        private String uitu_code;
    }

    public class Description {
        @Getter
        @Setter
        private String participantInn;
    }

}
