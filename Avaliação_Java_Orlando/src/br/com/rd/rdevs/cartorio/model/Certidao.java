package br.com.rd.rdevs.cartorio.model;

public abstract class Certidao {
	private static int identificador = 0;
    private int numeroRegistro = identificador;
    private String nomeObjeto;
    private String nomeDeclarante;
    private Certidao tipoCertidao;
    private String dataDeEmissao;
    private String nomeTabeliao;
    private String nomeCartorio;
 



public Certidao() {
    this.identificador+=1;
}
public Certidao(String nomeObjeto) {
    this.nomeObjeto = nomeObjeto;
    this.identificador+=1;
}

public Certidao(int numeroRegistro, String nomeObjeto, String nomeDeclarante, String nomeTabeliao, String dataDeEmissao, String nomeCartorio, Certidao tipoCertidao) {
    this.numeroRegistro = numeroRegistro;
    this.nomeObjeto = nomeObjeto;
    this.nomeDeclarante = nomeDeclarante;
    this.nomeTabeliao = nomeTabeliao;
    this.dataDeEmissao = dataDeEmissao;
    this.nomeCartorio = nomeCartorio;
    this.identificador+=1;
    
    if(tipoCertidao instanceof CertidaoNascimento){
    	CertidaoNascimento certidao = new CertidaoNascimento();
        this.tipoCertidao = certidao;
    }else if(tipoCertidao instanceof CertidaoCasamento){
    	CertidaoCasamento certidao = new CertidaoCasamento();
        this.tipoCertidao = certidao;
    }else {
    	CertidaoFalecimento certidao = new CertidaoFalecimento();
        this.tipoCertidao = certidao;
    }
}



public abstract Certidao gettipoCertidao() ;

public void settipoCertidao(Certidao certidao) {
    this.tipoCertidao = new CertidaoFalecimento();
}

public static int getIdentificador() {
    return identificador;
}

public int getNumeroRegistro() {
    return numeroRegistro;
}

public void setNumeroRegistro(int numeroRegistro) {
    this.numeroRegistro = numeroRegistro;
}

public String getNomeObjeto() {
    return nomeObjeto;
}

public void setNomeObjeto(String nomeObjeto) {
    this.nomeObjeto = nomeObjeto;
}

public String getNomeDeclarante() {
    return nomeObjeto;
}

public void setNomeDeclarante(String nomeDeclarante) {
    this.nomeDeclarante = nomeDeclarante;
}

public String getDataDeEmissao() {
    return dataDeEmissao;
}
public void setDataDeEmissao(String dataDeEmissao) {
    this.dataDeEmissao = dataDeEmissao;
}


public String getNomeTabeliao() {
    return nomeTabeliao;
}
public void setNomeTabeliao(String nomeTabeliao) {
    this.nomeTabeliao = nomeTabeliao;
}

public String getNomeCartorio() {
    return nomeTabeliao;
}
public void setNomeCartorio(String nomeCartorio) {
    this.nomeCartorio = nomeCartorio;
}
public boolean verificar(){

        if (){
                return true;
        }else {
            throw new IllegalArgumentException("Caractere inválido");
        }
}
