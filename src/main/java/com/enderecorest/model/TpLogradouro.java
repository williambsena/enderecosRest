package com.enderecorest.model;

import javax.persistence.ManyToOne;

/**
 *
 * @author Williamsena
 */
public  enum TpLogradouro {
    AL("ALAMEDA"), 
    AP("APARTAMENTO"),
    AV("AVENIDA"),
    BC("BECO"),
    BL("BLOCO"),
    CAM("CAMINHO"),
    ESCD("ESCADINHA"),
    EST("ESTAÇÃO"),
    ETR("ESTRADA"),
    FAZ("FAZENDA"),
    FORT("FORTALEZA"),
    GL("GALERIA"),
    LD("LADEIRA"),
    LGO("LARGO"),
    PÇA("PRAÇA"),
    PRQ("PARQUE"),
    PR("PRAIA"),
    QD("QUADRA"),
    KM("QUILÔMETRO"),
    QTA("QUINTA"),
    ROD("RODOVIA"),
    R("RUA"),
    SQD("SUPER  QUADRA"),
    TRV("TRAVESSA"),
    VD("VIADUTO"),
    VL("VILA");
    private final String sTpLogradouro;
    
    
    private TpLogradouro(String sTpLogradouro) {
        this.sTpLogradouro = sTpLogradouro;
    }//fim -> Logradouro()
    
    public String getTpLogradouro(){
        return sTpLogradouro;
    }//FIM -> getTpLogradouro()
    
    
}/* FIM -> Logrado  */
